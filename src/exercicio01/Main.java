package exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        código para a entrada e exibição de apenas um objeto bicicleta
//        String cor;
//        int numMarchas;
//        double valor;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Informe a cor da bicicleta: ");
//        cor = sc.next();
//
//        System.out.println("Informe o número de marchas da bicicleta: ");
//        numMarchas = sc.nextInt();
//
//        System.out.println("Informe o valor da bicicleta: ");
//        valor = sc.nextDouble();
//
//        Bicicleta bicicleta = new Bicicleta(cor, numMarchas, valor);
//        System.out.println(bicicleta.getDados());

        // código para a entrada e exibição de vários objetos bicicleta
        Scanner sc = new Scanner(System.in);
        Bicicleta[] bicicleta = new Bicicleta[2];
        String cor;
        int numMarchas;
        double valor;

        // entrada de dados
        for (int i = 0; i < bicicleta.length; i++) {
            System.out.println("Informe a cor da " + (i + 1) + "º bicicleta: ");
            cor = sc.next();

            System.out.println("\nInforme a quantidade de marchas da " + (i + 1) + "º bicicleta: ");
            numMarchas = sc.nextInt();

            System.out.println("\nInforme o valor da " + (i + 1) + "º bicicleta: ");
            valor = sc.nextDouble();

            bicicleta[i] = new Bicicleta(cor, numMarchas, valor);
            System.out.println();
        }

        // saída de dados
        for (Bicicleta b : bicicleta) {
            System.out.println(b.getDados());
        }
    }
}
