package com.es.esercizio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="persone")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Persona {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String cognome;
	private int età;
	
	public Persona(String name, String cognome, int età) {
	

		this.name = name;
		this.cognome = cognome;
		this.età = età;
	}
	
	
	
	
	

}

