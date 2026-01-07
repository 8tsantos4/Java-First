/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo1tiago;

/**
 *
 * @author Tiago
 */
public class Citadino extends Carro {
    
    //Construtor da Classe
    public Citadino(){
        
    }
    
    //Métodos
    
    public void ligarACManual(){
        System.out.println("AC ligado.");
    }
    
    //sobrescrita - Overide
    
    public void buzinar(){
       super.buzinar();
       System.out.println("Buzina Citadino...");
    }
}
