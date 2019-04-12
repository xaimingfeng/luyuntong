package com.aygxy.jpa.entity;

import com.aygxy.jpa.BaseNamedJpaEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * @Description: 菜单实体类
 * @Author: xmf
 * @Date: 2019/4/6-15:23
 */
@Getter
@Setter
@Entity
@Table(name = "physical_menu_info")
public class Menu extends BaseNamedJpaEntity {
    //菜单id  //菜单名称

    //菜单描述
    @Column(name = "descrition",columnDefinition = "varchar(50)")
    private String descrition;

    @ManyToMany(mappedBy = "menus")
    private List<Authority> authoritys;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="childen_id")
    private Menu parent;

    @OneToMany(mappedBy = "parent")
    private Set<Menu> children;

}
