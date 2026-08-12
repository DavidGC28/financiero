package com.krakedev.financiero.servicios;

import financiero.krakedev.financiero.entidades.Cliente;
import financiero.krakedev.financiero.entidades.Cuenta;

public class Banco {
    private int ultimoCodigo = 1000;

  
    public Banco() {
        
    }

  
    public Cuenta crearCuenta(Cliente cliente) {
       
        String codigoStr = ultimoCodigo + "";
        
       
        ultimoCodigo++;
        
      
        Cuenta nuevaCuenta = new Cuenta(codigoStr);
        
        
        nuevaCuenta.setPropietario(cliente);
        
     
        return nuevaCuenta;
    }
    
    public boolean depositar(double monto, Cuenta cuenta) {
        if (monto > 0) {
            double saldoActual = cuenta.getSaldoActual();
            cuenta.setSaldoActual(saldoActual + monto);
            return true;
        } else {
            return false;
        }
    }
    
    

    public boolean retirar(double monto, Cuenta cuenta) {
        
        if (monto > 0 && monto <= cuenta.getSaldoActual()) {
            double saldoActual = cuenta.getSaldoActual();
            cuenta.setSaldoActual(saldoActual - monto);
            return true;
        } else {
            return false;
        }
    }
    

    public boolean transferir(double monto, Cuenta origen, Cuenta destino) {
       
        if (retirar(monto, origen)) {
           
            depositar(monto, destino);
            return true;
        } else {
            
            return false;
        }
    }
    

    public int getUltimoCodigo() {
        return ultimoCodigo;
    }

    public void setUltimoCodigo(int ultimoCodigo) {
        this.ultimoCodigo = ultimoCodigo;
    }
}