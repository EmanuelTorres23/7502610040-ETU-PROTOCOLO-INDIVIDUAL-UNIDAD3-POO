package taller13.Ejercicio3;

// public abstract class FiguraIncorrecta {
//
//     default void mostrarMensaje() {
//         System.out.println("Soy un método predeterminado");
//     }
// }
//
// Error de compilación (IntelliJ):
// "Modifier 'default' not allowed here"

//¿Por qué no es posible? La palabra default existe solo para las interfaces, y se añadió en Java 8 para que una
// interfaz pueda dar una implementación por defecto a un método. Una clase abstracta no lo necesita: cualquier método
//  con cuerpo ya es concreto, así que basta con escribir public void mostrarMensaje() { ... } sin default.
//  Por eso el compilador rechaza default dentro de una clase.