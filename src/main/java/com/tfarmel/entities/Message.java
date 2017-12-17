package com.tfarmel.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
@Entity
public class Message implements Serializable {
	
	private Long id;
	private String message;
	private Date dateEcriture;
	
	public Message() {
		super();
	}

	public Message(String message, Date dateEcriture) {
		super();
		this.message = message;
		this.dateEcriture = dateEcriture;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getDateEcriture() {
		return dateEcriture;
	}

	public void setDateEcriture(Date dateEcriture) {
		this.dateEcriture = dateEcriture;
	}
	
	
}
