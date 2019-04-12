package com.aygxy.xmf.service;

import com.aygxy.xmf.base.Result;
import com.aygxy.xmf.jpa.entity.User;
import org.springframework.data.domain.Pageable;


/**
 * @Description: 用户服务类
 * @Author: Guoyongzheng
 * @Date: 2019/4/8-0:12
 */
public interface UserService {

    //添加或修改用户
    Result addByOne(User userEntity);
    //删除用户
    Result deleteByOne(String uid);
    //查询用户
    Result queryById(String uid);

    Result update(String uid, User user);

    Result findAllUserDto(Pageable pageable);

    Result dynamicQueryUser(Pageable pageable,User user);

}
