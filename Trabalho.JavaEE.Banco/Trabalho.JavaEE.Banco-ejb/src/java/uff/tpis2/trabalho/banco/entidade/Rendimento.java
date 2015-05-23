/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.tpis2.trabalho.banco.entidade;

import javax.inject.Named;

/**
 *
 * @author Pedro
 */
@Named(value = "rendimento")

public class Rendimento {

    /**
     * Creates a new instance of Rendimento
     */
    private Conta contaARender;

    public Rendimento(Conta contaARender) {
        this.contaARender = contaARender;
    }
    
    
    
}
