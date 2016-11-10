package com.stefanini.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Proprietario;
import com.stefanini.repository.ProprietarioRepository;

@Stateless
public class ProprietarioService {
	@Inject
	private ProprietarioRepository proprietarioRepository;

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void incluir(Proprietario proprietario) {
		this.proprietarioRepository.incluir(proprietario);
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public List<Proprietario> lista() {
		return this.proprietarioRepository.lista();
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void excluir(Proprietario proprietario) {
		this.proprietarioRepository.excluir(proprietario);
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void editar(Proprietario proprietario) {
		this.proprietarioRepository.incluir(proprietario);
	}
}
