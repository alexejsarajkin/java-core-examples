package com.ocp.serialization;

import java.io.Serializable;

public class Cat implements Serializable {
	private String name;
	private String type;
	private transient String gender;

	private Collar collar;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Collar getCollar() {
		return collar;
	}

	public void setCollar(Collar collar) {
		this.collar = collar;
	}

	@Override
	public String toString() {
		return "Cat - " +
				"name='" + name + '\'' +
				", type='" + type + '\'' +
				", gender='" + gender + '\'' +
				", collar=" + collar;
	}
}

class Collar implements Serializable {
	private int size;

	public Collar(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Collar - " +
				"size=" + size;
	}
}