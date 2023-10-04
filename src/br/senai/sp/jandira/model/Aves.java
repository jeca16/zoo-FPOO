package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Aves extends Animais{

    Scanner scanner = new Scanner(System.in);
    public void cadastrarAves(){
        System.out.println("************** Cadastro Ave *****************");
        System.out.println(" Informe o nome da Ave: ");
        super.nome = scanner.nextLine();
        System.out.println(" informe o apelido da Ave: ");
        super.apelido = scanner.nextLine();
        System.out.println(" Informe a idade da Ave: ");
        super.idade = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" Informe o sexo da Ave: ");
        super.sexo = scanner.nextLine();
        System.out.println(" informe o numero da identificação da ave: ");
        super.identificacao = scanner.nextInt();
        System.out.println(" Quando foi a ultima visita ao veterinario?: ");

    }
}
