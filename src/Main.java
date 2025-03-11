import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operacoes op1 = new Operacoes();
        Scanner scan = new Scanner(System.in);

        System.out.print("Valor de X: ");
        float x = scan.nextFloat();

        System.out.print("Valor de Y: ");
        float y = scan.nextFloat();

        op1.adicao(x, y);
        op1.subtracao(x, y);
        op1.multiplicacao(x, y);
        op1.divisao(x, y);
    }
}