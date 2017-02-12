package base;

import org.junit.Test;

import com.itcuc.utils.SystemUtils;

public class TestMd5 {
	@Test
	public void testMd5() {
		System.out.println(SystemUtils.crypt("itcuc.com.admin"));
	}

	
}
