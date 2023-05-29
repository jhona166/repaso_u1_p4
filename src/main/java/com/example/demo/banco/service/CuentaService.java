package com.example.demo.banco.service;

import java.util.List;

import com.example.demo.banco.repository.modelo.Cuenta;

public interface CuentaService {
	public void guardar(Cuenta cuenta);
	public void actualiza(Cuenta cuenta);
	public void borrar(String numero);
	public Cuenta seleccionarPorNumero(String numero);
	public List<Cuenta> reporteCuentas();
}
