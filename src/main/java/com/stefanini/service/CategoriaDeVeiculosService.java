package com.stefanini.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Categoria;
import com.stefanini.repository.CategoriaDeVeiculosRepository;

@Stateless
public class CategoriaDeVeiculosService {
    @Inject
    private CategoriaDeVeiculosRepository categoriaRepository;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void incluir(Categoria categoria){
    	this.categoriaRepository.incluir(categoria);
    }
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public List<Categoria> lista(){
    	return this.categoriaRepository.lista();
    }
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void excluir(Categoria categoria){
    	this.categoriaRepository.excluir(categoria);
    }
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void editar(Categoria categoria){
    	this.categoriaRepository.incluir(categoria);
    }
}
