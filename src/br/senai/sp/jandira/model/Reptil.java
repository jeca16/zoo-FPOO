package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reptil extends Animais {
    Scanner scanner = new Scanner(System.in);

    String resposta;

    public void cadastrarReptil() {
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
        System.out.println("deseja adicionar um novo animal?");
        resposta = scanner.nextLine();
        scanner.nextLine();

        if (resposta.equalsIgnoreCase("S")) {
            Reptil reptil = new Reptil();
            reptil.cadastrarReptil();

            if (resposta.equalsIgnoreCase("N")) {
                Menu menu = new Menu();
                menu.executarMenu();
            }
        }
    }
    List<Reptil> listReptil = new ArrayList<>();
    public void listarReptil(){
        for (Reptil reptil: listReptil) {
            System.out.println(super.nome);
            System.out.println(super.apelido);
            System.out.println(super.idade);
            System.out.println(super.sexo);
        }

    }
}
