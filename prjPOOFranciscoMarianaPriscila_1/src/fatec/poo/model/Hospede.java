/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author FranciscoMarianaPriscila
 */
public class Hospede extends Pessoa {
    
    private String cpf;
    private double txDesconto;
    private int idade;
    private QuartoHotel quartoHotel;

    public Hospede(String cpf, String nome) {
        super(nome);
        this.cpf = cpf;
    }

    public void setTxDesconto(double txDesconto) {
        this.txDesconto = txDesconto;
    }

    public String getCpf() {
        return cpf;
    }

    public double getTxDesconto() {
        return txDesconto;
    }

    public QuartoHotel getQuartoHotel() {
        return quartoHotel;
    }

    public void setQuartoHotel(QuartoHotel quartoHotel) {
        this.quartoHotel = quartoHotel;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
        
    
}
