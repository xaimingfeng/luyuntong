package com.aygxy.xmf.jpa.repository;

import com.aygxy.xmf.jpa.BaseRepository;
import com.aygxy.xmf.jpa.entity.Menu;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

/**
 * @Description: 菜单信息数据明细
 * @Author: Guoyongzheng
 * @Date: 2019/4/7-16:24
 */
@Repository
public interface MenuRepository extends BaseRepository<Menu,String>,QuerydslPredicateExecutor<Menu>{
}
