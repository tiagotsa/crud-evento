package com.listaevento.evento.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.listaevento.evento.models.Evento;
import com.listaevento.evento.repository.EventoRepository;

@Controller
public class EventoController {

	@Autowired
	private EventoRepository evento;
	
	@RequestMapping(value="/cadastrarEvento", method=RequestMethod.GET)
	public String form() {
		return "evento/formEvento";
		
		}
	
	@RequestMapping(value="/cadastrarEvento", method=RequestMethod.POST)
	public String form(Evento event) {
			evento.save(event);
			
			return "redirect:/cadastrarEvento";
	}
	
	
}
	