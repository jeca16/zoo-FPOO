package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Animais    {

    String nome, especie, sexo, apelido;

    int idade, identificacao;



    Scanner scanner = new Scanner(System.in);

    public void cadastrarAnimal(){
        System.out.println(" Qual a especie do animal que deseja cadastrar? [Mamifero, Ave, Reptil]");
        especie = scanner.nextLine();

        if (especie.equalsIgnoreCase("Mamifero")){
            Mamifero mamifero = new Mamifero();
            mamifero.cadastrarMamifero();
        } else if (especie.equalsIgnoreCase("Reptil")) {
            Reptil reptil = new Reptil();
            reptil.cadastrarReptil();
        } else if (especie.equalsIgnoreCase("Ave")) {
            Aves aves = new Aves();
            aves.cadastrarAves();
        }else {
            System.out.println("Por favor digite uma especie listada!!!");
        }

    }

    public void listarAnimais(){

        System.out.println(" Escolha a especie de animal que deseja listar: [1-mamiferos, 2-aves, 3-repteis ");

        int option = scanner.nextInt();

        switch (option){
            case 1:
                Mamifero mamifero = new Mamifero();
                mamifero.listarMamifero();
                break;
            case 2:
                Reptil reptil = new Reptil();
                reptil.listarReptil();
                break;
            case 3:
                Aves aves = new Aves();
                aves.listarAves();
                break;
        }
    }



}
