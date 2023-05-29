package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EstudianteRepository;
import com.example.demo.repository.modelo.Estudiante;

@Service
public class EstudianteServiceImpl implements EstudianteService{
	@Autowired
	private EstudianteRepository estudianteRepository;
	@Override
	public void crear(Estudiante estudiante) {
		// TODO Auto-generated method stub
	this.estudianteRepository.insertar(estudiante);	
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		this.estudianteRepository.eliminar(cedula);
	}

	@Override
	public Estudiante actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.actualizar(estudiante);
	}

	@Override
	public Estudiante seleccionarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.seleccionar(cedula);
	}

	@Override
	public List<Estudiante> reporteTodos() {
		// TODO Auto-generated method stub
		return this.estudianteRepository.seleccionarTodos();
	}

}
