package exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo[] retangulo = new Retangulo[2];
        double base, altura;

        // entrada de dados
        for (int i = 0; i < retangulo.length; i++) {
            System.out.println();
            System.out.println("\tInforme os valores do " + (i + 1) + "º retângulo:\n -----------------------------------------");
            System.out.print("Base: ");
            base = sc.nextDouble();

            System.out.print("Altura: ");
            altura = sc.nextDouble();

            retangulo[i] = new Retangulo(base, altura);
        }

        // saída de dados
        for (Retangulo r : retangulo){
            r.calcularPerimetro();
            r.calcularArea();
            System.out.println(r.getDados());

        }
    }
}
