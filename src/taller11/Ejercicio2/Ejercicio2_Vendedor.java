package taller11.Ejercicio2;

public class Ejercicio2_Vendedor extends Ejercicio2_Empleado {
    private double comision;

    // El constructor debe llamarse igual que la clase
    public Ejercicio2_Vendedor(String nombre, double salarioBase, double comision) {
        super(nombre, salarioBase);
        this.comision = comision;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comision;
    }
}