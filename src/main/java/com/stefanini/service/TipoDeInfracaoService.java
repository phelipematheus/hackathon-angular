package com.stefanini.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.TipoInfracao;
import com.stefanini.repository.TiposDeInfracaoRepository;

@Stateless
public class TipoDeInfracaoService {
    @Inject
    private TiposDeInfracaoRepository tipoinfracaoRepository;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void incluir(TipoInfracao tipoinfracao){
    	this.tipoinfracaoRepository.incluir(tipoinfracao);
    }
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public List<TipoInfracao> lista(){
    	return this.tipoinfracaoRepository.lista();
    }
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void excluir(TipoInfracao tipoinfracao){
    	this.tipoinfracaoRepository.excluir(tipoinfracao);
    }
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void editar(TipoInfracao tipoinfracao){
    	this.tipoinfracaoRepository.incluir(tipoinfracao);
    }
}
