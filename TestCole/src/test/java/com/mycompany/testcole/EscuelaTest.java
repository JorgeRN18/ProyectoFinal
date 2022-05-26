/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.testcole;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Administrador
 */
public class EscuelaTest {
    
    public EscuelaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of CalculaBachiller method, of class Escuela.
     */
    @Test
    public void testCalculaBachiller() {
        System.out.println("CalculaBachiller");
        Escuela instance = new Escuela();
        int expResult = 78;
        int result = instance.CalculaBachiller();
        assertEquals(expResult, result);

    }

    /**
     * Test of CalculaEso method, of class Escuela.
     */
    @Test
    public void testCalculaEso() {
        System.out.println("CalculaEso");
        Escuela instance = new Escuela();
        int expResult = 156;
        int result = instance.CalculaEso();
        assertEquals(expResult, result);
    }

    /**
     * Test of CalculaPrimaria method, of class Escuela.
     */
    @Test
    public void testCalculaPrimaria() {
        System.out.println("CalculaPrimaria");
        Escuela instance = new Escuela();
        int expResult = 156;
        int result = instance.CalculaPrimaria();
        assertEquals(expResult, result);
    }
    
}
