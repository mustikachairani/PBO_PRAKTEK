/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
TestOR
 */
package rani_230922;

/**
 *
 * @author user
 */
public class Latihan5 {
    public static void main(String[] args){
        int i = 0;
        int j = 10;
        boolean test= false;
        
        //demontrasi ||
        test = (i < 10) || (j++ > 9);
        test = (i < 10) || (j++ > 9); 
        System.out.println(i); 
        System.out.println(j); 
        System.out.println(test); 

        //demonstrasi & 
        test = (i < 10) | (j++ > 9); 
        System.out.println(i); 
        System.out.println(j);
        System.out.println(test);   
    }
    
}