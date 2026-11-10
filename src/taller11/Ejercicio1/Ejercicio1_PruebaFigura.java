package taller11.Ejercicio1;

public class Ejercicio1_PruebaFigura {
    public static void main(String[] args) {
        // Creamos objetos usando la clase abstracta como referencia (Polimorfismo)
        Ejercicio1_Figura circulo = new Ejercicio1_Circulo("Círculo 1", 4.0);
        Ejercicio1_Figura rectangulo = new Ejercicio1_Rectangulo("Rectángulo 1", 5.0, 3.0);

        // Probamos el método que exige el punto 3 del taller
        circulo.mostrarArea();
        System.out.println("-------------");
        rectangulo.mostrarArea();
    }
}