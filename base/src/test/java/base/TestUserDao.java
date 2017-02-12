package base;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itcuc.base.dao.UserDao;
import com.itcuc.base.entity.User;

public class TestUserDao {
	ApplicationContext ac;
	UserDao userDao;
	@Before
	public void init(){
		ac = new ClassPathXmlApplicationContext("application.xml");
		userDao = ac.getBean("userDao",UserDao.class);
	}
	
	@Test
	public void testUserDaoCase(){
		User user = userDao.findById("123");
		System.out.println(user.getUserId());
	}
}
