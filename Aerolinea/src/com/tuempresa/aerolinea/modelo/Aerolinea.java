package com.tuempresa.aerolinea.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Aerolinea extends Identificable{
	
	
	
	 @Required
	 String nombre;
	 
	 
	 
	 @OneToMany(mappedBy="aerolinea")
	 Collection<Tripulacion>tripulacion;
 

}
