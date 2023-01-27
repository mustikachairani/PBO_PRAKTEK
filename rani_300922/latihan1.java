/*
modul5
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
GetInputFromKeyboard 
 */
package rani_300922;

import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.IOException; 

/**
 *
 * @author user
 */
public class latihan1 {  
    public static void main( String[] args ){ 
 
        BufferedReader dataIn = new BufferedReader(new 
        InputStreamReader( System.in) ); 

        String name = ""; 
        String address = ""; 
        String jurusan = ""; 

      

        try{ 
        System.out.print("Please Enter Your Name:"); 
        name = dataIn.readLine(); 
        System.out.print("Please Enter Your address:"); 
        address = dataIn.readLine(); 
        System.out.print("Please Enter Your jurusan:"); 
        jurusan = dataIn.readLine(); 
        }catch( IOException e ){ 
        System.out.println("Error!"); 
        } 
        System.out.println("Hello " + name +"!");
        System.out.println("Alamat saya " + address +"!"); 
        System.out.println("jurusan saya " + jurusan +"!"); 
        }
} 

    
