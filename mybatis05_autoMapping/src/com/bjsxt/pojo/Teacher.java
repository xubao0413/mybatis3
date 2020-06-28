package com.bjsxt.pojo;

import java.util.List;

public class Teacher {
	private int id;
	private String name;
	private List<Student2> list;
	
	
	
	public List<Student2> getList() {
		return list;
	}
	public void setList(List<Student2> list) {
		this.list = list;
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
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", list=" + list + "]";
	}
}
