package model;

import java.util.ArrayList;

public class Course {
	private String courseID;
	private String name;
	private String detail;
	private String pictureURL;
	private Integer duration;
	private Double price;
	private ArrayList<String> carousel;
	
	public Course(String courseID, String name, String detail, String pictureURL, Integer duration, Double price,
			ArrayList<String> carousel) {
		super();
		this.courseID = courseID;
		this.name = name;
		this.detail = detail;
		this.pictureURL = pictureURL;
		this.duration = duration;
		this.price = price;
		this.carousel = carousel;
	}

	public String getCourseID() {
		return courseID;
	}

	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getPictureURL() {
		return pictureURL;
	}

	public void setPictureURL(String pictureURL) {
		this.pictureURL = pictureURL;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public ArrayList<String> getCarousel() {
		return carousel;
	}

	public void setCarousel(ArrayList<String> carousel) {
		this.carousel = carousel;
	}
}
