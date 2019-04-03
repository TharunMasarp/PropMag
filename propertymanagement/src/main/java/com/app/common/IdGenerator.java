package com.app.common;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class IdGenerator implements IdentifierGenerator{
	
	private static String id;
	
	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		Connection con = session.connection();
		try {
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("select count(LL_ID) from LANDLORD_DETAILS");
			if(rs.next()) {
				int i = rs.getInt(1)+1;
				this.id="ll"+i;
				System.out.println("generated id is "+id);
				return "ll"+i;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
