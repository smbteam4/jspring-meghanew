package com.ar.bo;

import java.util.List;

import com.ar.entity.Survivor;

public class SurvivorReportBo {
	
	private List<Survivor> infectedSurvivors;
	private List<Survivor> nonInfectedSurvivors;
	private double dInfectedsurvivorsPct;
	private double dNonInfectedsurvivorsPct;
	


	public List<Survivor> getInfectedSurvivors() {
		return infectedSurvivors;
	}
	public void setInfectedSurvivors(List<Survivor> infectedSurvivors) {
		this.infectedSurvivors = infectedSurvivors;
	}
	public List<Survivor> getNonInfectedSurvivors() {
		return nonInfectedSurvivors;
	}
	public void setNonInfectedSurvivors(List<Survivor> nonInfectedSurvivors) {
		this.nonInfectedSurvivors = nonInfectedSurvivors;
	}
	public double getdInfectedsurvivorsPct() {
		return dInfectedsurvivorsPct;
	}
	public void setdInfectedsurvivorsPct(double dInfectedsurvivorsPct) {
		this.dInfectedsurvivorsPct = dInfectedsurvivorsPct;
	}
	public double getdNonInfectedsurvivorsPct() {
		return dNonInfectedsurvivorsPct;
	}
	public void setdNonInfectedsurvivorsPct(double dNonInfectedsurvivorsPct) {
		this.dNonInfectedsurvivorsPct = dNonInfectedsurvivorsPct;
	}
	
	

}
