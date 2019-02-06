package com.app.common;

import java.io.Serializable;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class IdGenerator implements IdentifierGenerator{
	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		return null;
	}
}
