package com.bjsxt.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bjsxt.pojo.Student;
import com.bjsxt.pojo.Student2;
import com.bjsxt.pojo.Teacher;

public class Test {
	public static void main(String[] args) throws IOException {
		
		
		InputStream is = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = factory.openSession();
		
		
		// list collection ，autoMapping 是装载不了集合的
//		List<Teacher> list = session.selectList("com.bjsxt.mapper.TeacherMapper.selAll");
//		for (Teacher teacher : list) {
//			System.out.println(teacher);
//		}
		
		
		// teacher association，autoMapping 可以自动装载对象
		List<Student> list = session.selectList("com.bjsxt.mapper.StudentMapper.selAll");
		for (Student student : list) {
			System.out.println(student);
		}
		
		
		session.close();
		System.out.println("程序执行结束");
	}
}
