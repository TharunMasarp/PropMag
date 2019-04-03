package com.app.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import com.app.beans.AddProperty;
import com.app.beans.LandlordRegistration;
import com.app.entites.LandlordAddProperty;
import com.app.entites.LandlordDetails;

@Transactional
@Repository("landlordRegDaoImpl")
public class LandlordRegDaoImpl implements LandlordRegDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public String saveLandlord(LandlordRegistration landlordReg) {
		LandlordDetails llDetails = new LandlordDetails();
		BeanUtils.copyProperties(landlordReg, llDetails);
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(llDetails);
		
				return llDetails.getFirstName()+" registered successfully";
	}

	@Override
	public List<LandlordDetails> authenticateLandlord(String userName, String originalPassword) {
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		String encoderPassword = encoder.encode(originalPassword);
		String sqlQuery = "from LandlordDetails where LL_ID=:userid and password=:password";
		@SuppressWarnings("rawtypes")
		Query query = sessionFactory.getCurrentSession().createQuery(sqlQuery);
		query.setParameter("userid", userName);
		query.setParameter("password", encoderPassword);
		@SuppressWarnings("unchecked")
		List<LandlordDetails> llDetails = query.list();
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
