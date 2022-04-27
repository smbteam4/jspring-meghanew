package com.ar.service;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ar.bo.Robots;
import com.ar.bo.RobotsReportBo;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class RobotService {
	
	public List<Robots> findAllRobots(){
		ObjectMapper mapper = new ObjectMapper();
        try {
        	Robots[] robots = mapper.readValue(new URL("https://robotstakeover20210903110417.azurewebsites.net/robotcpu"), Robots[].class);
            return Arrays.asList(robots);
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
	}
	
	public RobotsReportBo rebotReport(){
		List<Robots> robots=this.findAllRobots();
		
		if(!robots.isEmpty()) {
			RobotsReportBo robotsReportBo=new RobotsReportBo();
			robotsReportBo.setFlyingRobots(robots
					.stream()
					.filter(robot-> robot.getCategory().equalsIgnoreCase("Flying"))
					.collect(Collectors.toList()));
			robotsReportBo.setNonFlyingRobots(robots
					.stream()
					.filter(robot-> robot.getCategory().equalsIgnoreCase("Land"))
					.collect(Collectors.toList()));
			return robotsReportBo;
		}
		return null;
	}

}
