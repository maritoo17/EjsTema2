public class Lámpara {
    private String color;
    private boolean encendida;
    private int intensidad;

    public Lámpara (String color, boolean encendida, int intensidad) {
        this.color = color;
        this.encendida = encendida;
        this.intensidad = intensidad;
    }

    public String getColor() {
        return color;
    }

    public void setcolor (String color) {
        this.color = color;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    public int getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(int intensidad) {
        this.intensidad = intensidad;
    }
}