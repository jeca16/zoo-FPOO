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
            System.out.println(" 3- sair");
            System.out.println("****************************************************************");

            int option = scanner.nextInt();

            switch (option){
                case 1:
                    Animais animais = new Animais();
                    animais.cadastrarAnimal();
                    break;

                case 2:
                    Animais animais1 = new Animais();
                    animais1.listarAnimais();
                    break;

                case 3:
                    continuar = false;
                    break;
            }

        }while (continuar);
    }
}
