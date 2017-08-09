package com.inscription.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name = "student")
@JsonIgnoreProperties(ignoreUnknown = true, value = { "hibernateLazyInitializer", "handler" })
public class Student {

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "age")
	private int age;
	
	@Column(name = "sex")
	private String sex;
	
	public Student() {
	    
	}

	public Student(Integer id, String name, String lastName, int age, String sex) {
	    super();
	    this.id = id;
	    this.name = name;
	    this.lastName = lastName;
	    this.age = age;
	    this.sex = sex;
	}

	@Override
	public String toString() {
	    return "Student [id=" + id + ", name=" + name + ", lastName=" + lastName + ", age=" + age + ", sex=" + sex
		    + "]";
	}

	@Override
	public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + age;
	    result = prime * result + ((id == null) ? 0 : id.hashCode());
	    result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
	    result = prime * result + ((name == null) ? 0 : name.hashCode());
	    result = prime * result + ((sex == null) ? 0 : sex.hashCode());
	    return result;
	}

	@Override
	public boolean equals(Object obj) {
	    if (this == obj)
		return true;
	    if (obj == null)
		return false;
	    if (getClass() != obj.getClass())
		return false;
	    Student other = (Student) obj;
	    if (age != other.age)
		return false;
	    if (id == null) {
		if (other.id != null)
		    return false;
	    } else if (!id.equals(other.id))
		return false;
	    if (lastName == null) {
		if (other.lastName != null)
		    return false;
	    } else if (!lastName.equals(other.lastName))
		return false;
	    if (name == null) {
		if (other.name != null)
		    return false;
	    } else if (!name.equals(other.name))
		return false;
	    if (sex == null) {
		if (other.sex != null)
		    return false;
	    } else if (!sex.equals(other.sex))
		return false;
	    return true;
	}

	public Integer getId() {
	    return id;
	}

	public void setId(Integer id) {
	    this.id = id;
	}

	public String getName() {
	    return name;
	}

	public void setName(String name) {
	    this.name = name;
	}

	public String getLastName() {
	    return lastName;
	}

	public void setLastName(String lastName) {
	    this.lastName = lastName;
	}

	public int getAge() {
	    return age;
	}

	public void setAge(int age) {
	    this.age = age;
	}

	public String getSex() {
	    return sex;
	}

	public void setSex(String sex) {
	    this.sex = sex;
	}



}
