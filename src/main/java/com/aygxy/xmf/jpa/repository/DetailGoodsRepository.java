package com.aygxy.xmf.jpa.repository;

import com.aygxy.xmf.jpa.BaseRepository;
import com.aygxy.xmf.jpa.entity.DetailGoods;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

/**
 * @Description: 商品明细数据仓库
 * @Author: xmf
 * @Date: 2019/4/7-16:15
 */
@Repository
public interface DetailGoodsRepository extends BaseRepository<DetailGoods,String>,QuerydslPredicateExecutor<DetailGoods> {
}
