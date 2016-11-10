package com.stefanini.model;
// default package
// Generated 09/11/2016 08:59:45 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Veiculos generated by hbm2java
 */
@Entity
@Table(name = "veiculos", catalog = "hackathon")
public class Veiculos implements java.io.Serializable {

	private String placa;
	private Modelo modelo;
	private Proprietario proprietario;
	private String uf;
	private Set<Infracoes> infracoeses = new HashSet<Infracoes>(0);

	public Veiculos() {
	}

	public Veiculos(String placa, Modelo modelo, Proprietario proprietario, String uf) {
		this.placa = placa;
		this.modelo = modelo;
		this.proprietario = proprietario;
		this.uf = uf;
	}

	public Veiculos(String placa, Modelo modelo, Proprietario proprietario, String uf, Set<Infracoes> infracoeses) {
		this.placa = placa;
		this.modelo = modelo;
		this.proprietario = proprietario;
		this.uf = uf;
		this.infracoeses = infracoeses;
	}

	@Id

	@Column(name = "placa", unique = true, nullable = false, length = 7)
	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idModelo", nullable = false)
	public Modelo getModelo() {
		return this.modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cpfProprietario", nullable = false)
	public Proprietario getProprietario() {
		return this.proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	@Column(name = "uf", nullable = false, length = 2)
	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "veiculos")
	public Set<Infracoes> getInfracoeses() {
		return this.infracoeses;
	}

	public void setInfracoeses(Set<Infracoes> infracoeses) {
		this.infracoeses = infracoeses;
	}

}
