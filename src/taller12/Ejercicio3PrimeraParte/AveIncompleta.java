package taller12.Ejercicio3PrimeraParte;

// import taller12.Ejercicio1PrimeraParte.Volador;
//
// public class AveIncompleta implements Volador {
//     // No implementa volar()
// }
//
// Error de compilación (IntelliJ):
// "Class 'AveIncompleta' must either be declared abstract
//  or implement abstract method 'volar()' in 'Volador'"

//¿Por qué está mal? Cuando una clase pone implements Volador, le está prometiendo al compilador que va a cumplir
// todo el contrato de la interfaz. AveIncompleta no escribe el método volar(), así que no cumple esa promesa y el
//  compilador marca error antes de ejecutar el programa. Para arreglarlo, hay que escribir volar() dentro de la
//  clase, o declararla como abstract si todavía no puede cumplir el contrato.