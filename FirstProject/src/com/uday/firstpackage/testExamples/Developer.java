package com.uday.firstpackage.testExamples;

import java.math.BigDecimal;

public class Developer {
	String name;
	BigDecimal bigNumber;
	int age;
	public Developer(String name, BigDecimal bigNumber, int age) {
		this.name = name;
		this.bigNumber = bigNumber;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getBigNumber() {
		return bigNumber;
	}
	public void setBigNumber(BigDecimal bigNumber) {
		this.bigNumber = bigNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	

}
