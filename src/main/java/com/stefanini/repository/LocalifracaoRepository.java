package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.LocalInfracao;

public class LocalifracaoRepository {
	
	@Inject
	private EntityManager manager;
	
	public void incluir(LocalInfracao infracao){
		this.manager.merge(infracao);
	}
	
	public void excluir(LocalInfracao infracao){
		this.manager.remove(infracao);
	}
	
	public LocalInfracao busca(Integer id) {
		return this.manager.find(LocalInfracao.class, id);
	}

	public List<LocalInfracao> lista() {
		return this.manager.createQuery("select a from Localinfracao a", LocalInfracao.class).getResultList();
	}
	
}
