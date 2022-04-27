package com.ar.service;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.ar.bo.Robots;
import com.ar.bo.RobotsReportBo;
import com.ar.bo.SurvivorInfectionBo;
import com.ar.bo.SurvivorReportBo;
import com.ar.entity.Survivor;
import com.ar.repo.SurvivorRepository;

@Service
public class SurvivorService {
	
	@Autowired
	private SurvivorRepository survivorRepository;
	
	public Survivor registerSurvivor(Survivor survivor) {
		
		
		return survivorRepository.save(survivor);
	}
	
	public Survivor updateInfection(SurvivorInfectionBo survivorInfectionBo) {
		Survivor survivor=survivorRepository
				.findById(survivorInfectionBo.getiSurvivorId()).orElse(null);
		if(survivor!=null) {
			survivor.setBlIsInfected(survivorInfectionBo.isBlIsInfected());
			survivor=survivorRepository.save(survivor);
		}


		return survivor;
	}
	public Survivor updateLocation(int iSurvivorId,String sLong,String sLat) {
		Survivor survivor=survivorRepository
				.findById(iSurvivorId).orElse(null);
		if(survivor!=null) {
			survivor.setsLat(sLat);
			survivor.setsLong(sLong);
			survivor=survivorRepository.save(survivor);
		}


		return survivor;
	}
	
	public SurvivorReportBo survivorReport(){
		List<Survivor> survivors=survivorRepository.findAll();
		
		if(!survivors.isEmpty()) {
			SurvivorReportBo survivorReportBo=new SurvivorReportBo();
			survivorReportBo.setInfectedSurvivors(survivors
					.stream()
					.filter(Survivor::isBlIsInfected)
					.collect(Collectors.toList()));
			survivorReportBo.setNonInfectedSurvivors(survivors
					.stream()
					.filter(survivor-> !survivor.isBlIsInfected())
					.collect(Collectors.toList()));
			double dTotal=survivors.size();
			double dInfected=survivorReportBo.getInfectedSurvivors().size();
			double dNonInfected=survivorReportBo.getNonInfectedSurvivors().size();
			survivorReportBo.setdInfectedsurvivorsPct(calculatePercentage(dInfected,dTotal));
			survivorReportBo.setdNonInfectedsurvivorsPct(calculatePercentage(dNonInfected,dTotal));
			return survivorReportBo;
		}
		return null;
	}
	
	 public double calculatePercentage(double obtained, double total) {
	        return obtained * 100 / total;
	    }

}
