package com.stefanini.model;
// default package
// Generated 09/11/2016 08:59:45 by Hibernate Tools 4.3.1.Final

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

/**
 * Localinfracao generated by hbm2java
 */
@Entity
@Table(name = "localinfracao", catalog = "hackathon")
public class LocalInfracao implements java.io.Serializable {

	private Integer idLocalInfracao;
	private String descricaoLocalInfracao;
	private Double velocidadePermitida;
	private Set<Infracoes> infracoeses = new HashSet<Infracoes>(0);

	public LocalInfracao() {
	}

	public LocalInfracao(String descricaoLocalInfracao, Double velocidadePermitida, Set<Infracoes> infracoeses) {
		this.descricaoLocalInfracao = descricaoLocalInfracao;
		this.velocidadePermitida = velocidadePermitida;
		this.infracoeses = infracoeses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idLocalInfracao", unique = true, nullable = false)
	public Integer getIdLocalInfracao() {
		return this.idLocalInfracao;
	}

	public void setIdLocalInfracao(Integer idLocalInfracao) {
		this.idLocalInfracao = idLocalInfracao;
	}

	@Column(name = "descricaoLocalInfracao", length = 100)
	public String getDescricaoLocalInfracao() {
		return this.descricaoLocalInfracao;
	}

	public void setDescricaoLocalInfracao(String descricaoLocalInfracao) {
		this.descricaoLocalInfracao = descricaoLocalInfracao;
	}

	@Column(name = "velocidadePermitida", precision = 22, scale = 0)
	public Double getVelocidadePermitida() {
		return this.velocidadePermitida;
	}

	public void setVelocidadePermitida(Double velocidadePermitida) {
		this.velocidadePermitida = velocidadePermitida;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "localinfracao")
	public Set<Infracoes> getInfracoeses() {
		return this.infracoeses;
	}

	public void setInfracoeses(Set<Infracoes> infracoeses) {
		this.infracoeses = infracoeses;
	}

}
