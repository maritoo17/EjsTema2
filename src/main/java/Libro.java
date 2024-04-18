public class Libro {
    private String color;
    private String título;

    private String autor;

    public Libro (String color, String título, String autor) {
        this.color = color;
        this.título = título;
        this.autor = autor;
    }

    public String getcolor () {
        return color;
    }

    public void setcolor (String color) {
        this.color = color;
    }

    public String gettítulo () {
        return título;
    }

    public void settítulo (String título) {
        this.título = título;
    }

    public String getautor () {
        return autor;
    }

    public void setautor (String autor) {
        this.autor = autor;
    }

    public void caer (Lámpara lámpara) {
        System.out.println ("El libro " + this.título + " se ha caído y la lámpara se ha apagado.");
        lámpara.setEncendida(false);
    }
}
