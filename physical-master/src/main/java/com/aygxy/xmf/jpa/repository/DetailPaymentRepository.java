package com.aygxy.xmf.jpa.repository;

import com.aygxy.xmf.jpa.BaseRepository;
import com.aygxy.xmf.jpa.entity.DetailPayment;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

/**
 * @Description: 收支明细数据仓库
 * @Author: xmf
 * @Date: 2019/4/7-16:17
 */
@Repository
public interface DetailPaymentRepository extends BaseRepository<DetailPayment,String>,QuerydslPredicateExecutor<DetailPayment> {
}
