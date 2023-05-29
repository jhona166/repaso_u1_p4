package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteService {
	public void crear(Estudiante estudiante);
	public void borrar(String cedula);
	public Estudiante actualizar(Estudiante estudiante);
	public Estudiante seleccionarPorCedula(String cedula);
	public List<Estudiante> reporteTodos();
	
}
