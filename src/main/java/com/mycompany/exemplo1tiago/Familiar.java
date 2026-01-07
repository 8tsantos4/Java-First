/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo1tiago;

/**
 *
 * @author Tiago
 */
public class Familiar extends Carro{
    //construtor
    
    public Familiar(){
        
    }
    
    public void desligarAirbagPassageiro(){
        System.out.println("Airbag passageiro desligado....");
    }
    
    public void colocarCadeiraBebe(){
        System.out.println("Cadeira de crianca instalada....");
    }
    
    //sobrescrita - Overide
    
    public void buzinar(){
       super.buzinar();
       System.out.println("Buzina Familiar...");
    }
}
