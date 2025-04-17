package br.casa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String cor;
        int numMarchas;
        double valor;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a cor da bicicleta: ");
        cor = sc.next();

        System.out.println("Informe o número de marchas da bicicleta: ");
        numMarchas = sc.nextInt();

        System.out.println("Informe o valor da bicicleta: ");
        valor = sc.nextDouble();

        Bicicleta bicicleta = new Bicicleta(cor, numMarchas, valor);
        System.out.println(bicicleta.getDados());
    }
}
