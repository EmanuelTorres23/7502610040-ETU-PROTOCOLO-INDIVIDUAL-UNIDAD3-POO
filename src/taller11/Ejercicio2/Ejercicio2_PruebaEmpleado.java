package taller11.Ejercicio2;

public class Ejercicio2_PruebaEmpleado {
    public static void main(String[] args) {
        // Creamos los objetos usando polimorfismo con la clase abstracta
        Ejercicio2_Empleado gerente = new Ejercicio2_Gerente("Carlos Pérez", 3000000, 800000);
        Ejercicio2_Empleado vendedor = new Ejercicio2_Vendedor("Ana Gómez", 1300000, 450000);

        // Mostramos los detalles de cada empleado
        gerente.mostrarDetalles();
        System.out.println("-------------------------");
        vendedor.mostrarDetalles();
    }
}