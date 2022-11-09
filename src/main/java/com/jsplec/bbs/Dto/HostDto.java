package com.jsplec.bbs.Dto;

public class HostDto {

	String cId;
	String cPw;
	public HostDto(String cId, String cPw) {
		super();
		this.cId = cId;
		this.cPw = cPw;
	}
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	public String getcPw() {
		return cPw;
	}
	public void setcPw(String cPw) {
		this.cPw = cPw;
	}
	
	
	
}
