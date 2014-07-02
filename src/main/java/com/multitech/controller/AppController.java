package com.multitech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")
public class AppController{

	@RequestMapping(value="/index.htm",method=RequestMethod.GET)
	public String loadWelcomePage() {
		return "welcome";
	}
	
	@RequestMapping(value="/home.htm",method=RequestMethod.POST)
	public String loadHomePagePost() {
		return "home";
	}
	
	@RequestMapping(value="/home.htm",method=RequestMethod.GET)
	public String loadHomePageGet() {
		return "home";
	}
	
	
	@RequestMapping(value="/hvac.htm",method=RequestMethod.GET)
	public String loadHvacPage() {
		return "hvac";
	}
	
	@RequestMapping(value="/ac.htm",method=RequestMethod.GET)
	public String loadAcPage() {
		return "ac";
	}
	
	@RequestMapping(value="/electrical.htm",method=RequestMethod.GET)
	public String loadElectricalPage() {
		return "electrical";
	}
	
	@RequestMapping(value="/epabx.htm",method=RequestMethod.GET)
	public String loadEpabxPage() {
		return "epabx";
	}
	
	@RequestMapping(value="/cctv.htm",method=RequestMethod.GET)
	public String loadCctvPage() {
		return "cctv";
	}
	
	@RequestMapping(value="/satellite.htm",method=RequestMethod.GET)
	public String loadSatellitePage() {
		return "satellite";
	}
	
	@RequestMapping(value="/plumbing.htm",method=RequestMethod.GET)
	public String loadPlumbingPage() {
		return "plumbing";
	}
	
	@RequestMapping(value="/approval.htm",method=RequestMethod.GET)
	public String loadApprovalPage() {
		return "approval";
	}
	
	@RequestMapping(value="/maintenance.htm",method=RequestMethod.GET)
	public String loadMaintenancePage() {
		return "maintenance";
	}
	
	@RequestMapping(value="/cleaning.htm",method=RequestMethod.GET)
	public String loadCleaningPage() {
		return "cleaning";
	}
	
	@RequestMapping(value="/interior.htm",method=RequestMethod.GET)
	public String loadInteriorPage() {
		return "interior";
	}
	
	@RequestMapping(value="/regular.htm",method=RequestMethod.GET)
	public String loadRegularPage() {
		return "regular";
	}
	
	@RequestMapping(value="/classic.htm",method=RequestMethod.GET)
	public String loadClassicPage() {
		return "classic";
	}
	
	@RequestMapping(value="/premium.htm",method=RequestMethod.GET)
	public String loadPremiumPage() {
		return "premium";
	}
	
	@RequestMapping(value="/offers.htm",method=RequestMethod.GET)
	public String loadOffersPage() {
		return "offers";
	}

	@RequestMapping(value="/aboutus.htm",method=RequestMethod.GET)
	public String loadAboutUsPage() {
		return "aboutus";
	}
	
	@RequestMapping(value="/careers.htm",method=RequestMethod.GET)
	public String loadCareersPage() {
		return "careers";
	}
	
	@RequestMapping(value="/findus.htm",method=RequestMethod.GET)
	public String loadFindUsPage() {
		return "findus";
	}
}
