package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.repository.modelo.Cuenta;
import com.example.demo.banco.service.CuentaService;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class PaU1P4R1JaApplication implements CommandLineRunner{
	@Autowired
	private CuentaService cuentaService;
	
	public static void main(String[] args) {
		SpringApplication.run(PaU1P4R1JaApplication.class, args);

		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Cuenta cuenta = new Cuenta();
		cuenta.setNumero("AO123");
		cuenta.setCedulaPropietario("1727501510");
		cuenta.setFechaApertura(LocalDate.of(2005, 03, 16));
		cuenta.setSaldo(new BigDecimal(800));
		cuenta.setTipo("A");
		this.cuentaService.guardar(cuenta);
	
		
		Cuenta cuenta1 = new Cuenta();
		cuenta1.setNumero("GA123");
		cuenta1.setCedulaPropietario("1727501511");
		cuenta1.setFechaApertura(LocalDate.of(2003, 03, 16));
		cuenta1.setSaldo(new BigDecimal(900));
		cuenta1.setTipo("C");
		this.cuentaService.guardar(cuenta1);

		Cuenta cuenta2 = new Cuenta();
		cuenta2.setNumero("KA123");
		cuenta2.setCedulaPropietario("1727501512");
		cuenta2.setFechaApertura(LocalDate.of(1994, 03, 16));
		cuenta2.setSaldo(new BigDecimal(2000));
		cuenta2.setTipo("A");
		this.cuentaService.guardar(cuenta2);
		
		
		System.out.println("Las cuentas ingresadas son: ");
		System.out.println(cuenta);
		System.out.println(cuenta1);
		System.out.println(cuenta2);
			
		
		
		System.out.println("Todas las cuentas  ");
		System.out.println(this.cuentaService.reporteCuentas());
		
		
		System.out.println("Elimino algunas de las cuentas  ");
		
		this.cuentaService.borrar("GA123");
		
		System.out.println(this.cuentaService.reporteCuentas());
		
		
		System.out.println("Modifico la cuenta ");
		cuenta2.setFechaApertura(LocalDate.of(2023, 05, 28));
		this.cuentaService.actualiza(cuenta2);
		
		System.out.println("Despues de la actualizada");
		System.out.println(cuenta2);
		
		System.out.println("Genero reporte final");
		System.out.println(this.cuentaService.reporteCuentas());
	}

}
