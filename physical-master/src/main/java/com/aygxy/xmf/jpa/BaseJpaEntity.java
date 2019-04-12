package com.aygxy.xmf.jpa;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.Date;

/**
 * @Description: jpa实体对象基类
 * @Author: xmf
 * @Date: 2019/4/7-13:24
 */
@MappedSuperclass
@Setter
@Getter
public abstract class BaseJpaEntity implements Serializable {
    private static final long serialVersionUID = -262786556790895107L;

    @Id
    @GenericGenerator(name = "idGenerator", strategy = "com.aygxy.xmf.util.IdGenerator")
    @GeneratedValue(generator = "idGenerator")
    @Column(nullable = false)
    private String id;

    @Transient
    private Long version;

    @CreatedDate
    private Date createTime;

    @LastModifiedDate
    private Date updateTime;
}
