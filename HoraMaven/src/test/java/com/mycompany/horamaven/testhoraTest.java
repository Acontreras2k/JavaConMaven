/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.horamaven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Diurno
 */
public class testhoraTest {

    public testhoraTest() {
    }

//    @BeforeClass
//    public static void setUpClass() {
//    }
//
//    @AfterClass
//    public static void tearDownClass() {
//    }
//
//    @Before
//    public void setUp() {
//    }
//
//    @After
//    public void tearDown() {
//    }

    /**
     * Test of validar_hora method, of class testhora.
     */
    @Test
    public void testValidar_hora1() {
        System.out.println("validar_hora");
        int hora = 5;
        int min = -7;
        testhora instance = new testhora();
        boolean expResult = true;
        boolean result = instance.validar_hora(hora, min);
        assertTrue(expResult);

    }

    @Test
    public void testValidar_hora2() {
        System.out.println("validar_hora");
        int hora = 7;
        int min = 7;
        testhora instance = new testhora();
        boolean expResult = false;
        boolean result = instance.validar_hora(hora, min);
        assertFalse(expResult);

    }

    @Test
    public void testValidar_hora3() {
        System.out.println("validar_hora");
        int hora = -7;
        int min = 12;
        testhora instance = new testhora();
        boolean expResult = true;
        boolean result = instance.validar_hora(hora, min);
        assertTrue(expResult);

    }

    @Test
    public void testValidar_hora4() {
        System.out.println("validar_hora");
        int hora = 14;
        int min = 60;
        testhora instance = new testhora();
        boolean expResult = true;
        boolean result = instance.validar_hora(hora, min);
        assertTrue(expResult);

    }

    @Test
    public void testValidar_hora5() {
        System.out.println("validar_hora");
        int hora = 30;
        int min = 24;
        testhora instance = new testhora();
        boolean expResult = true;
        boolean result = instance.validar_hora(hora, min);
        assertTrue(expResult);

    }
}
