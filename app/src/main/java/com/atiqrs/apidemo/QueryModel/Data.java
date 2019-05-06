package com.atiqrs.apidemo.QueryModel;

import com.google.gson.annotations.SerializedName;

public class Data{

	@SerializedName("firstname")
	private String firstname;

	@SerializedName("address")
	private Object address;

	@SerializedName("date_of_birth")
	private Object dateOfBirth;

	@SerializedName("sex")
	private Object sex;

	@SerializedName("mobile")
	private String mobile;

	@SerializedName("affliate")
	private Object affliate;

	@SerializedName("created_by")
	private String createdBy;

	@SerializedName("picture")
	private Object picture;

	@SerializedName("lastname")
	private String lastname;

	@SerializedName("user_role")
	private String userRole;

	@SerializedName("password")
	private String password;

	@SerializedName("phone")
	private Object phone;

	@SerializedName("patient_id")
	private String patientId;

	@SerializedName("blood_group")
	private Object bloodGroup;

	@SerializedName("id")
	private String id;

	@SerializedName("create_date")
	private String createDate;

	@SerializedName("email")
	private String email;

	@SerializedName("status")
	private String status;

	public void setFirstname(String firstname){
		this.firstname = firstname;
	}

	public String getFirstname(){
		return firstname;
	}

	public void setAddress(Object address){
		this.address = address;
	}

	public Object getAddress(){
		return address;
	}

	public void setDateOfBirth(Object dateOfBirth){
		this.dateOfBirth = dateOfBirth;
	}

	public Object getDateOfBirth(){
		return dateOfBirth;
	}

	public void setSex(Object sex){
		this.sex = sex;
	}

	public Object getSex(){
		return sex;
	}

	public void setMobile(String mobile){
		this.mobile = mobile;
	}

	public String getMobile(){
		return mobile;
	}

	public void setAffliate(Object affliate){
		this.affliate = affliate;
	}

	public Object getAffliate(){
		return affliate;
	}

	public void setCreatedBy(String createdBy){
		this.createdBy = createdBy;
	}

	public String getCreatedBy(){
		return createdBy;
	}

	public void setPicture(Object picture){
		this.picture = picture;
	}

	public Object getPicture(){
		return picture;
	}

	public void setLastname(String lastname){
		this.lastname = lastname;
	}

	public String getLastname(){
		return lastname;
	}

	public void setUserRole(String userRole){
		this.userRole = userRole;
	}

	public String getUserRole(){
		return userRole;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setPhone(Object phone){
		this.phone = phone;
	}

	public Object getPhone(){
		return phone;
	}

	public void setPatientId(String patientId){
		this.patientId = patientId;
	}

	public String getPatientId(){
		return patientId;
	}

	public void setBloodGroup(Object bloodGroup){
		this.bloodGroup = bloodGroup;
	}

	public Object getBloodGroup(){
		return bloodGroup;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setCreateDate(String createDate){
		this.createDate = createDate;
	}

	public String getCreateDate(){
		return createDate;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"firstname = '" + firstname + '\'' + 
			",address = '" + address + '\'' + 
			",date_of_birth = '" + dateOfBirth + '\'' + 
			",sex = '" + sex + '\'' + 
			",mobile = '" + mobile + '\'' + 
			",affliate = '" + affliate + '\'' + 
			",created_by = '" + createdBy + '\'' + 
			",picture = '" + picture + '\'' + 
			",lastname = '" + lastname + '\'' + 
			",user_role = '" + userRole + '\'' + 
			",password = '" + password + '\'' + 
			",phone = '" + phone + '\'' + 
			",patient_id = '" + patientId + '\'' + 
			",blood_group = '" + bloodGroup + '\'' + 
			",id = '" + id + '\'' + 
			",create_date = '" + createDate + '\'' + 
			",email = '" + email + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}