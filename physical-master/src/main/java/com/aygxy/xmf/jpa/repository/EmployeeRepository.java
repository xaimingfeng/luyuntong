package com.aygxy.xmf.jpa.repository;

import com.aygxy.xmf.jpa.BaseRepository;
import com.aygxy.xmf.jpa.entity.Employee;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

/**
 * @Description: 职员信息数据仓库
 * @Author: xmf
 * @Date: 2019/4/7-16:28
 */
@Repository
public interface EmployeeRepository extends BaseRepository<Employee,String>,QuerydslPredicateExecutor<Employee> {
}
