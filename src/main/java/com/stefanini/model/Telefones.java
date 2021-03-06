package com.stefanini.model;
// default package
// Generated 09/11/2016 08:59:45 by Hibernate Tools 4.3.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Telefones generated by hbm2java
 */
@Entity
@Table(name = "telefones", catalog = "hackathon")
public class Telefones implements java.io.Serializable {

	private TelefonesId id;
	private Proprietario proprietario;
	private Tipotelefone tipotelefone;

	public Telefones() {
	}

	public Telefones(TelefonesId id, Proprietario proprietario, Tipotelefone tipotelefone) {
		this.id = id;
		this.proprietario = proprietario;
		this.tipotelefone = tipotelefone;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "numero", column = @Column(name = "numero", nullable = false)),
			@AttributeOverride(name = "ddd", column = @Column(name = "ddd", nullable = false)) })
	public TelefonesId getId() {
		return this.id;
	}

	public void setId(TelefonesId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cpfProprietario", nullable = false)
	public Proprietario getProprietario() {
		return this.proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idTipoTelefone", nullable = false)
	public Tipotelefone getTipotelefone() {
		return this.tipotelefone;
	}

	public void setTipotelefone(Tipotelefone tipotelefone) {
		this.tipotelefone = tipotelefone;
	}

}
