package base;

import java.io.FileInputStream;
import java.sql.Timestamp;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.itcuc.base.dao.SystemDao;
import com.itcuc.base.dao.UserDao;
import com.itcuc.base.entity.Function;
import com.itcuc.base.entity.Image;
import com.itcuc.base.entity.Role;
import com.itcuc.base.entity.User;

public class TestUserDao {
	ApplicationContext ac;
	UserDao userDao;
	SystemDao systemDao;

	@Before
	public void init() {
		ac = new FileSystemXmlApplicationContext("WebContent/WEB-INF/applicationContext.xml");
		userDao = ac.getBean("userDao", UserDao.class);
		systemDao = ac.getBean("systemDao", SystemDao.class);
	}

	@Test
	public void testUserDaoCase() {
		User user = userDao.findById("123");
		System.out.println(user.getUserId());
	}

	@Test
	public void insertImage() throws Exception {
		FileInputStream in = new FileInputStream("C:\\Users\\z\\Pictures\\admin.jpg");
		byte[] data = new byte[in.available()];
		in.read(data, 0, data.length);

		Image image = new Image("Image_default_001", data, 1, ".jpg", new Timestamp(System.currentTimeMillis()),
				new Timestamp(System.currentTimeMillis()), 0);
		systemDao.addImage(image);
		in.close();
	}

	@Test
	public void testImageCase() {
		Image image = systemDao.findImageByUserId("User_admin");
		System.out.println(image);
	}

	@Test
	public void roleTestCase() {
		List<Role> roles = systemDao.findRolesByUserId("User_admin");
		if (roles != null) {
			System.out.println(roles.get(0).getRoleName());
		}
	}

	@Test
	public void functionTestCase() {
		List<Function> functions = systemDao.findFunctionsByUserId("User_admin");
		if (functions != null) {
			System.out.println(functions.get(0).getFunctionName());
		}
	}
}
