package br.senai.sp.jandira.model;

public class Carro implements Veiculo{
    @Override
    public void andar() {
        System.out.println("O carro está andando...");

    }

    @Override
    public void frear() {
        System.out.println("O carro está freando...");
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Vrum vrum...");
    }
}
