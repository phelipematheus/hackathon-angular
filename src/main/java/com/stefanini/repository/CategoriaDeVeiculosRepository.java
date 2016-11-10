package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Categoria;

public class CategoriaDeVeiculosRepository {
	
	@Inject
	private EntityManager manager;
	
	public void incluir(Categoria categoria){
		this.manager.merge(categoria);
	}
	
	public void excluir(Categoria categoria){
		this.manager.remove(categoria);
	}
	
	public Categoria busca(Integer id) {
		return this.manager.find(Categoria.class, id);
	}

	public List<Categoria> lista() {
		return this.manager.createQuery("select a from Categoria a", Categoria.class).getResultList();
	}
}
