/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo1tiago;

/**
 *
 * @author Tiago
 */
public class Carro {
    //Atributos
    private String matricula;
    public int velocidadeAtual = 0;
    public int velocidadeMaxima = 200;
    
    //Construtor da classe
    //Este é o construtor por defeito
    
    public Carro(){
        
    }
    
    //Métodos
    
    public void ligar(){
        System.out.println("O carro ligou...");
    }
    
    public void desligar(){
        System.out.println("O carro desligou...");
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getMatricula(){
        return this.matricula;
    }
    
    public void acelerar(){
        this.velocidadeAtual = this.velocidadeAtual + 10;
        
        if (this.velocidadeAtual > this.velocidadeMaxima){
            this.velocidadeAtual = this.velocidadeMaxima;
        }
    }
    
    public void travar(){
        this.velocidadeAtual = this.velocidadeAtual - 10;
        
        if(this.velocidadeAtual < 0){
            this.velocidadeAtual = 0;
        }
    }
    
    public void buzinar(){
        System.out.println("Buzina do carro...");
    }
}
