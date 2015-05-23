/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.tpis2.trabalho.banco.entidade;

import java.util.Date;
import java.util.List;
import javax.inject.Named;


/**
 *
 * @author Pedro
 */
@Named(value = "cliente")

public class Cliente {

    /**
     * Creates a new instance of Cliente
     */
    private int id;
    private String tipo;
    private String nome;
    private Date dataNascimento;
    private String senha;
    private Date dataCadastro;
    
}
