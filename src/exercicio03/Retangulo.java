package exercicio03;

import java.text.DecimalFormat;

public class Retangulo {
    // atributos do objeto retângulo
    private double base, altura, area, perimetro;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // método para calcular o perímetro do objeto retângulo
    public void calcularPerimetro() {
        perimetro = (base * 2) + (altura * 2);
    }

    // método para calcular a área do objeto retângulo
    public void calcularArea() {
        area = base * altura;
    }

    // método de exibição dos dados do objeto retangulo
    public String getDados() {
        DecimalFormat df = new DecimalFormat("0.00");
        String aux = "";
        aux += "\n" + "\tDados do retângulo :\n----------------------------\n";
        aux += "Base: " + df.format(base) + "\n";
        aux += "Altura: " + df.format(altura) + "\n";
        aux += "Perímetro: " + df.format(perimetro) + "\n";
        aux += "Área: " + df.format(area) + "\n";

        return aux;
    }

}
