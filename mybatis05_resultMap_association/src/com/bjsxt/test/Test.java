package com.bjsxt.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bjsxt.pojo.Student;
import com.bjsxt.pojo.Teacher;
import com.bjsxt.pojo.Teacher2;

public class Test {
	public static void main(String[] args) throws IOException {
		
		InputStream is = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = factory.openSession();
		
		
		
//		List<Teacher2> list = session.selectList("com.bjsxt.mapper.TeacherMapper2.selAll");
//		for (Teacher2 teacher2 : list) {
//			System.out.println(teacher2);
//		}
		
		Teacher2 teacher2 = session.selectOne("com.bjsxt.mapper.TeacherMapper2.selById", 1);
		System.out.println(teacher2);
		
//		Teacher teacher = session.selectOne("com.bjsxt.mapper.TeacherMapper.selById", 2);
//		System.out.println(teacher);
		
//		List<Student> list = session.selectList("com.bjsxt.mapper.StudentMapper.selAll");
//		for (Student student : list) {
//			System.out.println(student);
//		}
//		List<Student> list = session.selectList("com.bjsxt.mapper.StudentMapper.selAll1");
//		for (Student student : list) {
//			System.out.println(student);
//		}
		
		
		
		session.close();
		System.out.println("程序执行结束");
	}
}
