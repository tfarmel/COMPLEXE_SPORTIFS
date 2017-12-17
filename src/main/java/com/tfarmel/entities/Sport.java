package com.tfarmel.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
@Entity
public class Sport implements Serializable {
	
	private Long id;
	private String nom;
	private int nombreJoueurs;
	
	private Collection<Terrain> terrainsCompatibles;

	public Sport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sport(String nom, int nombreJoueurs, Collection<Terrain> terrainsCompatibles) {
		super();
		this.nom = nom;
		this.nombreJoueurs = nombreJoueurs;
		this.terrainsCompatibles = terrainsCompatibles;
	}
	
	

}
