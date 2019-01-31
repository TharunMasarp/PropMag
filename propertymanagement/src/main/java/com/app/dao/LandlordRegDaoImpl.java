package com.app.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.beans.AddProperty;
import com.app.beans.LandlordRegistration;
import com.app.entites.LandlordAddProperty;
import com.app.entites.LandlordDetails;

@Transactional
@Repository
public class LandlordRegDaoImpl implements LandlordRegDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public String saveLandlord(LandlordRegistration landlordReg) {
		LandlordDetails llDetails = new LandlordDetails();
		BeanUtils.copyProperties(landlordReg, llDetails);
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(llDetails);
		
				return llDetails.getLandlordName()+" registered successfully";
	}

	@Override
	public List<LandlordRegistration> authenticateLandlord(String userName, String password) {
		String sqlQuery = "from landlord_details where ll_name=:userid and password=:password";
		@SuppressWarnings("rawtypes")
		Query query = sessionFactory.getCurrentSession().createQuery(sqlQuery);
		query.setParameter("userid", userName);
		query.setParameter("password", password);
		@SuppressWarnings("unchecked")
		List<LandlordRegistration> llDetails = query.list();
		return llDetails;	
	}

	@Override
	public void saveProp(AddProperty prop) {
		LandlordAddProperty lap = new LandlordAddProperty();
		BeanUtils.copyProperties(prop, lap);
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(lap);
	}
	
	/*public List<AddProperty> searchProp(String Location){
		String sqlQuery = "from properties where city=:location";
		Query query = sessionFactory.getCurrentSession().createQuery(sqlQuery);
		query.setParameter(position, value)
	}*/
	
}
