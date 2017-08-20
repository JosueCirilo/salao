package com.josue.salao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.josue.salao.model.Agendamento;

@Controller
public class AgendamentoController {
	
	@RequestMapping("/agendamentos/novo")
	public String novo( Agendamento agendamento) {
		return"/agendamento/CadastroAgendamento";
	}

}
