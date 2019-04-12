package com.aygxy.xmf.jpa.repository;

import com.aygxy.xmf.jpa.BaseRepository;
import com.aygxy.xmf.jpa.entity.Driver;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

/**
 * @Description: 司机信息数据仓库
 * @Author: xmf
 * @Date: 2019/4/7-16:20
 */
@Repository
public interface DriverRepository extends BaseRepository<Driver,String>,QuerydslPredicateExecutor<Driver> {
}
