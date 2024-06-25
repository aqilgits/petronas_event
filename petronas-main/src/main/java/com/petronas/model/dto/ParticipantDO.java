package com.petronas.model.dto;

public class ParticipantDO {
	
	private String pkParticipantId;
	private String name;
	private String ic;
	private String phone;
	private String email;
	
	public String getPkParticipantId() {
		return pkParticipantId;
	}
	public void setPkParticipantId(String pkParticipantId) {
		this.pkParticipantId = pkParticipantId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIc() {
		return ic;
	}
	public void setIc(String ic) {
		this.ic = ic;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
