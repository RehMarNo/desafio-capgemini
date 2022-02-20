package com.br.escada.service;

public class EscadaBuilder {
    public void escadaFactory(Integer n) {

        for(int i=0;i < n; i++) {
            String linha = " ";
            for (int j=(n-1); j >= 0;j--) {
                linha = (j<=i) ? linha.concat("*") : linha.concat(" ");
            }
            System.out.println(linha);  // escreve cada linha
        }

    }
}
