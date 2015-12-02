package com.ssh.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssh.zzc.model.User;

public class TestHibernate {
	private SessionFactory sessionFactory;
	
	@Before
	public void before() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		sessionFactory = (SessionFactory) ac.getBean("sessionFactory");
	}
	
	@Test
	public void testHibernate() {
		User user = new User();
		user.setUserId((int)(Math.random()*10000) + "");
		user.setUserName("zzc");
		user.setPassword("zzc");
		if(sessionFactory != null){
			System.out.println(sessionFactory);
		}
		//û���������ʱ  ���ֶ��������ύ������� �������ݵ�����
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
	}
}
