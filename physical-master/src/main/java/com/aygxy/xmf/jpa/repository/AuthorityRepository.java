package com.aygxy.xmf.jpa.repository;

import com.aygxy.xmf.jpa.BaseRepository;
import com.aygxy.xmf.jpa.entity.Authority;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

/**
 * @Description: 权限数据仓库
 * @Author: xmf
 * @Date: 2019/4/8-23:37
 */
public interface AuthorityRepository extends BaseRepository<Authority,String>,QuerydslPredicateExecutor<Authority> {
}
