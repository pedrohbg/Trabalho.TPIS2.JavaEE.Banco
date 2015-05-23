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
@Named(value = "deposito")

public class Deposito extends Transacao {

    /**
     * Creates a new instance of Deposito
     */
    private Conta contaDestino;

    public Deposito(Conta contaDestino) {
        this.contaDestino = contaDestino;
    }
       
    
    public RetornoTransacao Depositar(Double valor){
        
        RetornoTransacao retorno = new RetornoTransacao();
        
        try 
        {
            contaDestino.setSaldo(contaDestino.getSaldo() + valor);
            
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
