package com.co.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the nota database table.
 * 
 */
@Entity
@NamedQuery(name="Nota.findAll", query="SELECT n FROM Nota n")
public class Nota implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer codigo;

	private String comentarioadmin;

	private String cuerpo;

	private String encabezado;

	private Timestamp fecha;

	private String valorizacion;

	//bi-directional many-to-one association to Categoria
	@ManyToOne
	@JoinColumn(name="codigo_categoria")
	private Categoria categoria;

	//bi-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="codigo_persona")
	private Persona persona;

	public Nota() {
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getComentarioadmin() {
		return this.comentarioadmin;
	}

	public void setComentarioadmin(String comentarioadmin) {
		this.comentarioadmin = comentarioadmin;
	}

	public String getCuerpo() {
		return this.cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public String getEncabezado() {
		return this.encabezado;
	}

	public void setEncabezado(String encabezado) {
		this.encabezado = encabezado;
	}

	public Timestamp getFecha() {
		return this.fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	public String getValorizacion() {
		return this.valorizacion;
	}

	public void setValorizacion(String valorizacion) {
		this.valorizacion = valorizacion;
	}

	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}