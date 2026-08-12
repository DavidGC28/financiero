package financiero.krakedev.financiero.entidades;
public class TestFinanciero {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("1712345678", "David", "G.");
        
        
        Cuenta cuenta = new Cuenta("12345");
        
      
        cuenta.setPropietario(cliente);
        
    
        cuenta.imprimir();
    }
}