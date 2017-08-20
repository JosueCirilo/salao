package com.josue.salao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BarraContoller {
	
	@RequestMapping("/barra")
	public String barra() {
		return "barra";
	}

}
