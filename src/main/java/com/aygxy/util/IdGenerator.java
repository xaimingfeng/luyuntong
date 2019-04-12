package com.aygxy.util;

import cn.ms.sequence.Sequence;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;

/**
 * @author xmf
 * 分布式序列生成器
 */
public class IdGenerator implements IdentifierGenerator {

    public IdGenerator() {
    }

    private static final Long WORKID = 0L;

    private static final Long DATAID = 0L;

    private static final Sequence SEQUENCE = new Sequence(WORKID);

    @Override
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) throws HibernateException {
        return SEQUENCE.nextId().toString();
    }
}
