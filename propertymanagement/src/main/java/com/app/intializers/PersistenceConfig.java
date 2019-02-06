package com.app.intializers;

/*import java.util.Properties;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
*/
/*@Configuration
@EnableTransactionManagement
@PropertySource({"classpath:persistence-sql.properties"})
@ComponentScan({"com.app.entites"})*/
public class PersistenceConfig {
	
	/*@Autowired
	private Environment env;
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	      sessionFactory.setDataSource(dataSource());
	      sessionFactory.setPackagesToScan(new String[] {  });
	      sessionFactory.setHibernateProperties(hibernateProperties());
	      return sessionFactory;
	}
	
	@Bean
	public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
	      dataSource.setDriverClassName(env.getProperty("driverClassName"));
	      dataSource.setUrl(env.getProperty("url"));
	      dataSource.setUsername(env.getProperty("userName"));
	      dataSource.setPassword(env.getProperty(".password"));
	      return dataSource;
	}
	
	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager htx = new HibernateTransactionManager();
		htx.setSessionFactory(sessionFactory);
		return htx;
	}
	
	@Bean
	public PersistenceExceptionTranslationPostProcessor exceptionTranslator() {
		return new PersistenceExceptionTranslationPostProcessor();
	}
	Properties hibernateProperties() {
		Properties prop = new Properties();
		prop.setProperty("hibernate.hbm2ddl.auto", "update");
		prop.setProperty("hibernate.Dialect","org.hibernate.dialect.Oracle10gDialect");
		return prop;
	}*/
	
	
}
