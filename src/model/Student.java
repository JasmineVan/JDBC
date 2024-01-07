package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import enums.Gender;
import enums.StudentType;

public class Student {
	private String userID;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String address;
	private String pictureURL;
	private LocalDate createDate;
	private LocalDate dateOfBirth;
	private Boolean isActive;
	private StudentType type;
	private Gender gender;
	
	public Student(String userID, String firstName, String lastName, String email, String password, String address,
			String pictureURL, LocalDate createDate, LocalDate dateOfBirth, Boolean isActive, StudentType type,
			Gender gender) {
		super();
		this.userID = userID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.address = address;
		this.pictureURL = pictureURL;
		this.createDate = createDate;
		this.dateOfBirth = dateOfBirth;
		this.isActive = isActive;
		this.type = type;
		this.gender = gender;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPictureURL() {
		return pictureURL;
	}

	public void setPictureURL(String pictureURL) {
		this.pictureURL = pictureURL;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public StudentType getType() {
		return type;
	}

	public void setType(StudentType type) {
		this.type = type;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [userID=" + userID + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", address=" + address + ", pictureURL=" + pictureURL + ", createDate="
				+ createDate + ", dateOfBirth=" + dateOfBirth + ", isActive=" + isActive + ", type=" + type
				+ ", gender=" + gender + "]";
	}
}
