package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aves extends Animais {

    String resposta;
    Scanner scanner = new Scanner(System.in);

    public void cadastrarAves() {
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
        System.out.println("deseja adicionar um novo animal?");
        resposta = scanner.nextLine();
        scanner.nextLine();

        if (resposta.equalsIgnoreCase("S")) {
            Aves aves = new Aves();
            aves.cadastrarAves();

            if (resposta.equalsIgnoreCase("N")) {
                Menu menu = new Menu();
                menu.executarMenu();
            }
        }
    }
    List<Aves> listAves = new ArrayList<>();
    public void listarAves(){
        for (Aves aves: listAves) {
            System.out.println(super.nome);
            System.out.println(super.apelido);
            System.out.println(super.idade);
            System.out.println(super.sexo);
        }

    }
}