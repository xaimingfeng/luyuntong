package com.aygxy.xmf.jpa.bean;

import com.aygxy.xmf.jpa.entity.Employee;
import lombok.Builder;
import lombok.Data;

/**
 * @Description: User映射实体
 * @Author: Guoyongzheng
 * @Date: 2019/4/10-21:31
 */

@Data
@Builder
public class UserDTO {
    private String id;
    private String age;
    private String name;
    private String password;
    private Employee employee;
    private String createTime;
}
