package model;

import java.io.Serializable;

import exception.NotFoundException;

public class Student implements SubjectInterface,Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//atributos 
	private String firstName;
	private String lastName;
	private int id;
	private int age;
	private int stratum;
	private String phone;
	private String address;
	
	//relaciones 
	private Subject studentSubjects;
	
	//metodo constructor
	public Student(String firstName, String lastName, int id, int age, int stratum, String phone, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.age = age;
		this.stratum = stratum;
		this.phone = phone;
		this.address = address;
	}

	//metodos getters y setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getStratum() {
		return stratum;
	}

	public void setStratum(int stratum) {
		this.stratum = stratum;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Subject getStudentSubjects() {
		return studentSubjects;
	}

	public void setStudentSubjects(Subject studentSubjects) {
		this.studentSubjects = studentSubjects;
	}
	
	public double semesterAverage() {
		int c = 0;
		int grades = 0;
		int a = 0;
		if(studentSubjects!=null) {
		Subject aux = studentSubjects;
		while(aux !=null) {
			grades += aux.average();
			c++;
			aux = aux.getNextSubject();
		}a = grades/c;
		}
		return a;
	}
}
