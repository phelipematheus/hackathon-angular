package com.stefanini.bean;

import java.util.Date;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Categoria;
import com.stefanini.service.CategoriaDeVeiculosService;

@Named("categoriadeveiculosMB")
@RequestScoped
public class CategoriaDeVeiculosBean {
	
	@Inject
	private Categoria categoria;
	
	private List<Categoria> lista;
	
	@Inject
	private CategoriaDeVeiculosService categoriaService;
	
	public void incluir() {
		categoriaService.incluir(this.categoria);
    }
	public void editar() {
		categoriaService.incluir(this.categoria);
    }
	
	public String excluir() {
		this.categoriaService.excluir(this.categoria);
		this.lista = null;
		return null;
	}

	public Categoria getCategoria() {
		if(categoria == null)
			categoria = new Categoria();
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Categoria> getLista() {
		if(this.lista == null)
			this.lista = categoriaService.lista();
		return this.lista;
	}

	public void setLista(List<Categoria> lista) {
		this.lista = lista;
	}
	
}