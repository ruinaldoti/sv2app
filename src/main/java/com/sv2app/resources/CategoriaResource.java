package com.sv2app.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	public String listar() {
		return "Rest esta funcionando!!!";
	}

}
