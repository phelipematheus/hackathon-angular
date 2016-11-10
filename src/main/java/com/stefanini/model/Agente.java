package com.stefanini.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "agente", catalog = "hackathon")
public class Agente implements java.io.Serializable {

	private Integer idAgente;
	private String nome;
	private Date dtContratacao;
	private Integer tempoServico;
	private Set<Infracoes> infracoeses = new HashSet<Infracoes>(0);

	public Agente() {
	}

	public Agente(String nome, Date dtContratacao, Integer tempoServico, Set<Infracoes> infracoeses) {
		this.nome = nome;
		this.dtContratacao = dtContratacao;
		this.tempoServico = tempoServico;
		this.infracoeses = infracoeses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idAgente", unique = true, nullable = false)
	public Integer getIdAgente() {
		return this.idAgente;
	}

	public void setIdAgente(Integer idAgente) {
		this.idAgente = idAgente;
	}

	@Column(name = "nome", length = 100)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dtContratacao", length = 10)
	public Date getDtContratacao() {
		return this.dtContratacao;
	}

	public void setDtContratacao(Date dtContratacao) {
		this.dtContratacao = dtContratacao;
	}

	@Column(name = "tempoServico")
	public Integer getTempoServico() {
		return this.tempoServico;
	}

	public void setTempoServico(Integer tempoServico) {
		this.tempoServico = tempoServico;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "agente")
	public Set<Infracoes> getInfracoeses() {
		return this.infracoeses;
	}

	public void setInfracoeses(Set<Infracoes> infracoeses) {
		this.infracoeses = infracoeses;
	}

}
