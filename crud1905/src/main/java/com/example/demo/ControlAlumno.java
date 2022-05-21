package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControlAlumno {

//Lista de Objetos*********
List<ModeloAlumno> Listita = new ArrayList<ModeloAlumno>();

@GetMapping
//Para asociar con el formulario html****
	public String form1(Model modelo) {
	
	Listita.add(new ModeloAlumno(123,"Jose","Cardenas",18)); 
	Listita.add(new ModeloAlumno(456,"Raul","Mendoza",20));
	Listita.add(new ModeloAlumno(789,"Rene","Puca",25));        //Creamos un alumno, llamamos al constructor y le pasamos los datos del alumno
	modelo.addAttribute("alu",Listita);      //
	return "formulario";
	
	}

@GetMapping("/add")
public String form2(Model modelo) {
	 
	Listita.add(new ModeloAlumno(456,"Ramon","Cordoba",20));       //Creamos un alumno, llamamos al constructor y le pasamos los datos del alumno
	
	modelo.addAttribute("alu",Listita);      //
	
	return "formulario";
	
	}

}
