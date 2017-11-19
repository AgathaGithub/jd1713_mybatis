package com.briup.pojo;

public class PhoneNumber {
	private String countryCode;  //国家编号
	private String stateCode;    //区编号
	private String number;       //电话号码
	
	public PhoneNumber(){}
	public PhoneNumber(String countryCode, String stateCode, String number) {
		this.countryCode = countryCode;
		this.stateCode = stateCode;
		this.number = number;
	}
	public PhoneNumber(String msg){
		//msg--->101-001-110
		if(msg!=null){
			String[] str=msg.split("-");
			countryCode=str[0];
			stateCode=str[1];
			number = str[2];
		}
	}
	
	
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "PhoneNumber [countryCode=" + countryCode + ", stateCode="
				+ stateCode + ", number=" + number + "]";
	}
	
	public String getAsString(){
		return countryCode+"-"+stateCode+"-"+number;
	}
	
}
