/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rani_091222;

/**
 *
 * @author user
 */
public class PolimorfisExample {
    public static void main(String[] args){
        Person ref;
        Student student = new Student();
        Employee employee = new Employee();
        ref = student;
        String temp = ref.getName();
        System.out.println("Name : "+temp);
        ref = employee;
        String temp1 = ref.getName();
        System.out.println("Name : "+temp1);
    }
}