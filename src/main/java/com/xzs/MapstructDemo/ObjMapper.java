package com.xzs.MapstructDemo;

import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
/**
 * 对象属性值copy mapper
 * @Description:TODO
 * @exception:
 * @author: 徐正顺
 * @time:2017年10月27日 下午5:34:55
 */
public interface ObjMapper {
	ObjMapper INSTANCE = Mappers.getMapper( ObjMapper.class );   
	   
	   /**
	    * ObjFrom 自动转换为 ObjTo
	    * @Description:TODO
	    * @param from
	    * @return
	    * ObjTo
	    * @exception:
	    * @author: 徐正顺
	    * @time:2017年10月27日 下午3:29:44
	    * 
	    * 使用@Mapping 可以指定不同字段名间的转换（类型必须相同）
	    * source = "eName" ObjFrom的eName属性值copy到ObjTo的myname值 target = "myname"
	    */
	    @Mapping(source = "eName", target = "myname") 
	    @Mapping(source = "email", target = "myEmail") 
	    ObjTo carToCarDto(ObjFrom from);   
}
