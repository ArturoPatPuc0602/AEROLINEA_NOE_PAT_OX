package com.tuempresa.aerolinea.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Persona extends Identificable{

	@Column(length=32)
	@Required
	String nombre;
	
	@Column(length=32)
	String apellido;
	
	@Column(length=32)
	String pais;
	
	
	@Files
	@Column(length=32)
	String fotos;
	
	
	@Embedded
	Direccion direccion;
	
	
}
