package com.briup.mappers;

import java.util.List;

import com.briup.pojo.Student;

//映射接口
public interface StudentMapper {
	// 方法名和映射文件的id值对应
	// 方法的参数列表和映射文件的中parameterType对应
	// 方法的返回值类型和映射文件的中returnType对应
	// 方法名和映射文件的id值对应
	// 方法的参数列表和映射文件的中parameterType对应
	// 方法的返回值类型和映射文件的中returnType对应
	 public List<Student> findAllStudents();
	// public Student findStudentById(int id);
	 public void insertStudent(Student stu);
	//
	// public void updateStudentById(Student stu);
	// public int deleteAllStudents();
	// public void deleteStudentById(int id);
	//
	// public void addStudentWithPhone(Student stu);
}
