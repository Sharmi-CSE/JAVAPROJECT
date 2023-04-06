package com.Tns.admin_service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Admin1
{
    private Integer ad_id;
    private String ad_name;
    private String ad_location;
    private double ad_salary;
    private String mall_name;
    private Integer ad_phNo;
    private String ad_maintanceArea;
    public Admin1()
    {
    	super();
    }
	public Admin1(Integer ad_id, String ad_name, String ad_location, double ad_salary, String mall_name,
			Integer ad_phNo, String ad_maintanceArea) {
		super();
		this.ad_id = ad_id;
		this.ad_name = ad_name;
		this.ad_location = ad_location;
		this.ad_salary = ad_salary;
		this.mall_name = mall_name;
		this.ad_phNo = ad_phNo;
		this.ad_maintanceArea = ad_maintanceArea;
	}
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	public Integer getAd_id() {
		return ad_id;
	}
	public void setAd_id(Integer ad_id) {
		this.ad_id = ad_id;
	}
	public String getAd_name() {
		return ad_name;
	}
	public void setAd_name(String ad_name) {
		this.ad_name = ad_name;
	}
	public String getAd_location() {
		return ad_location;
	}
	public void setAd_location(String ad_location) {
		this.ad_location = ad_location;
	}
	public double getAd_salary() {
		return ad_salary;
	}
	public void setAd_salary(double ad_salary) {
		this.ad_salary = ad_salary;
	}
	public String getMall_name() {
		return mall_name;
	}
	public void setMall_name(String mall_name) {
		this.mall_name = mall_name;
	}
	public Integer getAd_phNo() {
		return ad_phNo;
	}
	public void setAd_phNo(Integer ad_phNo) {
		this.ad_phNo = ad_phNo;
	}
	public String getAd_maintanceArea() {
		return ad_maintanceArea;
	}
	public void setAd_maintanceArea(String ad_maintanceArea) {
		this.ad_maintanceArea = ad_maintanceArea;
	}
	public String toString()
	{
		return "Admin Id:"+ad_id+" Admin Name:"+ad_name+" Admin Location:"+ad_location+" Admin Salary:"+ad_salary+" Mall Name:"+mall_name
				+" Admin phoneNumber"+ad_phNo+" Admin Maintanace Area:"+ad_maintanceArea;
	}
    
}


