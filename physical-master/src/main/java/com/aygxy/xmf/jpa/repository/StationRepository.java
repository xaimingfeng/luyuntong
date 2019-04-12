package com.aygxy.xmf.jpa.repository;

import com.aygxy.xmf.jpa.BaseRepository;
import com.aygxy.xmf.jpa.entity.Station;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

/**
 * @Description: 站点数据仓库
 * @Author: xmf
 * @Date: 2019/4/7-16:25
 */
@Repository
public interface StationRepository extends BaseRepository<Station,String>,QuerydslPredicateExecutor<Station> {
}
