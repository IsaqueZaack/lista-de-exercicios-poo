package exercicio04;

public class Temperatura {
    private double temperatura;

    public Temperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double calcularFahrenheit() {
        return 9.0 / 5.0 * temperatura + 32;
    }

    public double calcularKelvin() {
        return temperatura + 273;
    }

    public double getTemperatura() {
        return temperatura;
    }
}
