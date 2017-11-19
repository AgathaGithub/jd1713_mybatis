package com.briup.pojo;
import java.util.Date;

import org.apache.ibatis.type.Alias;
//pojo类----数据库中的表映射
//使用注解的方式取别名，该别名叫Stu
@Alias("Stu")
public class Student {
	private Integer stuId;
	private String name;
	private String email;
	private Date dob;
	private PhoneNumber phone;
	
	public Student(){}
	public Student(Integer stuId, String name, String email, Date dob) {
		this.stuId = stuId;
		this.name = name;
		this.email = email;
		this.dob = dob;
	}
	public Student(Integer stuId, String name, String email, Date dob,
			PhoneNumber phone) {
		this.stuId = stuId;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.phone = phone;
	}
	public Integer getStuId() {
		return stuId;
	}
	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public PhoneNumber getPhone() {
		return phone;
	}
	public void setPhone(PhoneNumber phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", name=" + name + ", email="
				+ email + ", dob=" + dob + ", phone=" + phone + "]";
	}
}
