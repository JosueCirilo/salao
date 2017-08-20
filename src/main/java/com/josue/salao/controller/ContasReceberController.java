package com.josue.salao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.josue.salao.model.ContasaReceber;

@Controller
public class ContasReceberController {
	
	@RequestMapping("/contasareceber/nova")
	public String nova(ContasaReceber contasareceber) {
		return"/contasareceber/CadastroContasReceber";
	}

}
