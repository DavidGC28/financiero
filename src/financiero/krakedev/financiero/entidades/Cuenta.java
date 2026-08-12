package financiero.krakedev.financiero.entidades;

public class Cuenta {
    private String id;
    private double saldoActual;
    private String tipo;
   
    private Cliente propietario;

    public Cuenta(String id) {
        this.id = id;
        this.saldoActual = 0.0;
        this.tipo = "A";
    }

    
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public double getSaldoActual() { return saldoActual; }
    public void setSaldoActual(double saldoActual) { this.saldoActual = saldoActual; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    
    public Cliente getPropietario() {
        return propietario;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    
    public void imprimir() {
        System.out.println("--- Cuenta ---");
        System.out.println("ID: " + id);
        System.out.println("Saldo Actual: " + saldoActual);
        System.out.println("Tipo: " + tipo);
        
        
        if (propietario != null) {
            System.out.println("--- Propietario ---");
            System.out.println("Cédula cliente: " + propietario.getCedula());
            System.out.println("Nombre cliente: " + propietario.getNombre());
            System.out.println("Apellido cliente: " + propietario.getApellido());
        } else {
            System.out.println("Propietario: No asignado");
        }
    }
}