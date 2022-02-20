package com.br.escada;

import com.br.escada.service.EscadaBuilder;
import java.util.Scanner;

public class EscadaApplication {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        EscadaBuilder builder = new EscadaBuilder();
        System.out.println("Informe um número para construir a pirâmide: ");
        Integer n = scan.nextInt();
        builder.escadaFactory(n);
    }
}
