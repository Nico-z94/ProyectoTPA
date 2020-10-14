	//Paquetes:
	package com.example.alumno.controllers;
	import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;
	import com.example.alumno.dtos.AlumnoDTO;
	import com.example.alumno.services.AlumnoService;
	import org.springframework.web.bind.annotation.RequestMethod;

	@RestController
	@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
	@RequestMapping(path = "/app/alumno")
	public class AlumnoController extends BaseController<AlumnoDTO>{

	private AlumnoService alumnoService;
	
	public AlumnoController(AlumnoService alumnoService) {
		super(alumnoService);
		this.alumnoService = alumnoService;
	}
	
}
