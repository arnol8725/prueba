package com.formaciondbi.springboot.app.commons.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.FetchType;
@Entity
@Table(name="roles")
public class Role implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@Column(unique=true, length=30)
	private String nombre;
	
/*	@ManyToMany( fetch= FetchType.LAZY, mappedBy = "roles" )
	private List<Usuario> usuarios;
*/	
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	







	@Override
	public String toString() {
		return "Role [id=" + id + ", nombre=" + nombre + "]";
	}




	/**
	 * 
	 */
	private static final long serialVersionUID = 4850634770280927344L;
	

}
