public class Reloj {

    private String hora;
    private boolean alarmaActivada;
    private String horaAlarma;

    public Reloj (String hora, boolean alarmaActivada, String horaAlarma) {
        this.hora = hora;
        this.alarmaActivada = alarmaActivada;
        this.horaAlarma = horaAlarma;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public boolean isAlarmaActivada() {
        return alarmaActivada;
    }

    public void setAlarmaActivada(boolean alarmaActivada) {
        this.alarmaActivada = alarmaActivada;
    }

    public String getHoraAlarma() {
        return horaAlarma;
    }

    public void setHoraAlarma(String horaAlarma) {
        this.horaAlarma = horaAlarma;
    }

    public void sonarAlarma (Lámpara lámpara) {
        if (this.alarmaActivada) {
            System.out.println ("La alarma está sonando y la lámpara se ha encendido.");
            lámpara.setEncendida(true);
        }
    }

}
