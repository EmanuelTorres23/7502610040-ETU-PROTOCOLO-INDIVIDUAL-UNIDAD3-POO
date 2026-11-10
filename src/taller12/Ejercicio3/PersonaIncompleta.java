// package taller12.Ejercicio3;
//
// Ejercicio 3: Implementación Incorrecta de Múltiples Interfaces

// 1. Intentar implementar una interfaz sin definir sus métodos.

// public class PersonaIncompleta implements Hablador, Trabajador {
// }

// Error: La clase no implementa los métodos obligatorios de las interfaces.

// Error de compilación:
// "PersonaIncompleta is not abstract and does not override abstract method hablar() in Hablador"

// ¿Por qué está mal? Cuando una clase utiliza implements, se compromete a cumplir
// todos los métodos definidos en la interfaz. Si no los implementa, Java genera
// un error de compilación. Para solucionarlo, se deben implementar los métodos
// correspondientes o declarar la clase como abstracta.


// 2. Implementar interfaces en clases que no tienen lógica relevante.

// interface Vehiculo {
//     void acelerar();
//     void frenar();
// }

// class Computador implements Vehiculo {
//     public void acelerar() {
//         System.out.println("Acelerando");
//     }
//
//     public void frenar() {
//         System.out.println("Frenando");
//     }
// }

// ¿Por qué es una mala práctica? La clase Computador no tiene relación con
// las funciones de un vehículo. Implementar interfaces sin una relación lógica
// hace que el código sea menos organizado y obliga a crear métodos innecesarios.
//
// Lo correcto es implementar interfaces únicamente cuando sus métodos tienen
// sentido para la clase. Esto facilita el mantenimiento y la comprensión del código.