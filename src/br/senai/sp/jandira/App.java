package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Caminhao;
import br.senai.sp.jandira.model.Carro;
import br.senai.sp.jandira.model.Moto;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("__________________________");
        Carro carro = new Carro();
        carro.andar();
        carro.frear();
        carro.fazerBarulho();
        System.out.println("__________________________");
        Moto moto = new Moto();
        moto.frear();
        moto.andar();
        moto.fazerBarulho();
        System.out.println("__________________________");
        Caminhao caminhao = new Caminhao();
        caminhao.fazerBarulho();
        caminhao.frear();
        caminhao.andar();
        System.out.println("___________________________");
    }
}
