package taller13.Ejercicio1;

public class PruebaFiguras {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(4, 5);
        Triangulo triangulo = new Triangulo(4, 5);

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
    }
}