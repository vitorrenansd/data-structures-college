package ies.calculator.classes;

import java.util.Scanner;

public class Util extends Operacoes {
    
    public void userCalculo() {
        // Instancia das classes necessarias
        Scanner scan = new Scanner(System.in);
        Operacoes op = new Operacoes();

        // Pedindo info do usuario
        System.out.print("Primeiro valor: ");
        float x = scan.nextFloat();
        System.out.print("Segundo valor: ");
        float y = scan.nextFloat();
        System.out.print("Escolha um simbolo para calcular (+, -, *, /): ");
        String calc = scan.next();

        // Switch case para fazer o calculo e printar no terminal
        if (calc.equals("+")) {
            System.out.println(x + " + " + y + " = " + op.adicao(x, y));
            scan.close();
        }
        else if (calc.equals("-")) {
            System.out.println(x + " - " + y + " = " + op.subtracao(x, y));
            scan.close();
        }
        else if (calc.equals("*")) {
            System.out.println(x + " * " + y + " = " + op.multiplicacao(x, y));
            scan.close();
        }
        else if (calc.equals("/")) {
            System.out.println(x + " / " + y + " = " + op.divisao(x, y));
            scan.close();
        } else {
            System.out.println("Por favor selecione um simbolo valido");
            scan.close();
        } 
    }
}