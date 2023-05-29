package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteRepository {
	public void insertar(Estudiante estudiante);
	public void eliminar(String cedula);
	public Estudiante actualizar(Estudiante estudiante);
	public Estudiante seleccionar(String cedula);
	public List<Estudiante> seleccionarTodos();
	
}
