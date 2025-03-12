package org.vitorrenansd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operacoes op1 = new Operacoes();
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual calculo irá fazer (+, -, *, /): ");
        String calc = scan.nextLine();

        System.out.print("Valor de X: ");
        float x = scan.nextFloat();

        System.out.print("Valor de Y: ");
        float y = scan.nextFloat();


        if (calc.equals("+")) {
            op1.adicao(x, y);
        }
        else if (calc.equals("-")) {
            op1.subtracao(x, y);
        }
        else if (calc.equals("*")) {
            op1.multiplicacao(x, y);
        }
        else if (calc.equals("/")) {
            op1.divisao(x, y);
        } else {
            System.out.println("Selecione uma opção válida");
        } 
    }
}