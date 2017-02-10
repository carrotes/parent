package base.test;

import org.junit.Test;

import com.itcuc.utils.PropertiesUtils;

public class TestUtil {
	@Test
	public void testUtils(){
		System.out.println(PropertiesUtils.get("productName")); 
	}
}
