package taller11.Ejercicio1;

public class Ejercicio1_Rectangulo extends Ejercicio1_Figura {
    private double base;
    private double altura;

    public Ejercicio1_Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}