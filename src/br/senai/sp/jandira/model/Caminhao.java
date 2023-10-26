package br.senai.sp.jandira.model;

public class Caminhao implements Veiculo{
    @Override
    public void andar() {
        System.out.println("O caminhão está andando...");
    }

    @Override
    public void frear() {
        System.out.println("O caminhão está freando...");
    }

    @Override
    public void fazerBarulho() {
        System.out.println("raann shuuuu...");
    }
}
