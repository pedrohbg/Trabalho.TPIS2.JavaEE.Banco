/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.tpis2.trabalho.banco.entidade;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pedro
 */
public class DepositoTest {
    
    public DepositoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Depositar method, of class Deposito.
     */
    @Test
    public void testDepositar() {
        
        //stub
        double saldoAnterior = 100;
        double valorADepositar = 500.;
        
        ContaCorrente contaDestino = new ContaCorrente();
        contaDestino.setSaldo(100);
        contaDestino.setDataCriacao(new Date() );
        contaDestino.setId(1);
        
        Deposito deposito = new Deposito(contaDestino);
        
        
        
        RetornoTransacao retorno = deposito.Depositar(valorADepositar);
        System.out.println(retorno.getSucesso());
        
        assertEquals(retorno.getSucesso(), "1");
        assertTrue(contaDestino.getSaldo() == valorADepositar + saldoAnterior);
        
        
    }
    
}
