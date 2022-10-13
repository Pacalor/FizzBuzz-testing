/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.curso.fizzbuzz;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dpadilla
 */
public class FizzBuzzTest {

    public FizzBuzzTest() {
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

    @Test
    public void testCheck() {
        //when
        int toTestOK=3;
        int toTestFail=2;
        int toTestOK2=5;
        //do
        String testOK = FizzBuzz.check(toTestOK);
        String testFail= FizzBuzz.check(toTestFail);
        String testOK2 = FizzBuzz.check(toTestOK2);
        //expect
        
        assertEquals("testOK fail", "Fizz", testOK);
        assertEquals("-testOK fail", "Fizz", FizzBuzz.check(toTestOK*(-1)));
        assertNotEquals("testFail fail", "Fizz", testFail);
        assertNotEquals("-testFail fail", "Fizz", FizzBuzz.check(toTestFail*(-1)));
        
        assertEquals("testOK fail", "Buzz", testOK2);
        assertEquals("-testOK fail", "Buzz", FizzBuzz.check(toTestOK2*(-1)));
        
    }

}
