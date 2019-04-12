package com.aygxy.xmf.jpa.repository;

import com.aygxy.xmf.jpa.BaseRepository;
import com.aygxy.xmf.jpa.entity.City;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description: 城市信息数据仓库
 * @Author: xmf
 * @Date: 2019/4/7-16:32
 */
@Repository
@Transactional
public interface CityRepository extends BaseRepository<City,String>,QuerydslPredicateExecutor<City> {

}
