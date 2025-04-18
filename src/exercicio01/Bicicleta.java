package exercicio01;

import java.text.DecimalFormat;

public class Bicicleta {
    // variáveis de instância
    String cor;
    int numMarchas;
    double valor;

    // construtor da classe
    public Bicicleta(String cor, int numMarchas, double valor) {
        this.cor = cor;
        this.numMarchas = numMarchas;
        this.valor = valor;
    }

    // método para retornar dados
    public String getDados() {
        DecimalFormat df = new DecimalFormat("0.00");
        String aux = "";
        aux += "\tDados da bicicleta:\n ------------------------- \n";
        aux += "\tCor: " + cor + "\n";
        aux += "\tNúmero de Marchas: " + numMarchas + "\n";
        aux += "\tValor: " + df.format(valor) + "\n";

        return aux;
    }
}
