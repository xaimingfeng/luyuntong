package com.aygxy.xmf.jpa.repository;

import com.aygxy.xmf.jpa.BaseRepository;
import com.aygxy.xmf.jpa.entity.Customer;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

/**
 * @Description: 客户数据仓库
 * @Author: xmf
 * @Date: 2019/4/7-16:11
 */
@Repository
public interface CustomerRepository extends BaseRepository<Customer,String>,QuerydslPredicateExecutor<Customer> {

}
