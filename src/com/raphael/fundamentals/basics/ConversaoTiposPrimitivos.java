package com.raphael.fundamentals.basics;

import javax.swing.JOptionPane;
import java.util.Scanner;

@SuppressWarnings("all")
public class ConversaoTiposPrimitivos {
    public static void main(String[] args) {

        double a = 1.99999999999;
        System.out.println(a);

        float b = (float) 1.12345; // explicita (CAST)
        System.out.println(b);

        int c = 127;
        byte d = (byte) c;
        System.out.println(d);

        double e = 1.123456789;
        int f = (int) e;
        System.out.println(f);

        // ConversaoNumeroString

        int num1 = 100000;
        System.out.println(Integer.toString(num1));

        Integer num2 = 100000; // Wrapper
        System.out.println(num2.toString().length());

        // ConversaoStringNumero

        String valor5 = JOptionPane.showInputDialog("Digite o primeiro numero");
        String valor6 = JOptionPane.showInputDialog("Digite o segundo numero");
        System.out.println(valor5 + valor6);

        double numero1 = Double.parseDouble(valor5);
        double numero2 = Double.parseDouble(valor6);
        double soma = numero1 + numero2;
        System.out.println("Soma e " + soma);
        System.out.println("Media e " + soma / 2);

        // Challenge

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o Primeiro salario:");
        String valor1 = entrada.next().replace("," , ".");

        System.out.println("Informe o Segundo salario:");
        String valor2 = entrada.next().replace("," , ".");

        System.out.println("Informe o Terceiro salario:");
        String valor3 = entrada.next().replace("," , ".");

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);

        double media = (salario1 + salario2 + salario3) / 3;
        System.out.println("A Media dos salarios e: " + media);

        entrada.close();
    }
}
