
package fatec.poo.model;

/**
 *
 * @author FranciscoMarianaPriscila
 */
public class QuartoHotel {
    
    private int numQuarto;
    private double valorDiaria;
    private boolean situacao;
    private String dataEntrada;
    private double totalFaturado;
    private Hospede hospede;
    private Atendente atendente;
    private String tipoQuarto; //S,C

    public QuartoHotel(int numQuarto, double valorDiaria) {
        this.numQuarto = numQuarto;
        this.valorDiaria = valorDiaria;
    }
    
    public void reservar (Hospede h, Atendente a){
        situacao = true;
        this.hospede = h;
        this.atendente = a;
        h.setQuartoHotel(this);
        a.addQuartoHotel(this);
    }
    
    public double liberar (int qtdeDias, double txDesconto){
              
        double valorHospedagem = 0;       
        situacao = false;
        dataEntrada = null;
        
        //iniciar os opontamentos 
        hospede = null;
        atendente = null;
        
        valorHospedagem = valorDiaria * qtdeDias;
        valorHospedagem -= (valorHospedagem * (txDesconto/100));
        totalFaturado += valorHospedagem;
        return valorHospedagem;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
        
    }

    public int getNumQuarto() {
        return numQuarto;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public double getTotalFaturado() {
        return totalFaturado;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }    
             
}
