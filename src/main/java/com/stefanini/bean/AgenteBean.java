package com.stefanini.bean;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Agente;
import com.stefanini.service.AgenteService;

@Named("agenteMB")
@RequestScoped
public class AgenteBean {
	
	@Inject
	private Agente agente;
	
	private List<Agente> lista;
	
	@Inject
	private AgenteService agenteService;
	
	public void incluir() {
		agenteService.incluir(this.agente);
    }
	public void editar() {
		agenteService.incluir(this.agente);
    }
	
	public void excluir() {
		this.agenteService.excluir(this.agente);
		this.lista = null;
	}

	public List<Agente> getLista() {
		if(this.lista == null)
			this.lista = agenteService.lista();
		return this.lista;
	}
	
	public Agente getAgente() {
		if(agente == null)
			agente = new Agente();
		return agente;
	}

	public void setAgente(Agente agente) {
		this.agente = agente;
	}

	public void setLista(List<Agente> lista) {
		this.lista = lista;
	}
	
}
