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
public class AlumnoTest {
    
    public AlumnoTest() {
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
     * Test of CalcularParcial1 method, of class Alumno.
     */
    @Test
    public void testCalcularParcial1() {
        System.out.println("CalcularParcial1");
        Alumno instance = new Alumno();
        double expResult = 6;
        double result = instance.CalcularParcial1();
        assertEquals(expResult, result);

    }

    /**
     * Test of CalcularParcial2 method, of class Alumno.
     */
    @Test
    public void testCalcularParcial2() {
        System.out.println("CalcularParcial2");
        Alumno instance = new Alumno();
        double expResult = 5;
        double result = instance.CalcularParcial2();
        assertEquals(expResult, result, 0.0);


    }

    /**
     * Test of CalcularParcial3 method, of class Alumno.
     */
    @Test
    public void testCalcularParcial3() {
        System.out.println("CalcularParcial3");
        Alumno instance = new Alumno();
        double expResult = 3;
        double result = instance.CalcularParcial3();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of CalculaMedia method, of class Alumno.
     */
    @Test
    public void testCalculaMedia() {
        System.out.println("CalculaMedia");
        Alumno instance = new Alumno();
        double expResult = 4.666666666666667;
        double result = instance.CalculaMedia();
        assertEquals(expResult, result, 0.0);

    }
}    