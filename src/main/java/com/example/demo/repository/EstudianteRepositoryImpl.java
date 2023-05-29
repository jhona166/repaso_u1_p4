package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

@Repository
public class EstudianteRepositoryImpl implements EstudianteRepository{
	private static List<Estudiante> baseDatos = new ArrayList<>();
	
	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		baseDatos.add(estudiante);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		Estudiante estu = this.seleccionar(cedula);
		baseDatos.remove(estu);
	}

	@Override
	public Estudiante actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.eliminar(estudiante.getCedula());
		this.insertar(estudiante);
		
		return null;
	}

	@Override
	public Estudiante seleccionar(String cedula) {
		// TODO Auto-generated method stub
		Estudiante estuEncontrado = new Estudiante();
		for(Estudiante estu:baseDatos) {
			if(cedula.equals(estu.getCedula())) {
			estuEncontrado = estu; 	
			}else {
				
			}
			
		}
		
		return estuEncontrado;
	}

	@Override
	public List<Estudiante> seleccionarTodos() {
		// TODO Auto-generated method stub
		return baseDatos;
	}

}
