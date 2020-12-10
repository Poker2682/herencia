package com.clearminds.impl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class PersonaManager {

	private ServicioPersona serv;
	
	public PersonaManager() {
		Class<?> clase;
		Properties p = new Properties();
		String path = "C:\\Users\\57300\\Documents\\Daniel\\CapacitacionCMC\\Repositorios\\herencia\\config.properties";
		try {
			p.load(new FileReader(path));
			clase = Class.forName(p.getProperty("claseImplementada"));
			serv=(ServicioPersona)clase.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		} catch (InstantiationException e) {
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		} catch (IOException e) {
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		}

	}

	public ServicioPersona getServ() {
		return serv;
	}

	public void setServ(ServicioPersona serv) {
		this.serv = serv;
	}
	
	public void insertarPersona(Persona persona) {
		serv.insertar(persona);
	}

}
