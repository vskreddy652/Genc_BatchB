package com.resttemplate99.resttemplate99;

public class Customer {

	private long id;

	private String name;

	private int age;

	private boolean active;

	public Customer() {
	}

	public Customer(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.active = false;
	}

	public long getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", active=" + active + "]";
	}
}
