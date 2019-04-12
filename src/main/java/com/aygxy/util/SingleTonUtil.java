package com.aygxy.util;

/**
 * @Description: 单例模式测试
 * @Author: xmf
 * @apiNote 是一种对象创建模式，用于产生一个对象的实例。可以确保系统中一个类只产生一个实例。
 * 在面对复杂序列化以及反射攻击时，都能防止多次实例化。被称为单例模式的最佳实现。
 * @Date: 2019/4/9-22:54
 */
public enum SingleTonUtil {

    INSTANCE;

    public String test() {
        System.out.println("hello world");
        return null;
    }

    /*
    饿汉模式:类加载时初始化实例
    */
    public static class SingleTon1{

        private SingleTon1() {}

        private static SingleTon1 instance = new SingleTon1();

        public static SingleTon1 getInstance() {
            return instance;
        }
    }
    /*
    IoDH(initialization on demand holder) 为一种延迟加载且线程安全的单例模式实现方式。这种方式的实现依赖于JVM对类加载过程中初始化阶段的执行。
    当SingleTon类被JVM加载时，由于这个类没有其他静态属性，其初始化过程会顺利完成。但是内部静态类Holder直到调用getInstance()时才会被初始化。
    当Holder第一次被执行时，JVM会加载并初始化该类。由于Holder含有静态方法INSTANCE，因此会一并初始化INSTANCE。JLS保证了类的初始化阶段是连续的。
    这样，所有后序的并发调用getInstance()都会返回一个正确初始化的INSTANCE而不会有额外同步开销。
    缺陷：任何初始化失败都会导致单例类不可用。也就是说，IoDH这种实现方式只能用于能保证初始化不会失败的情况。
    */
    public static class SingleTon2{

        private SingleTon2() {}

        private static class Holder {
            private static final SingleTon2 INSTANCE = new SingleTon2();
        }

        public static SingleTon2 getInstance() {
            return Holder.INSTANCE;
        }
    }
    /*
    双重检测机制:在new操作之前加锁，仍然不能改变两个线程new两个实例，
    只不过是将其new操作在时间上进行了分离。
    此时线程1正在对instance进行实例化；而线程2会存在两种结局，其一是线程1还未创建完，进入下一行等待锁；其二是线程1**“貌似”**已经创建完成，线程1返回instance。
    看似并没有什么问题，但问题就出现在这个貌似上，其实线程2并不知道线程1是否完成了创建，反正结果就是instance != null，线程2继续执行。
    指令排序：因为 instance != null 并不能代表instance完成了创建。
    - 1. allocate memory：分配内存
    - 2. initialize the object Singleton into the allocated memory：初始化对象
    - 3. assign allocated memory to instance ref：设置instance指向刚分配的内存地址，此时instance != null
    但这三条指令顺序，有可能会经过JVM和CPU的优化，指令重排成下面的顺序：1→3→2
    此时线程1执行了指令1和3，此刻instance != null，那么线程2走到绿色的箭头上，判空不成立，获取到“半成品”的instance。
    */
    public static class Singleton {
        private Singleton() {} // 条件 1

        private static Singleton instance; // 条件 2，默认为null

        public static Singleton getInstance() { // 条件 3
            if (instance == null) {//线程1走到此处
                synchronized (Singleton.class) {
                    if (instance == null){//线程2走到此处
                        instance = new Singleton();
                    }
                }
            }
            return instance;
        }
    }


}
