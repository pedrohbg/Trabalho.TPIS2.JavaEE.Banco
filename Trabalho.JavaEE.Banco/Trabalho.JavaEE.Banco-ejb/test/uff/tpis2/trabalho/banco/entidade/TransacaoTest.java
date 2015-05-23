/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.tpis2.trabalho.banco.entidade;

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
public class TransacaoTest {
    
    public TransacaoTest() {
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
     * Test of sacar method, of class Transacao.
     */
    @Test
    public void testSacar() {
        System.out.println("sacar");
        Conta contaOrigem = null;
        double valor = 0.0;
        Transacao instance = new Transacao();
        RetornoTransacao expResult = null;
        RetornoTransacao result = instance.sacar(contaOrigem, valor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registrarTransacao method, of class Transacao.
     */
    @Test
    public void testRegistrarTransacao() {
        System.out.println("registrarTransacao");
        TipoTransacao tipo = null;
        Transacao instance = new Transacao();
        instance.registrarTransacao(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
