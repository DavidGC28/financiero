package com.krakedev.financiero.servicios;

import financiero.krakedev.financiero.entidades.Cliente;
import financiero.krakedev.financiero.entidades.Cuenta;

public class TestDepositar {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Cliente cliente = new Cliente("1712345678", "Ana", "López");
        Cuenta cuenta = banco.crearCuenta(cliente);

        System.out.println("=== ESTADO INICIAL ===");
        cuenta.imprimir();
        
        System.out.println("\n=== PRUEBA 1: Depósito Válido (50.0) ===");
        boolean resultado1 = banco.depositar(50.0, cuenta);
        System.out.println("¿Depósito exitoso?: " + resultado1);
        cuenta.imprimir();

        System.out.println("\n=== PRUEBA 2: Depósito Inválido (-20.0) ===");
        boolean resultado2 = banco.depositar(-20.0, cuenta);
        System.out.println("¿Depósito exitoso?: " + resultado2);
        cuenta.imprimir();

        System.out.println("\n=== PRUEBA 3: Depósito Inválido con Cero (0.0) ===");
        boolean resultado3 = banco.depositar(0.0, cuenta);
        System.out.println("¿Depósito exitoso?: " + resultado3);
        cuenta.imprimir();
    }
}