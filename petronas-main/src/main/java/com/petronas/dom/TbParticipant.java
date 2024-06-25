package com.petronas.dom;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "participant")
public class TbParticipant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="ptcp_id")
	private String pkParticipantId;
	
	@Column(name = "ptcp_id")
	private String name;
	
	@Column(name = "ptcp_ic")
	private String ic;
	
	@Column(name = "ptcp_tel")
	private String phone;
	
	@Column(name = "ptcp_eml")
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
