package exercicio06;

public class Hora {
    // variáveis de instânci
    int horas, minutos, segundos;

    // método construtor
    public Hora(int horas, int minutos, int segundos) {
        this.horas = validarHora(horas);
        this.minutos = validarMinuto(minutos);
        this.segundos = validarSegundo(segundos);
    }

    private int validarSegundo(int segundos) {
        return (segundos >= 0 && segundos <= 59 ? segundos : 0);
    }

    private int validarMinuto(int minutos) {
        return (minutos >= 0 && minutos <= 59 ? minutos : 0);
    }

    private int validarHora(int horas) {
        return (horas >= 0 && horas <= 23 ? horas : 0);
    }

    public String formatar() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
}
