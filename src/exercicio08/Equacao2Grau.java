package exercicio08;

import java.text.DecimalFormat;

public class Equacao2Grau {
    double a, b, c;

    public Equacao2Grau(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String calcularRaizes() {
        DecimalFormat df = new DecimalFormat("0.00");
        double x1, x2;
        double [] raiz = new double[2];
        double d = calcularDelta();
        raiz[0] = (-b + Math.sqrt(d)) / (a * 2);
        raiz[1] = (-b - Math.sqrt(d)) / (a * 2);

        String aux = "";

        if (d < 0) {
            aux = "A equação não tem raíz real\n";
        }
        else{
            aux += "\t1º Raíz : " + df.format(raiz[0]) + "\n";
            aux += "\t2º Raíz : " + df.format(raiz[1]) + "\n";
        }

        return aux;
    }

    public double calcularDelta() {
        return Math.pow(b, 2) - 4 * a * c;
    }
}
