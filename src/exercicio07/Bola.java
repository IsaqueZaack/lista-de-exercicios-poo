package exercicio07;

import java.text.DecimalFormat;

public class Bola {
    String cor;
    double raio;
    double area;

    public Bola(String cor, double raio) {
        this.cor = cor;
        this.raio = raio;
    }

//    utilizando apenas o raio para calcular a maior bola -->
//    this aqui esta referenciando a bola1
//    public Bola maiorBola(Bola a, Bola b) {
//        Bola aux = null;
//        if(this.raio > a.raio && this.raio > b.raio) {
//            aux = this;
//        }
//        else if(a.raio > b.raio) {
//            aux = a;
//        }
//        else {
//            aux = b;
//        }
//        return aux;
//    }

    //    this aqui esta referenciando a bola1 do Main
    public Bola maiorBola(Bola bola1, Bola bola2) {
        area = Math.PI * Math.pow(raio, 2);
        if (this.raio > bola1.raio && this.raio > bola2.raio) {
            return this;
        }
        else if(bola1.raio > bola2.raio) {
        return bola1;
        }
        return bola2;
    }

    public String retornarDados() {
        String aux = "";
        aux += "\nCor: " + cor;
        aux += "\nRaio: " + raio;
        aux += "\nÁrea: " + area + "m²";

        return aux;
    }
}
