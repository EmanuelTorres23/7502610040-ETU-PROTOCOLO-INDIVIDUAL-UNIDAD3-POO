package taller11.Ejercicio2;

public abstract class Ejercicio2_Empleado {
    protected String nombre;
    protected double salarioBase;

    public Ejercicio2_Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // Método abstracto que obliga a ser implementado en las subclases
    public abstract double calcularSalario();

    // Método concreto que utiliza calcularSalario para mostrar los detalles
    public void mostrarDetalles() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario Total: $" + calcularSalario());
    }
}