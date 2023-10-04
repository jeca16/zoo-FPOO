package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public void executarMenu(){

        boolean continuar = true;
        do {
            System.out.println("*********************** Menu **********************");
            System.out.println(" 1- Cadastrar um novo animal ");
            System.out.println(" 2- listar animais ");
            System.out.println(" 3- Habitats ");
            System.out.println(" 4- sair");
            System.out.println("****************************************************************");

            int option = scanner.nextInt();

            switch (option){
                case 1:
                    Animais animais = new Animais();
                    animais.cadastrarAnimal();
                    break;

                case 2:
                    System.out.println("future in development.....");
                    break;

                case 3:
                    System.out.println("future in development.....");
                    break;

                case 4:
                    continuar = false;
                    break;
            }

        }while (continuar);
    }
}
