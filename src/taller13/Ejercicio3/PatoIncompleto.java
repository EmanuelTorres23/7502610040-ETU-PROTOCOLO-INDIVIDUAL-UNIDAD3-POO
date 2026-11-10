package taller13.Ejercicio3;

// import taller13.Ejercicio2.Volador;
//
// public class PatoIncompleto implements Volador {
//     // Error: no implementa volar()
// }
//
// Error de compilación (IntelliJ):
// "Class 'PatoIncompleto' must either be declared abstract
//  or implement abstract method 'volar()' in 'Volador'"

//¿Por qué esto está mal? Una clase concreta que pone implements promete cumplir todo el contrato de la interfaz.
// PatoIncompleto no define volar(), así que el compilador la rechaza antes de ejecutar nada. Hay dos soluciones:
// implementar el método o declarar la clase como abstract.