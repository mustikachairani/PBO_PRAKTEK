/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rani_300922;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author user
 */
import javax.swing.JOptionPane; 
public class latihan6 {
    public static void main( String[] args ){
 String name1 ="";
 String name2 ="";
 String name3 ="";
 
 name1 = JOptionPane.showInputDialog("Enter word 1");
 name2 = JOptionPane.showInputDialog("Enter word 2");
 name3 = JOptionPane.showInputDialog("Enter word 3");

 String msg = name1 + "\t" +  name2 + "\t" + name3;

 JOptionPane.showMessageDialog(null, msg);

 } 

}
