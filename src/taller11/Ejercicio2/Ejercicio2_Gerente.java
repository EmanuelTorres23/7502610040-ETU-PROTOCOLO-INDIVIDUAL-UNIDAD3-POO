package taller11.Ejercicio2;

public class Ejercicio2_Gerente extends Ejercicio2_Empleado {
    private double bono;

    // El nombre del constructor debe ser exactamente igual al de la clase
    public Ejercicio2_Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }
}