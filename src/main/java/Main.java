public class Main {
    public static void main (String[] args) {
        Lámpara lámpara = new Lámpara("Verde", true, 100);
        Reloj reloj = new Reloj("12:00", true, "12:30");
        Libro libro = new Libro ("Azul", "El Quijote", "Cervantes");

        reloj.sonarAlarma(lámpara);
        libro.caer(lámpara);
    }
}