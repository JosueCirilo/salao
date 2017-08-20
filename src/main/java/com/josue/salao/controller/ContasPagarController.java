package com.josue.salao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.josue.salao.model.ContasaPagar;

@Controller
public class ContasPagarController {
	
	@RequestMapping("/contasapagar/nova")
	public String nova(ContasaPagar contasapagr) {
		return"/contasapagar/CadastroContasPagar";
	}

}
