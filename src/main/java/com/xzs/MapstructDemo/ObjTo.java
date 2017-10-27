package com.xzs.MapstructDemo;
/**
 * VO 对象
 * @Description:TODO
 * @exception:
 * @author: 徐正顺
 * @time:2017年10月27日 下午5:33:44
 */
public class ObjTo {

	private String myname;
	private String myEmail;
	private int age;
	
	public String getMyname() {
		return myname;
	}

	public void setMyname(String myname) {
		this.myname = myname;
	}

	public String getMyEmail() {
		return myEmail;
	}

	public void setMyEmail(String myEmail) {
		this.myEmail = myEmail;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "ObjTo [myname=" + myname + ", myEmail=" + myEmail + ", age=" + age + "]";
	}
	
}
