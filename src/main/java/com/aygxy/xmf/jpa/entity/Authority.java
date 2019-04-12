package com.aygxy.xmf.jpa.entity;

import com.aygxy.xmf.jpa.BaseNamedJpaEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * @Description: 权限类设置
 * @Author: xmf
 * @Date: 2019/4/8-23:34
 */
@Getter
@Setter
@Entity
@Table(name = "physical_authority_info")
public class Authority extends BaseNamedJpaEntity {

    @ManyToMany
    @JoinTable(name="authority_menu_info", joinColumns=@JoinColumn(name="menu_id"), inverseJoinColumns=@JoinColumn(name="authority_id"))
    private List<Menu> menus;

    @ManyToMany(mappedBy = "authorityList")
    private List<User> userList;
}
