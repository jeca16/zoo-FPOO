package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Reptil extends Animais {
    Scanner scanner = new Scanner(System.in);

    public void cadastrarReptil(){
        System.out.println("************** Cadastro Reptil *****************");
        System.out.println(" Informe o nome do Reptil: ");
        super.nome = scanner.nextLine();
        System.out.println(" informe o apelido do Reptil: ");
        super.apelido = scanner.nextLine();
        System.out.println(" Informe a idade do Reptil: ");
        super.idade = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" Informe o sexo do Reptil: ");
        super.sexo = scanner.nextLine();
        System.out.println(" informe o numero da identificação do Reptil: ");
        super.identificacao = scanner.nextInt();
        System.out.println(" Quando foi a ultima visita ao veterinario?: ");

    }
}
