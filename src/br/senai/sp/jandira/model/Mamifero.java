package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mamifero extends Animais {

    String resposta;
    Scanner scanner = new Scanner(System.in);

    public void cadastrarMamifero() {
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
        scanner.nextLine();
        System.out.println("deseja adicionar mais um mamifero?:");
        resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("S")){
            Mamifero mamifero = new Mamifero();
            mamifero.cadastrarMamifero();
        }else if (resposta.equalsIgnoreCase("N")){
            Menu menu = new Menu();
            menu.executarMenu();

        }
    }
    List<Mamifero> listMamifero = new ArrayList<>();
    public void listarMamifero(){
        for (Mamifero mamifero: listMamifero) {
            System.out.println("nome: " + super.nome);
            System.out.println("apelido" + super.apelido);
            System.out.println(" idade" + super.idade);
            System.out.println("sexo" + super.sexo);
        }
        }
    }

