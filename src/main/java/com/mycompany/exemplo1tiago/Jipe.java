/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo1tiago;

/**
 *
 * @author Tiago
 */
public class Jipe extends Carro {
    
    //construtor da classe
    public Jipe(){
        
    }
    
    //Métodos
    
    public void ligarTraco4X4(){
        System.out.println("Tracao 4x4 ativa....");
               
    }
    
    //sobrescrita - Overide
    
    public void buzinar(){
       super.buzinar();
       System.out.println("Buzina Jipe...");
    }
    
}
