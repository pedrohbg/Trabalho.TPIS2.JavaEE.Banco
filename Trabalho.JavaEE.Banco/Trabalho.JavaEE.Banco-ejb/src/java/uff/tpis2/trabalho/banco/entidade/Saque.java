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
@Named(value = "saque")

public class Saque extends Transacao {

    /**
     * Creates a new instance of Saque
     */
    private Conta contaOrigem;
    
    public Saque(Conta contaOrigem) {
        this.contaOrigem = contaOrigem;
    }
    
    public RetornoTransacao sacar(double valorASacar){
        RetornoTransacao retorno = new RetornoTransacao();
        
        try 
        {
            contaOrigem.setSaldo(contaOrigem.getSaldo() - valorASacar);
            
            retorno.setSucesso("1");
        } 
        catch (Exception e) 
        {
            retorno.setErro(e.getMessage());
            retorno.setSucesso("-1");
        }
        
        return retorno;
        
    }
    
}
