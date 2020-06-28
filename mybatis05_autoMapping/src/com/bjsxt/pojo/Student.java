package com.bjsxt.pojo;

public class Student {
	private int id;
	private String name;
	private int age;
	private int tid;
	private Teacher2 teacher;
	
	public Teacher2 getTeacher2() {
		return teacher;
	}
	public void setTeacher2(Teacher2 teacher2) {
		this.teacher = teacher2;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", tid=" + tid + ", teacher2=" + teacher + "]";
	}
	
}
