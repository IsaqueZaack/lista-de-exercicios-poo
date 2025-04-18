package exercicio02;

public class Exercicio {
    int x, y, z;

    // método para o retorno/exibição dos dados
    public String getDados(){
        String aux = "";
        aux += "\tx = " + x;
        aux += "\ty = " + y;
        aux += "\tz = " + z;

        return aux;
    }

    public static void main(String[] args) {
        Exercicio e1 = new Exercicio();
        Exercicio e2 = new Exercicio();
        e1.x = e1.z + e2.x + e2.y;
        e2.y = 2*e1.x + e2.z;
        e1.z = e2.z + e1.y;
        e2.z = e2.z + 2;

        System.out.println(e1.getDados());
        System.out.println(e2.getDados());
    }
}
