/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.tpis2.trabalho.banco.controlador;

import java.io.Serializable;
import javax.faces.application.Application;
import javax.faces.bean.RequestScoped;

import javax.inject.Inject;
import javax.inject.Named;
/**
 *
 * @author Pedro
 */
@Named("navegacaoControlador")
@RequestScoped


public class NavegacaoControlador implements Serializable {
   
    public String abrirPagina(String pagina){
      if(pagina == null){
         return "index.xhtml";
      }
      else
      {
          return pagina;
      }
      
   }
}

