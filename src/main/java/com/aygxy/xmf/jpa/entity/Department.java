package com.aygxy.xmf.jpa.entity;

import com.aygxy.xmf.jpa.BaseNamedJpaEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * @Description: 公司部门实体
 * @Author: xmf
 * @Date: 2019/4/6-15:13
 */

@Getter
@Setter
@Entity
@Table(name = "physical_department_info")
public class Department extends BaseNamedJpaEntity {
    //部门id //部门名称
    //部门描述
    @Column(name = "descrition",columnDefinition = "varchar(50)")
    private String descrition;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
    private List<Employee> employeeList;

}
