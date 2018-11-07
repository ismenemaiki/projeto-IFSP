/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinalifsp;

/**
 *
 * @author Maiki
 */
public class ProjetoFinalIFSP {
    public String nome;
    public int carga;
    public String [] area;
    public int vagas;
    //public String area;
    
    public ProjetoFinalIFSP(String nome, int carga, String area, int vagas, String periodo) {
        this.nome = nome;
        this.carga = carga;
        this.vagas = vagas;
        this.periodo = periodo;
    }

    public ProjetoFinalIFSP(String[] area) {
        this.area = area;
    }
    public String periodo;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
