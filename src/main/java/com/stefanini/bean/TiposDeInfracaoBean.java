package com.stefanini.bean;

import java.util.Date;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.TipoInfracao;
import com.stefanini.service.TipoDeInfracaoService;

@Named("tiposdeinfracaoMB")
@RequestScoped
public class TiposDeInfracaoBean {
	
	@Inject
	private TipoInfracao tipoinfracao;
	
	private List<TipoInfracao> lista;
	
	@Inject
	private TipoDeInfracaoService tipoinfracaoService;
	
	public void incluir() {
		tipoinfracaoService.incluir(this.tipoinfracao);
    }
	public void editar() {
		tipoinfracaoService.incluir(this.tipoinfracao);
    }
	
	public String excluir() {
		this.tipoinfracaoService.excluir(this.tipoinfracao);
		this.lista = null;
		return null;
	}

	public TipoInfracao getTipoInfracao() {
		if(tipoinfracao == null)
			tipoinfracao = new TipoInfracao();
		return tipoinfracao;
	}

	public void setTipoInfracao(TipoInfracao tipoinfracao) {
		this.tipoinfracao = tipoinfracao;
	}

	public List<TipoInfracao> getLista() {
		if(this.lista == null)
			this.lista = tipoinfracaoService.lista();
		return this.lista;
	}

	public void setLista(List<TipoInfracao> lista) {
		this.lista = lista;
	}
	
}