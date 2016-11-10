package com.stefanini.bean;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Proprietario;
import com.stefanini.service.ProprietarioService;

@Named("proprietarioMB")
@RequestScoped
public class ProprietarioBean {

	@Inject
	private Proprietario proprietario;

	private List<Proprietario> lista;

	@Inject
	private ProprietarioService proprietarioService;

	public void incluir() {
		proprietarioService.incluir(this.proprietario);
	}

	public void editar() {
		proprietarioService.incluir(this.proprietario);
	}

	public String excluir() {
		this.proprietarioService.excluir(this.proprietario);
		this.lista = null;
		return null;
	}

	public Proprietario getProprietario() {
		if (proprietario == null)
			proprietario = new Proprietario();
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public List<Proprietario> getLista() {
		if (this.lista == null)
			this.lista = proprietarioService.lista();
		return this.lista;
	}

	public void setLista(List<Proprietario> lista) {
		this.lista = lista;
	}

}
