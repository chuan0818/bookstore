package com.ssh.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssh.zzc.dao.UserDaoI;

public class TestSpring {
	
	@Test
	public void testSpring() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过spring配置上下文得到bean实例
		UserDaoI userDao = (UserDaoI) ac.getBean("userDao");
		userDao.doOperation();
	}
}
