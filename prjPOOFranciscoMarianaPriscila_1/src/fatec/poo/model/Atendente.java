
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author FranciscoMarianaPriscila
 */
public class Atendente extends Pessoa {
    
    private String regFunc;
    private String turno; //M, T, N
    private ArrayList<QuartoHotel> quartoHoteis = new ArrayList<QuartoHotel>();

    public Atendente(String regFunc, String nome) {
        super(nome);
        this.regFunc = regFunc;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getRegFunc() {
        return regFunc;
    }

    public String getTurno() {
        return turno; 
    }
    
    public void addQuartoHotel (QuartoHotel q){
        quartoHoteis.add(q);
        q.setAtendente(this);
    }
    
}
