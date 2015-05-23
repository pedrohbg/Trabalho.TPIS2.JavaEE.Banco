/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.tpis2.trabalho.banco.entidade;

/**
 *
 * @author Pedro
 */
public class Pagamento {

    private Conta contaOrigem;
    private Conta contaDestino;

    public Pagamento(Conta contaOrigem, Conta contaDestino) {
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }
    
    
    
}
