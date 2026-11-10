package taller11.Ejercicio1;

public class Ejercicio1_Circulo extends Ejercicio1_Figura {
    private double radio;

    public Ejercicio1_Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}