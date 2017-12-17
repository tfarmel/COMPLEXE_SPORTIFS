package com.tfarmel.entities;

import java.io.Serializable;
import java.util.Collection;

import com.tfarmel.enumeration.Surface;

public class Terrain implements Serializable {
	
	private Long id;
	private String code;
	private Surface surface;
	
	private Collection<Sport> sportAutorises;

	public Terrain() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Terrain(String code, Surface surface, Collection<Sport> sportAutorises) {
		super();
		this.code = code;
		this.surface = surface;
		this.sportAutorises = sportAutorises;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Surface getSurface() {
		return surface;
	}

	public void setSurface(Surface surface) {
		this.surface = surface;
	}

	public Collection<Sport> getSportAutorises() {
		return sportAutorises;
	}

	public void setSportAutorises(Collection<Sport> sportAutorises) {
		this.sportAutorises = sportAutorises;
	}
	
	

}
