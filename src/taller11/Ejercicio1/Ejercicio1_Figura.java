package taller11.Ejercicio1;

public abstract class Ejercicio1_Figura {
    protected String nombre;

    public Ejercicio1_Figura(String nombre) {
        this.nombre = nombre;
    }

    //Método abstracto para calcular el área
    public abstract double calcularArea();

    //Método concreto que utiliza el método abstracto
    public void mostrarArea() {
        System.out.println("Figura: " + nombre);
        System.out.println("Área: " + calcularArea());
    }
}