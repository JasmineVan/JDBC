package model;

import java.util.ArrayList;

public class Course {
	private String courseID;
	private String description;
	private Integer levels;
	private Double price;
	private String pictureURL;
	
	public Course(String courseID, String description, Integer levels, Double price, String pictureURL) {
		super();
		this.courseID = courseID;
		this.description = description;
		this.levels = levels;
		this.price = price;
		this.pictureURL = pictureURL;
	}

	public String getCourseID() {
		return courseID;
	}

	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getLevels() {
		return levels;
	}

	public void setLevels(Integer levels) {
		this.levels = levels;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getPictureURL() {
		return pictureURL;
	}

	public void setPictureURL(String pictureURL) {
		this.pictureURL = pictureURL;
	}
}
