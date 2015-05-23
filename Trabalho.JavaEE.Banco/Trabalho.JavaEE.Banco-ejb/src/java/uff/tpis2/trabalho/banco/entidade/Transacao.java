/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.tpis2.trabalho.banco.entidade;

import java.util.Date;
import javax.inject.Named;

/**
 *
 * @author Pedro
 */
@Named(value = "transacao")

public class Transacao {

    /**
     * Creates a new instance of Transacao
     */
    private int id;
    private Date data;
    private double valor;
        
    private Saque saque;
    private Deposito deposito;
    private Pagamento pagamento;
    private Transferencia transferencia;
    private Rendimento rendimento;
   
    private RetornoTransacao retornoTransacao;
    private String sucesso;
    
    public Transacao() {
        this.retornoTransacao = new RetornoTransacao();
        sucesso = "-1";
    }
    
    
    public RetornoTransacao sacar(Conta contaOrigem, double valor){
        
        saque = new Saque(contaOrigem);
        
        try 
        {
            saque.sacar(valor);
            
            sucesso = "1";
        } 
        catch (Exception e) {
            
            retornoTransacao.setErro(e.getMessage());
        }
        finally
        {
            retornoTransacao.setSucesso(sucesso);
            registrarTransacao(TipoTransacao.Saque);
        }       
        
        return retornoTransacao;
                
    }
    
    public void registrarTransacao(TipoTransacao tipo)
    {
        
        switch (tipo)
        {
            case Deposito:
                //to do
                break;
            case Transferencia:
                //to do
                break;    
            case Rendimento:
                //to do
                break;    
            case Saque:
                //to do
                break;    
            case Pagamento:
                //to do
                break;    
        }
            
        
    }
    
    
    
    
}
