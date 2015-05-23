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
@Named(value = "transferencia")

public class Transferencia extends Transacao {

    /**
     * Creates a new instance of Transferencia
     */
    private Conta contaOrigem;
    private Conta contaDestino;

    public Transferencia(Conta contaOrigem, Conta contaDestino) {
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }
    
    
}
