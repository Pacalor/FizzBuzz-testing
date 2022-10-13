/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.curso.fizzbuzz;

/**
 *
 * @author dpadilla
 */
public class FizzBuzz {
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    public static String check(int number){
        String output="";
        if(number%3 == 0){
            output="Fizz";
        }else if(number%5 == 0){
            output="Buzz";
        }else output="";
        
        return output;
    }
}
