package com.app.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.beans.RenterRegistration;
import com.app.entites.RenterDetails;

@Transactional
@Repository("renterRegDaoImpl")
public class RenterRegDaoImpl implements RenterRegDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public String saveRenter(RenterRegistration renterReg) {
		RenterDetails rDetails = new RenterDetails();
		BeanUtils.copyProperties(renterReg, rDetails);
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(rDetails);
		return renterReg.getFirstName()+" registered succssfully";
	}

	@Override
	public List<RenterRegistration> authenticateRenter(String userName, String password) {
		String sqlQuery = "from renter_details where R_name=:userid and password=:password";
		@SuppressWarnings("rawtypes")
		Query query = sessionFactory.getCurrentSession().createQuery(sqlQuery);
		query.setParameter("userid", userName);
		query.setParameter("password", password);
		@SuppressWarnings("unchecked")
		List<RenterRegistration> rDetails = query.list();
		return rDetails;
	}
	
}