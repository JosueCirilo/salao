package com.josue.salao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.josue.salao.model.Cidade;

@Controller
public class CidadeController {
	
	@RequestMapping("/cidades/nova")
	public String nova( Cidade cidade){
		return"/cidade/CadastroCidade";
	}

}
