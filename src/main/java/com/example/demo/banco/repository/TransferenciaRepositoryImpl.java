package com.example.demo.banco.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.repository.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements TransferenciaRepository {
	public static List<Transferencia> baseDatos = new ArrayList<>();
	@Override
	public void insertar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		baseDatos.add(transferencia);
	}

	@Override
	public void actualiza(Transferencia transferencia) {
		// TODO Auto-generated method stub
	this.eliminar(transferencia.getNumero());
	this.insertar(transferencia);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
	Transferencia transfer = this.seleccionarPorNumero(numero);
	baseDatos.remove(transfer);
	}

	@Override
	public Transferencia seleccionarPorNumero(String numero) {
		// TODO Auto-generated method stub
		Transferencia transferEncontrado = new Transferencia();
		for(Transferencia transfer:baseDatos) {
			if(numero.equals(transfer.getNumero())){
				transferEncontrado =transfer;
			}else {
				
			}
			
		}
		return transferEncontrado;
	}
	
}
