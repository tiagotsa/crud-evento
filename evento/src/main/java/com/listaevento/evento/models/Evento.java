package com.listaevento.evento.models;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@Entity
@Table(name = "evento")
public class Evento {
	 
	
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Id
	 private Long id;
     
     @Column
     private String nome;
     private String local;
     private String data;
     private String horario;
     
     
        public Evento(String nome, String local, String data, String horario) {

	
		this.nome = nome;
		this.local = local;
		this.data = data;
		this.horario = horario;
	}
      
        public Evento() {

    }
          
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
     
     
	
	
}

