package com.josue.salao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.josue.salao.model.Usuario;

@Controller
public class UsuarioController {
	
	@RequestMapping("/usuarios/novo")
	public String novo(Usuario usuario) {
		return"usuario/CadastroUsuario";
	}

}
