package com.ar.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="survivor")
public class Survivor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int iId;
	
	@Column(name="name")
	private String sName;
	
	@Column(name="age")
	private int iAge;
	
	@Column(name="gender")
	private String sGender;
	
	@Column(name="latitude")
	private String sLat;
	
	@Column(name="longitude")
	private String sLong;
	
	@Column(name="is_infected")
	private boolean blIsInfected;
	
	@ManyToMany
	@JoinTable(
			name="survivor_resource",
			joinColumns=@JoinColumn(name="survivor_id"),
			inverseJoinColumns = @JoinColumn(name="resource_id")
			)
	private List<Resources> resources;
	
	public int getiId() {
		return iId;
	}
	public void setiId(int iId) {
		this.iId = iId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getiAge() {
		return iAge;
	}
	public void setiAge(int iAge) {
		this.iAge = iAge;
	}
	public String getsGender() {
		return sGender;
	}
	public void setsGender(String sGender) {
		this.sGender = sGender;
	}
	public String getsLat() {
		return sLat;
	}
	public void setsLat(String sLat) {
		this.sLat = sLat;
	}
	public String getsLong() {
		return sLong;
	}
	public void setsLong(String sLong) {
		this.sLong = sLong;
	}
	public boolean isBlIsInfected() {
		return blIsInfected;
	}
	public void setBlIsInfected(boolean blIsInfected) {
		this.blIsInfected = blIsInfected;
	}
	public List<Resources> getResources() {
		return resources;
	}
	public void setResources(List<Resources> resources) {
		this.resources = resources;
	}
	public Survivor(String sName, int iAge, String sGender, String sLat, String sLong, boolean blIsInfected,
			List<Resources> resources) {
		this.sName = sName;
		this.iAge = iAge;
		this.sGender = sGender;
		this.sLat = sLat;
		this.sLong = sLong;
		this.blIsInfected = blIsInfected;
		this.resources = resources;
	}
	public Survivor() {
	}
	
	

}
