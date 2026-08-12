package com.krakedev.financiero.servicios;

import financiero.krakedev.financiero.entidades.Cliente;
import financiero.krakedev.financiero.entidades.Cuenta;

public class TestTransferir {
    public static void main(String[] args) {
        Banco banco = new Banco();
        
       
        Cliente cliente1 = new Cliente("1111", "Juan", "Perez");
        Cliente cliente2 = new Cliente("2222", "Maria", "Gomez");
        
        Cuenta cuentaOrigen = banco.crearCuenta(cliente1);
        Cuenta cuentaDestino = banco.crearCuenta(cliente2);
        
      
        banco.depositar(100.0, cuentaOrigen); 
        
        System.out.println("=== ESTADO INICIAL ===");
        System.out.println("Saldo Origen: " + cuentaOrigen.getSaldoActual()); 
        System.out.println("Saldo Destino: " + cuentaDestino.getSaldoActual()); 

        System.out.println("\n=== PRUEBA 1: Transferencia Exitosa (40.0) ===");
        boolean resultado1 = banco.transferir(40.0, cuentaOrigen, cuentaDestino);
        System.out.println("¿Transferencia exitosa?: " + resultado1);
        System.out.println("Nuevo Saldo Origen: " + cuentaOrigen.getSaldoActual()); 
        System.out.println("Nuevo Saldo Destino: " + cuentaDestino.getSaldoActual()); 

        System.out.println("\n=== PRUEBA 2: Transferencia Fallida - Fondos Insuficientes (100.0) ===");
        boolean resultado2 = banco.transferir(100.0, cuentaOrigen, cuentaDestino);
        System.out.println("¿Transferencia exitosa?: " + resultado2);
        System.out.println("Saldo Origen final: " + cuentaOrigen.getSaldoActual()); 
        System.out.println("Saldo Destino final: " + cuentaDestino.getSaldoActual()); 
    }
}
