package com.krakedev.financiero.servicios;

import financiero.krakedev.financiero.entidades.Cliente;
import financiero.krakedev.financiero.entidades.Cuenta;

public class TestBanco {
    public static void main(String[] args) {
      
        Banco banco = new Banco();
        
        
        Cliente cliente1 = new Cliente("1711223344", "Juan", "Pérez");
        Cliente cliente2 = new Cliente("1755667788", "María", "Gómez");
        
      
        Cuenta cuenta1 = banco.crearCuenta(cliente1);
        Cuenta cuenta2 = banco.crearCuenta(cliente2);
        
        
        System.out.println("--- Prueba de Creación de Cuentas ---");
        cuenta1.imprimir();
        System.out.println();
        cuenta2.imprimir();
        
   
        System.out.println("\nPróximo código a utilizar en el banco: " + banco.getUltimoCodigo());
    }
}