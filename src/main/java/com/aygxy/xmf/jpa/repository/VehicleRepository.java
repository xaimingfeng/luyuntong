package com.aygxy.xmf.jpa.repository;

import com.aygxy.xmf.jpa.BaseRepository;
import com.aygxy.xmf.jpa.entity.Vehicle;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

/**
 * @Description: 车辆信息数据仓库
 * @Author: xmf
 * @Date: 2019/4/7-16:26
 */
@Repository
public interface VehicleRepository extends BaseRepository<Vehicle,String>,QuerydslPredicateExecutor<Vehicle> {
}
