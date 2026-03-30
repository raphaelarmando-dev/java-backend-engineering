package com.raphael.fundamentals.basics;

@SuppressWarnings("all")
public class Operadores {
    public static void main(String[] args) {

        // Operadores Aritmeticos
        System.out.println(2 + 3);

        var x = 34.56;
        double y = 2.2;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);

        int a = 8;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a / (double) b);
        System.out.println(a / (float) b);

        System.out.println(a % b);
        System.out.println(7 % 2);

        System.out.println(x + y - a * b);

        // Challenge Aritmeticos

        double numA = Math.pow(6 * (3 + 2), 2);
        double denA = 3 * 2;

        double numB = (1 - 5) * (2 -7);
        double denB = 2;

        double superiorA = numA / denA;
        double superiorB = Math.pow(numB / denB, 2);

        double superior = Math.pow(superiorA - superiorB, 3);
        double inferior = Math.pow(10, 3);

        double resultado = superior / inferior;

        System.out.println("O resultado e " + resultado);

        // Operadores Logicos

        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!!condicao1);
        System.out.println(!condicao2);

        System.out.println("\nTabela verdade AND");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("\nTabela verdade OR");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("\nTabela verdade XOR");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("Tabela verdade NOT");
        System.out.println(!true);
        System.out.println(!false);

        // Challange Logicos

        boolean trabalho1 = false;
        boolean trabalho2 = false;

        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTv32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;

        System.out.println("Comprou TV 50\"? " + comprouTv50);
        System.out.println("Comprou TV 32\"? " + comprouTv32);
        System.out.println("Comprou Sorvete? " + comprouSorvete);

        boolean maisSaudavel = !comprouSorvete;

        // Operadores Relacionais

        int e = 97;
        int f = 'a';
        System.out.println(a == b);

        System.out.println(3 > 4);
        System.out.println(3 >= 3);
        System.out.println(3 < 7);
        System.out.println(30 <= 7);
        System.out.println(30 != 7);

        double nota = 9.9;
        boolean bomComportamento = false;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;

        System.out.println("Tem desconto? " + temDesconto);

        // Operadores Atribuicao

        int g = 3;
        int h = g;
        int i = g + h;

        i += h;
        i -= g;
        i *= h;
        i /= g;

        System.out.println(i);

        i %= 2;
        System.out.println(i);

        // Operadorees Unarios

        a++;
        a--;
        ++b;
        --b;
        System.out.println(a);
        System.out.println(b);

        // Operador Ternario

        double media = 8.6;
        String resultadoFinal = media >= 7.0 ? "aprovado." : "em recupercao.";
        System.out.println("O aluno esta " + resultadoFinal);

        double nota1 = 9.9;
        boolean bomComportamento1 = true;
        boolean passouPorMedia1 = nota1 >= 7;
        boolean temDesconto1 = bomComportamento1 && passouPorMedia1;
        String resultado1 = temDesconto1 ? "Sim." : "Nao.";

        System.out.printf("Tem desconto? %s", resultado1);

    }
}
