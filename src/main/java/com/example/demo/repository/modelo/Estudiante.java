package com.example.demo.repository.modelo;

import java.time.LocalDateTime;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private LocalDateTime fecha;
	private LocalDateTime fechaNacimiento;
	
	
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", fecha=" + fecha
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
	
	//Set and get
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * @return the cedula
	 */
	public String getCedula() {
		return cedula;
	}
	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	/**
	 * @return the fecha
	 */
	public LocalDateTime getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	/**
	 * @return the fechaNacimiento
	 */
	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}
	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	
}
