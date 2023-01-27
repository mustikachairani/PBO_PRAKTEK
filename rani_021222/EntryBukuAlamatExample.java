/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rani_021222;

/**
 *
 * @author user
 */
public class EntryBukuAlamatExample {
    public static void main(String[] args){
        System.out.println("Entry Buku Alamat" + "\n");
        System.out.println("Accessor dan Mutator Method");
        EntryBukuAlamat student1 = new EntryBukuAlamat();
        
        student1.setName("Mustika Chairani");
        student1.setAddress("Padang");
        student1.setTelepon("082288368963");
        student1.setEmail("rani@gmail.com");
    
        System.out.println("Nama            : "+student1.getName());
        System.out.println("Alamat          : "+student1.getAddress());
        System.out.println("Nomor Telepon   : "+student1.getTelepon());
        System.out.println("Alamat E-Mail   : "+student1.getEmail());
     
        System.out.println("\n" + "Constructor");
        EntryBukuAlamat student2 = new EntryBukuAlamat("Rani Cantik", "Padang Cinta","082288368963", "rani@gmail.com");
        
        System.out.println("Nama            : "+student2.getName());
        System.out.println("Alamat          : "+student2.getAddress());
        System.out.println("Nomor Telepon   : "+student2.getTelepon());
        System.out.println("Alamat E-Mail   : "+student2.getEmail());
      
    }
}
