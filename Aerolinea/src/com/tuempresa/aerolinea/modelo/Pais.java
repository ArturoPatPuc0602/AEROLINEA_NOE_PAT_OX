package com.tuempresa.aerolinea.modelo;

import java.util.*;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter

public class Pais extends Identificable{
	
	
	
	String nombre;
	
	@OneToMany(mappedBy="pais")
	Collection<Tripulacion>tripulacion;
	
	
}
