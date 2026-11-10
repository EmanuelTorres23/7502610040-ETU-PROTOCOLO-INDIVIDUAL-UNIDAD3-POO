package taller11.Ejercicio3;

public class Ejercicio3_ClaseAbstractaPunto2  {

    //Definir un método concreto en una clase abstracta
// que sea necesario sobrescribir en las clases derivadas
// Archivo: Ejercicio3_ClaseAbstracta_Punto2.java
// package taller11.Ejercicio2;

// abstract class AnimalPunto2 {
//     protected String nombre;
//
//     public AnimalPunto2(String nombre) {
//         this.nombre = nombre;
//     }
//
//     public abstract void hacerSonido();
//
//     // Método concreto que "debería" sobrescribirse, pero Java no lo obliga
//     public void moverse() {
//         System.out.println("El animal se mueve");
//     }
// }
//
// class PerroPunto2 extends AnimalPunto2 {
//     public PerroPunto2(String nombre) {
//         super(nombre);
//     }
//
//     @Override
//     public void hacerSonido() {
//         System.out.println("Guau");
//     }
//     // Olvidé sobrescribir moverse()
// }
//
// public class Ejercicio3_ClaseAbstracta_Punto2 {
//     public static void main(String[] args) {
//         PerroPunto2 p = new PerroPunto2("Firulais");
//         p.hacerSonido();  // Guau
//         p.moverse();      // Compila sin errores ni advertencias
//     }
// }
//
// Salida:
// Guau
// El animal se mueve
}
