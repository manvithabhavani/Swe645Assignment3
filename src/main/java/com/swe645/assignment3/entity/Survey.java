package com.swe645.assignment3.entity;

import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="survey")
public class Survey {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="id",nullable=false)
	private long id;
	
	@Column(name="first_name",nullable=false)
	private String firstName;
	
	@Column(name="last_name",nullable=false)
	private String lastName;
	
	@Column(name="phone_number",nullable=false)
	private long phoneNumber;
	
	@Column(name="email",nullable=false)
	private String email;
	
	@Column(name="street_address",nullable=false)
	private String streetAddress;
	
	@Column(name="city",nullable=false)
	private String city;
	
	@Column(name="state",nullable=false)
	private String state;
	
	@Column(name="zip",nullable=false)
	private int zip;
	
	@Column(name="date_of_survey",nullable=false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateOfSurvey;
	
	@Column(name="line_on_campus",nullable=false)
	private String likeOnCampus;
	
	@Column(name="interest_factor",nullable=false)
	private String interestFactor;
	
	@Column(name="likeness",nullable=false)
	private String likeness;
	
	@Column(name="lucky_draw",nullable=false)
	private String luckyDraw;
	
	@Column(name="comments",nullable=false)
	private String comments;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public Date getDateOfSurvey() {
		return dateOfSurvey;
	}

	public void setDateOfSurvey(Date dateOfSurvey) {
		this.dateOfSurvey = dateOfSurvey;
	}

	public String getLikeOnCampus() {
		return likeOnCampus;
	}

	public void setLikeOnCampus(String likeOnCampus) {
		this.likeOnCampus = likeOnCampus;
	}

	public String getInterestFactor() {
		return interestFactor;
	}

	public void setInterestFactor(String interestFactor) {
		this.interestFactor = interestFactor;
	}

	public String getLikeness() {
		return likeness;
	}

	public void setLikeness(String likeness) {
		this.likeness = likeness;
	}

	public String getLuckyDraw() {
		return luckyDraw;
	}

	public void setLuckyDraw(String luckyDraw) {
		this.luckyDraw = luckyDraw;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Survey [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber="
				+ phoneNumber + ", email=" + email + ", streetAddress=" + streetAddress + ", city=" + city + ", state="
				+ state + ", zip=" + zip + ", dateOfSurvey=" + dateOfSurvey + ", likeOnCampus=" + likeOnCampus
				+ ", interestFactor=" + interestFactor + ", likeness=" + likeness + ", luckyDraw=" + luckyDraw
				+ ", comments=" + comments + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, comments, dateOfSurvey, email, firstName, id, interestFactor, lastName, likeOnCampus,
				likeness, luckyDraw, phoneNumber, state, streetAddress, zip);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Survey other = (Survey) obj;
		return Objects.equals(city, other.city) && Objects.equals(comments, other.comments)
				&& Objects.equals(dateOfSurvey, other.dateOfSurvey) && Objects.equals(email, other.email)
				&& Objects.equals(firstName, other.firstName) && id == other.id
				&& Objects.equals(interestFactor, other.interestFactor) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(likeOnCampus, other.likeOnCampus) && Objects.equals(likeness, other.likeness)
				&& Objects.equals(luckyDraw, other.luckyDraw) && phoneNumber == other.phoneNumber
				&& Objects.equals(state, other.state) && Objects.equals(streetAddress, other.streetAddress)
				&& zip == other.zip;
	}
}
