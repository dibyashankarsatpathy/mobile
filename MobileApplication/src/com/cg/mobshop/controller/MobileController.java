package com.cg.mobshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.mobshop.dto.Mobiles;
import com.cg.mobshop.service.MobileService;

@Controller
public class MobileController {
	@Autowired
	MobileService service;
	public MobileService getService(){
		return service;
	}
	
	public void setService(MobileService service)
	{
		this.service=service;
	}
	
	@RequestMapping("getmoblist")//same as in index.jsp
	public String showMonbileList(Model model){//fetch data from db and send to jsp page 
		List<Mobiles> list=service.getAllMobiles();
		model.addAttribute("list",list);
		return "Home";
	}
	
	
	

}
