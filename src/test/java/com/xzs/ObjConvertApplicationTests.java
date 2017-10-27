package com.xzs;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xzs.MapstructDemo.ObjFrom;
import com.xzs.MapstructDemo.ObjMapper;
import com.xzs.MapstructDemo.ObjTo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ObjConvertApplicationTests {

	/**
	 * Mapstruct 对象属性值copy
	 * @Description:TODO
	 * void
	 * @exception:
	 * @author: 徐正顺
	 * @time:2017年10月27日 下午3:38:46
	 */
	@Test
	public void contextLoads() {
		ObjFrom from =new ObjFrom();
		from.seteName("哼哈");
		from.seteName("HenHa");
		from.setEmail("sb110@xzs.cn");
		from.setAge(23);
		ObjTo to= ObjMapper .INSTANCE.carToCarDto(from);
		System.out.println(to.toString());
	}

}
