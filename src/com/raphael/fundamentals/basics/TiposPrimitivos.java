package com.raphael.fundamentals.basics;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Info de funcionario

        // Tipos numericos inteiros
        byte anosDeEmpresa = 28;
        short numeroDeVoos = 452;
        int id = 82423;
        long pontosAcumulados = 2146131434L;

        // Tipos numericos reais
        float salario = 16_425.41F;
        double vendasAcumuladas = 2_412_923_132.12;

        //Tipo boolean
        boolean estaDeFerias = false; // true

        // Tipo caractere
        char status = 'A'; // ativo

        // Dias de Empresa
        System.out.println(anosDeEmpresa * 365);

        // Numero de viagens

        System.out.println(numeroDeVoos / 2);

        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Ferias? " + estaDeFerias);
        System.out.println("Status: " + status);
    }
}
