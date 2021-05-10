/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.recursividad;

/**
 *
 * @author frankdev
 */
public class Factorial {
    public static void main(String args[]){
        Factorial mifactorial = new Factorial();
        System.out.println("El resultado del factorial es: "+mifactorial.factorialRecursivo(4));
    }
    public int factorialRecursivo(int factorial){
        if(factorial<0){
            return 0;
        }else{
        if(factorial==0){
            return 1;
        }else{
            return factorial*factorialRecursivo(factorial-1);
        }
        }
    }
    
}
