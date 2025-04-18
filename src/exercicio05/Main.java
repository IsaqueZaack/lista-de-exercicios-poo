package exercicio05;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Distancia [] dist = new Distancia[2];

        // entrada de dados de forma aleatória
        for (int i = 0; i < dist.length; i++) {
            dist[i] = new Distancia();
            dist[i].d = Math.random() * 50;
        }

        // saída de dados
        for (int i = 0; i < dist.length; i++) {
            System.out.println();
            System.out.println("\t" + (i + 1) + "º Distância: \n----------------------");
            System.out.println("Metros: " + df.format(dist[i].d));
            System.out.println("Milhas: " + df.format(dist[i].paraMilhas()));
            System.out.println("Pés: " + df.format(dist[i].paraPes()));
        }
    }
}
