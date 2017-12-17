package com.tfarmel.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clients")
public class Client implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nom;
	private String prenom;
	private String email;
	private String langue;
	private String theme;
	private String motDePasse;
	
	private Adresse adresse;
	private Collection<Message> messages;
	private Collection<Carnet> carnets;
	
	public Client() {
		super();
	}
	
	public Client(String email, String motDePasse) {
		super();
		this.email = email;
		this.motDePasse = motDePasse;
	}

	public Client(String nom, String prenom, String email, String langue, String theme, String motDePasse,
			Adresse adresse, Collection<Message> messages, Collection<Carnet> carnets) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.langue = langue;
		this.theme = theme;
		this.motDePasse = motDePasse;
		this.adresse = adresse;
		this.messages = messages;
		this.carnets = carnets;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Collection<Message> getMessages() {
		return messages;
	}

	public void setMessages(Collection<Message> messages) {
		this.messages = messages;
	}

	public Collection<Carnet> getCarnets() {
		return carnets;
	}

	public void setCarnets(Collection<Carnet> carnets) {
		this.carnets = carnets;
	}

	

}
