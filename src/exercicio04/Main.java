package exercicio04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        Temperatura [] temperatura = new Temperatura[2];
        double c;

        for (int i = 0; i < temperatura.length; i++) {
            System.out.println();
//            // entrada de dados utilizando print
//            System.out.print("Informe a " + (i + 1) + "º temperatura em Celsius: ");
//            c = sc.nextDouble();

            // entrada de dados utilizando random
            c = Math.random() * 10;
            temperatura[i] = new Temperatura(c);
        }

        for (int i = 0; i < temperatura.length; i++) {
            System.out.println();
            System.out.println("\t\t" + (i + 1) + "º Temperatura: \n-------------------------------");
            System.out.println("Celsius: " + df.format(temperatura[i].getTemperatura()));
            System.out.println("Fahrenheit: " + df.format(temperatura[i].calcularFahrenheit()));
            System.out.println("Kelvin: " + df.format(temperatura[i].calcularKelvin()));
            System.out.println("-------------------------------");

        }
    }


}
