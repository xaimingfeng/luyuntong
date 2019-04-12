package com.aygxy.xmf.jpa.repository;

import com.aygxy.xmf.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

/**
 * @Description: user实体数据查询
 * @Author: xmf
 * @Date: 2019/4/7-12:53
 */
@Repository
public interface UserRepository extends JpaRepository<User,String>,QuerydslPredicateExecutor<User> {

}
