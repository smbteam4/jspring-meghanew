package com.ar.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ar.bo.SurvivorInfectionBo;
import com.ar.bo.ReportsBo;
import com.ar.bo.Robots;
import com.ar.entity.Survivor;
import com.ar.service.ReportService;
import com.ar.service.RobotService;
import com.ar.service.SurvivorService;

@RestController
@RequestMapping("/api")
public class ArController {
	
	@Autowired
	private RobotService robotService;
	
	@Autowired
	private SurvivorService survivorService;
	
	@Autowired
	private ReportService reportService;
	
	
	@GetMapping("/robots")
	public List<Robots> test() {
		return robotService.findAllRobots();
	}
	
	@PostMapping("/survivor")
	public ResponseEntity<Survivor> registerSurvivor(@RequestBody Survivor survivor) {
		
		return new ResponseEntity<>(survivorService.registerSurvivor(survivor), HttpStatus.OK);
	}
	@PutMapping("/infection")
	public ResponseEntity<Survivor> registerSurvivor(@RequestBody SurvivorInfectionBo survivorInfectionBo) {
		
		return new ResponseEntity<>(survivorService.updateInfection(survivorInfectionBo), HttpStatus.OK);
	}
	
	@PutMapping("/location/{id}")
	public ResponseEntity<Survivor> registerSurvivor(@PathParam("id") int iSurvivorId,@RequestParam("long") String sLong,
			@RequestParam("lat") String sLat) {
		
		return new ResponseEntity<>(survivorService.updateLocation(iSurvivorId, sLong, sLat), HttpStatus.OK);
	}
	
	@GetMapping("/reports")
	public ResponseEntity<ReportsBo> fetchReports() {
		return new ResponseEntity<>(reportService.fetchReport(), HttpStatus.OK);
	}

}
