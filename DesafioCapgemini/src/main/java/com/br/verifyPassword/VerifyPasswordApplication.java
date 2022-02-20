package com.br.verifyPassword;

import com.br.verifyPassword.service.VerifyPassword;

import java.util.Scanner;

public class VerifyPasswordApplication {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        VerifyPassword verify = new VerifyPassword();
        System.out.println("Digite a senha: ");
        String password = scan.nextLine();

        System.out.println(verify.verifyPassword(password));

    }
}
