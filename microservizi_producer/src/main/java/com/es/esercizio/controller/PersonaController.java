package com.es.esercizio.controller;




import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.es.esercizio.model.Persona;



@RestController
@RequestMapping("/app")
public class PersonaController {
	

	
	@GetMapping("/data1")
	public String Stringaendpoint() {return "Testa endpoint con stringa";}
	
	@GetMapping
	("/data2")
	 public List<List<String>> getData2() {
        List<List<String>> data = new ArrayList<>();
        data.add(Arrays.asList("John", "Doe", "30", "Male"));
        data.add(Arrays.asList("Jane", "Doe", "25", "Female"));
        data.add(Arrays.asList("Bob", "Smith", "45", "Male"));
        data.add(Arrays.asList("Alice", "Johnson", "32", "Female"));
        return data;
    }
	
	@GetMapping("/data3")
    public List<Persona> getData3() {
        List<Persona> data = new ArrayList<>();
        data.add(new Persona("John", "Doe", 30));
        data.add(new Persona("Jane", "Doe", 25));
        data.add(new Persona("Bob", "Smith", 45));
        data.add(new Persona("Alice", "Johnson", 32));
        return data;
    }

	

}
