package com.aygxy.xmf.jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * @Description: 实体基类
 * @Author: xmf
 * @Date: 2019/4/7-13:24
 */
@MappedSuperclass
@Setter
@Getter
public abstract class BaseNamedJpaEntity extends BaseJpaEntity {

    @Column(name = "name",columnDefinition = "varchar(50)")
    private String name;
}
