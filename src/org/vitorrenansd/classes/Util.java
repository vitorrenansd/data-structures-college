package org.vitorrenansd.classes;

import java.util.Scanner;

public class Util extends Operacoes {
    public Util() {
    }

    public void userCalculo() {
        // Instancia das classes necessarias
        Scanner scan = new Scanner(System.in);
        Operacoes op = new Operacoes();

        // Inicio do codigo, pedindo info do usuario
        System.out.print("Primeiro valor: ");
        float x = scan.nextFloat();

        System.out.print("Segundo valor: ");
        float y = scan.nextFloat();

        System.out.print("Escolha um simbolo para calcular (+, -, *, /): ");
        String calc = scan.nextLine();

        // Switch case do calculo
        if (calc.equals("+")) {
            System.out.println(x + " + " + y + " = " + op.adicao(x, y));
        }
        else if (calc.equals("-")) {
            System.out.println(x + " - " + y + " = " + op.subtracao(x, y));
        }
        else if (calc.equals("*")) {
            System.out.println(x + " * " + y + " = " + op.multiplicacao(x, y));
        }
        else if (calc.equals("/")) {
            System.out.println(x + " / " + y + " = " + op.divisao(x, y));
        } else {
            System.out.println("Selecione um simbolo valido");
        } 
    }
}