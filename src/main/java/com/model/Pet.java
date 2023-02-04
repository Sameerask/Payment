package com.model;
import javax.persistence.*;
@Entity
public class Pet {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String petName;
	private String petType;
	private int age;
	public Pet()
	{
		
	}
	public Pet(String petName,String petType,int age)
	{
		this.petName=petName;
		this.petType=petType;
		this.age=age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public String getPetType() {
		return petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Pet [petName=" + petName + ", petType=" + petType + ", age=" + age + "]";
	}
	
	

}
