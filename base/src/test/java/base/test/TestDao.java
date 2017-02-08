package base.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itcuc.base.dao.UserDao;
import com.itcuc.base.entity.User;

public class TestDao {
	ApplicationContext ac;
	UserDao userDao;
	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		userDao = ac.getBean("userDao", UserDao.class);
	}
	
	@Test
	public void testFind(){
		System.out.println(userDao);
		User user = userDao.findByUserId("123");
		System.out.println(user);
	}
}
