package com.danielperez.act6;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {

	//	String Nombre = "Daniel Perez <br>";
	//	String Matricula = "2850385 <br>";
	//	String Escuela = "Tecmilenio <br>";
	//	String Materia = "Computacion Avanzada de Java <br>";
	//	String Maestro = "Juan Carlos Espinoza Ceniceros <br>" ;

		String lista = "<center>"+
						" <ul>"+
						"<li> Daniel Perez </li>"+ 
						"<li> 2850385 </li>"+ 
						"<li> Tecmilenio </li>"+ 
						"<li> Computacion Avanzada de Java </li>"+
						"<li> Juan Carlos Espinoza Ceniceros </li>"+
						"</ul>"+
						"</center>";

        return lista ;
	}

}