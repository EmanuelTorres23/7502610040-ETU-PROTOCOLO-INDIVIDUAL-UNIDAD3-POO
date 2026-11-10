package taller12.Ejercicio2SegundaParte;

public class Animal implements Volador, Nadador {
    private String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    @Override
    public void volar() {
        System.out.println("El " + especie + " está volando.");
    }

    @Override
    public void nadar() {
        System.out.println("El " + especie + " está nadando.");
    }
}