package com.clearminds.impl;

import com.clearminds.model.Persona;

public class TestManager {
	
	public static void main(String[] args) {
		PersonaManager pManager = new PersonaManager();
		Persona p = new Persona();
		p.setNombre("Daniel");
		p.setApellido("Montes");
		p.setId(1);
		pManager.insertarPersona(p);
	}
	
}
