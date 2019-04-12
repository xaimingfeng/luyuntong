package com.aygxy.xmf.jpa.repository;

import com.aygxy.xmf.jpa.BaseRepository;
import com.aygxy.xmf.jpa.entity.Bill;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

/**
 * @Description: 主单据信息数据明细
 * @Author:
 * @Date: 2019/4/7-16:23
 */
@Repository
public interface BillRepository extends BaseRepository<Bill,String>,QuerydslPredicateExecutor<Bill> {
}
