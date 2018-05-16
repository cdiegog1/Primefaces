package com.co.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the telefono database table.
 * 
 */
@Entity
@NamedQuery(name="Telefono.findAll", query="SELECT t FROM Telefono t")
public class Telefono implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer codigo;

	private String numero;

	//bi-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="codigo_persona")
	private Persona persona;

	public Telefono() {
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}