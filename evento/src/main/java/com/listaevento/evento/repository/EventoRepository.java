package com.listaevento.evento.repository;




import org.springframework.data.jpa.repository.JpaRepository;


import com.listaevento.evento.models.Evento;


	public interface EventoRepository extends JpaRepository <Evento, Long>{
			
	}

