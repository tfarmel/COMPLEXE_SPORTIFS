package com.tfarmel.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;

@Entity
public class Carnet implements Serializable {

	private Long id;
	private int nombreEntrees;
	
	private Client client;
	private Sport sports;

	public Carnet() {
		super();
	}

	public Carnet(int nombreEntrees, Client client, Sport sports) {
		super();
		this.nombreEntrees = nombreEntrees;
		this.client = client;
		this.sports = sports;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNombreEntrees() {
		return nombreEntrees;
	}

	public void setNombreEntrees(int nombreEntrees) {
		this.nombreEntrees = nombreEntrees;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Sport getSports() {
		return sports;
	}

	public void setSports(Sport sports) {
		this.sports = sports;
	}

	
}
