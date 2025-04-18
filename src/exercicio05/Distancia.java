package exercicio05;

public class Distancia {
    // variáveis de instância
    double d;

    // método para converter de metros para milhas
    public double paraMilhas() {
        return d * 0.000621371;
    }

    // método para converter de metros para pés
    public double paraPes() {
        return d * 3.28084;
    }
}
