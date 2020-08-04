package com.hari.roommiesapi.entity;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="users")
@Table(name="users")
public class User {

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="sno")
	private int sno;
	@Id
	@Column(name="user_id")
	private String userId;
	@Column(name="email")
	private String email;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="birthday")
	private Date birthday;
	@Column(name="gender")
	private String gender;
	@Column(name="contact_no")
	private String contactNo;
	@Column(name="room_id")
	private String roomId;
	@Column(name="input_user_id")
	private String inputUserId;
	@Column(name="input_datetime")
	private Timestamp inputDatetime;
	@Column(name="last_update_user_id")
	private String lastUpdateUserId;
	@Column(name="last_update_datetime")
	private Timestamp lastUpdateDatetime;
	public User(String userId, String email, String firstName, String lastName, Date birthday, String gender,
			String contactNo, String roomId,
			String inputUserId, Timestamp inputDatetime, String lastUpdateUserId, Timestamp lastUpdateDatetime) {
		super();
		this.userId = userId;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.gender = gender;
		this.contactNo = contactNo;
		this.roomId = roomId;
		this.inputUserId = inputUserId;
		this.inputDatetime = inputDatetime;
		this.lastUpdateUserId = lastUpdateUserId;
		this.lastUpdateDatetime = lastUpdateDatetime;
	}
	
	public User() {
	}

	@Override
	public String toString() {
		return "User [sno=" + sno + ", userId=" + userId + ", email=" + email + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", birthday=" + birthday + ", gender=" + gender + ", inputUserId="
				+ inputUserId + ", inputDatetime=" + inputDatetime + ", lastUpdateUserId=" + lastUpdateUserId
				+ ", lastUpdateDatetime=" + lastUpdateDatetime + "]";
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getInputUserId() {
		return inputUserId;
	}

	public void setInputUserId(String inputUserId) {
		this.inputUserId = inputUserId;
	}

	public Timestamp getInputDatetime() {
		return inputDatetime;
	}

	public void setInputDatetime(Timestamp inputDatetime) {
		this.inputDatetime = inputDatetime;
	}

	public String getLastUpdateUserId() {
		return lastUpdateUserId;
	}

	public void setLastUpdateUserId(String lastUpdateUserId) {
		this.lastUpdateUserId = lastUpdateUserId;
	}

	public Timestamp getLastUpdateDatetime() {
		return lastUpdateDatetime;
	}
	public void setLastUpdateDatetime(Timestamp lastUpdateDatetime) {
		this.lastUpdateDatetime = lastUpdateDatetime;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	
	
}
