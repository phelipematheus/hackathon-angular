package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.TipoInfracao;

public class TiposDeInfracaoRepository {
	
	@Inject
	private EntityManager manager;
	
	public void incluir(TipoInfracao tipoinfracao){
		this.manager.merge(tipoinfracao);
	}
	
	public void excluir(TipoInfracao tipoinfracao){
		this.manager.remove(tipoinfracao);
	}
	
	public TipoInfracao busca(Integer id) {
		return this.manager.find(TipoInfracao.class, id);
	}

	public List<TipoInfracao> lista() {
		return this.manager.createQuery("select a from TipoInfracao a", TipoInfracao.class).getResultList();
	}
}
