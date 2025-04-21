package exercicio08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Equacao2Grau [] equacao2grau = new Equacao2Grau[2];
        double a, b, c;

        for(int i = 0; i < equacao2grau.length; i++) {
            System.out.print("a --> ");
            a = sc.nextDouble();
            if(a == 0) {
                System.out.println("Não é uma equação do 2º grau");
            }
            else{
                System.out.print("b --> ");
                b = sc.nextDouble();

                System.out.print("c --> ");
                c = sc.nextDouble();

                equacao2grau[i] = new Equacao2Grau(a, b, c);
            }
            System.out.println();
        }

        for(Equacao2Grau e : equacao2grau) {
            System.out.println("\t\tResultado da equação: \n-----------------------------------------");
            System.out.println(e.calcularRaizes());
        }
    }
}
