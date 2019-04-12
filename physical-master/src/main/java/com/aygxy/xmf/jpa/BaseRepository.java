package com.aygxy.xmf.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * @Description: JPA数据仓库基类
 * @Author: xmf
 * @Date: 2019/4/7-13:23
 */
@NoRepositoryBean
public interface BaseRepository<T extends BaseJpaEntity, ID extends Serializable> extends JpaRepository<T, ID>,JpaSpecificationExecutor<T> {
}
