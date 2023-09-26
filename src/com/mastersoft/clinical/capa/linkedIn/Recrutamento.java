package com.mastersoft.clinical.capa.linkedIn;

import java.util.Scanner;

public class Recrutamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Recrutador(a) quer o celular? (sim ou nao): ");
        String resposta = scanner.next();

        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("12 981800280");
        } else {
            System.out.println("joao.pedrogs@live.com");
        }
    }
}