package com.example.demo.banco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.repository.CuentaRepository;
import com.example.demo.banco.repository.modelo.Cuenta;
@Service
public class CuentaServiceImpl implements CuentaService {
	@Autowired
	private CuentaRepository cuentaRepository;

	@Override
	public void guardar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.cuentaRepository.insertar(cuenta);
	}

	@Override
	public void actualiza(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.cuentaRepository.actualizar(cuenta);
	}

	@Override
	public void borrar(String transferencia) {
		// TODO Auto-generated method stub
		this.cuentaRepository.eliminar(transferencia);
	}

	@Override
	public Cuenta seleccionarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.cuentaRepository.seleccionarPorNumero(numero);
	}

	@Override
	public List<Cuenta> reporteCuentas() {
		// TODO Auto-generated method stub
		return this.cuentaRepository.reporteCuentas();
	}
}
