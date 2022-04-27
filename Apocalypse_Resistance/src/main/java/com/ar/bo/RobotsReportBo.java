package com.ar.bo;

import java.util.List;


public class RobotsReportBo {
	
	private List<Robots> flyingRobots;
	private List<Robots> nonFlyingRobots;
	public List<Robots> getFlyingRobots() {
		return flyingRobots;
	}
	public void setFlyingRobots(List<Robots> flyingRobots) {
		this.flyingRobots = flyingRobots;
	}
	public List<Robots> getNonFlyingRobots() {
		return nonFlyingRobots;
	}
	public void setNonFlyingRobots(List<Robots> nonFlyingRobots) {
		this.nonFlyingRobots = nonFlyingRobots;
	}
	
	

}
