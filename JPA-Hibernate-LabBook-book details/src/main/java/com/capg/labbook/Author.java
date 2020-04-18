package com.capg.labbook;

import javax.persistence.Column;

import javax.persistence.*;

@Entity
public class Author {
    
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int authorId;

	@Column(name = "first_Name",length = 30, nullable = false)
	private String firstName;
	
	@Column(name = "middle_Name",length = 30, nullable = false)
	private String middleName;
	
	@Column(name = "last_Name",length = 30, nullable = false)
	private String lastName;
	
	@Column(nullable = false)
	private int phoneNo;
	
	public Author() {
		super();
		
	}

	
	public Author(int authorId, String firstName, String middleName, String lastName, int phoneNo) {
		super();
		this.authorId = authorId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
	}


	public int getAuthorId() {
		return authorId;
	}


	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", phoneNo=" + phoneNo + "]";
	}
	
	
	
}
