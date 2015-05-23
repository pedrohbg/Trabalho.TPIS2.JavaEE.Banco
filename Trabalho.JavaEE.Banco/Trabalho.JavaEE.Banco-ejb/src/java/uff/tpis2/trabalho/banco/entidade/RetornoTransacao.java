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
public class RetornoTransacao {
    private String sucesso;
    private String erro;

    
    
    public String getSucesso() {
        return sucesso;
    }

    public void setSucesso(String sucesso) {
        this.sucesso = sucesso;
    }

    public String getErro() {
        return erro;
    }

    public void setErro(String erro) {
        this.erro = erro;
    }
}
