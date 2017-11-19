package com.briup.test;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.briup.common.MyBatisSqlSessionFactory;
import com.briup.mappers.StudentMapper;
import com.briup.pojo.PhoneNumber;
import com.briup.pojo.Student;
public class StudentMapperTest {
	@Test
	public void test_addStudent(){
		try{
		//1)创建SqlSessionFactory对象
		    //1-1)读取配置文件
		InputStream is=Resources.getResourceAsStream
						("mybatis-config.xml");
		     //1-2)创建SqlSessionFactory对象
		SqlSessionFactory factory=
				new SqlSessionFactoryBuilder()
				.build(is);
		//2)创建SqlSession对象
		SqlSession session=factory.openSession(true);
		System.out.println("Session:"+session);
		//3)创建映射接口的实现类对象
		StudentMapper mapper=session.getMapper(
						StudentMapper.class);
	    //4)调用映射接口实现类的方法
		Student stu=new Student(999,"tom",
				  "tom@briup.com",new Date());
		mapper.insertStudent(stu);
		//5)提交事务
		//session.commit();
		//6)关闭资源,应该放在finally
		session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void test_findAllStus(){
		org.apache.ibatis.logging
			.LogFactory.useStdOutLogging();
		try {
			SqlSession session=
					MyBatisSqlSessionFactory
					.openSession();
			StudentMapper mapper=
					session.getMapper(
					StudentMapper.class);
			List<Student> stus=
				mapper.findAllStudents();
			for(Student temp:stus){
				System.out.println(temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void test_findStuById(){
		try {
			SqlSession session=
					MyBatisSqlSessionFactory
					.openSession();
			StudentMapper mapper=
					session.getMapper(
					StudentMapper.class);
			Student stu=
				mapper.findStudentById(1);
			System.out.println(stu);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test_updateStuById(){
		try {
			SqlSession session=
					MyBatisSqlSessionFactory
					.openSession();
			StudentMapper mapper=
					session.getMapper(
					StudentMapper.class);
			Student stu=new Student(1,"briup"
					,"briup@briup.com",null);
			mapper.updateStudentById(stu);
			session.commit();
		} catch (Exception e) {
				e.printStackTrace();
		}
	}
	
	
	@Test
	public void test_deleteStus(){
		try {
			SqlSession session=
					MyBatisSqlSessionFactory
					.openSession();
			StudentMapper mapper=
					session.getMapper(
					StudentMapper.class);
			int count=mapper.deleteAllStudents();
			System.out.println("删除的数据:"+count);
			session.commit();
		} catch (Exception e) {
				e.printStackTrace();
		}
	}

	
	@Test
	public void test_addStuWithPhone(){
		SqlSession session = null;
		try {
			session=MyBatisSqlSessionFactory
					.openSession();
			StudentMapper mapper=
					session.getMapper(
					StudentMapper.class);
			PhoneNumber phone=new PhoneNumber(
					"001", "101", "119");
			Student stu=new Student(100,"lili",
			  "lili@briup.com", new Date(),phone);
			mapper.addStudentWithPhone(stu);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
}









