package com.example.demo.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.repository.TransferenciaRepository;
import com.example.demo.banco.repository.modelo.Transferencia;

@Service
public class TransferenciaServiceImpl implements TransferenciaService {
	@Autowired
	private TransferenciaRepository transferenciaRepository;

	@Override
	public void guardar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.transferenciaRepository.insertar(transferencia);
	}

	@Override
	public void actualiza(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.transferenciaRepository.actualiza(transferencia);
	}

	@Override
	public void borrar(String transferencia) {
		// TODO Auto-generated method stub
		this.transferenciaRepository.eliminar(transferencia);
	}

	@Override
	public Transferencia seleccionarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.transferenciaRepository.seleccionarPorNumero(numero);
	}
	
}
