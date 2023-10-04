package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Mamifero extends Animais{

    Scanner scanner = new Scanner(System.in);
    public void cadastrarMamifero(){
        System.out.println("************** Cadastro Mamifero *****************");
        System.out.println(" Informe o nome do mamifero: ");
        super.nome = scanner.nextLine();
        System.out.println(" informe o apelido do mamifero: ");
        super.apelido = scanner.nextLine();
        System.out.println(" Informe a idade do mamifero: ");
        super.idade = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" Informe o sexo do mamifero: ");
        super.sexo = scanner.nextLine();
        System.out.println(" informe o numero da identificação do mamifero: ");
        super.identificacao = scanner.nextInt();
        System.out.println(" Quando foi a ultima visita ao veterinario?: ");

    }
}
