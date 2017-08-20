package com.josue.salao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.josue.salao.model.Funcionario;

@Controller
public class FuncionariosController {
	
	@RequestMapping("/funcionarios/novo")
	public String novo(Funcionario funcionario) {
		return "funcionario/CadastroFuncionario";
	}

}
