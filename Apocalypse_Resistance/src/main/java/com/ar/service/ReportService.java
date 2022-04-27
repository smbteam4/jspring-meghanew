package com.ar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ar.bo.ReportsBo;

@Service
public class ReportService {
	
	@Autowired
	private RobotService robotService;
	
	@Autowired
	private SurvivorService survivorService;
	
	public ReportsBo fetchReport() {
		ReportsBo reportsBo=new ReportsBo();
		reportsBo.setRobotsReportBo(robotService.rebotReport());
		reportsBo.setSurvivorReportBo(survivorService.survivorReport());
		return reportsBo;
	}

}
