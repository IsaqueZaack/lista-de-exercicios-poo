package exercicio06;

public class Main {
    public static void main(String[] args) {
        Hora h1 = new Hora(20, 30,40);
        Hora h2 = new Hora(60, 10,-1);
        Hora h3 = new Hora(6, -2,30);

        System.out.println(h1.formatar());
        System.out.println(h2.formatar());
        System.out.println(h3.formatar());

    }
}
