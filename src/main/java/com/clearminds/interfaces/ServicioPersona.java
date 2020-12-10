package com.clearminds.interfaces;

import com.clearminds.model.Persona;

public interface ServicioPersona {
	
	public boolean insertar(Persona persona);
	
	public boolean actualizar(Persona persona);
	
	public boolean eliminar(Persona persona);

}
