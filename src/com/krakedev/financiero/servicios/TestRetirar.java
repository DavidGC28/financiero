package com.krakedev.financiero.servicios;

import financiero.krakedev.financiero.entidades.Cliente;
import financiero.krakedev.financiero.entidades.Cuenta;

public class TestRetirar {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Cliente cliente = new Cliente("1712345678", "Carlos", "Pérez");
        Cuenta cuenta = banco.crearCuenta(cliente);

        
        banco.depositar(100.0, cuenta);

        System.out.println("=== ESTADO INICIAL (Saldo: 100.0) ===");
        cuenta.imprimir();

        System.out.println("\n=== PRUEBA 1: Retiro Exitoso (40.0) ===");
        boolean resultado1 = banco.retirar(40.0, cuenta);
        System.out.println("¿Retiro exitoso?: " + resultado1);
        cuenta.imprimir(); 

        System.out.println("\n=== PRUEBA 2: Retiro Inválido - Monto mayor al saldo (100.0) ===");
        boolean resultado2 = banco.retirar(100.0, cuenta);
        System.out.println("¿Retiro exitoso?: " + resultado2);
        cuenta.imprimir(); 

        System.out.println("\n=== PRUEBA 3: Retiro Inválido - Monto negativo (-10.0) ===");
        boolean resultado3 = banco.retirar(-10.0, cuenta);
        System.out.println("¿Retiro exitoso?: " + resultado3);
        cuenta.imprimir(); 

        System.out.println("\n=== PRUEBA 4: Retiro Inválido - Monto en cero (0.0) ===");
        boolean resultado4 = banco.retirar(0.0, cuenta);
        System.out.println("¿Retiro exitoso?: " + resultado4);
        cuenta.imprimir(); 
    }
}