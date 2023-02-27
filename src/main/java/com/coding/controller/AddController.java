package com.coding.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.coding.service.AddNumbers;

@Controller
public class AddController {
	
	@Autowired
	AddNumbers addService;

	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int i,@RequestParam("t2") int j,HttpServletRequest request,HttpServletResponse response) {
		System.out.println("Add is working");
		System.out.println(request.getParameter("t1") +" , "+request.getParameter("t2"));
//		int i=Integer.parseInt(request.getParameter("t1"));
//		int j=Integer.parseInt(request.getParameter("t2"));
		
		//AddNumbers addService= new AddNumbers();
        int k = addService.addMethod(i, j);
		
		ModelAndView mv= new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result" , k);
		
		return mv;
	}

	
	
}
