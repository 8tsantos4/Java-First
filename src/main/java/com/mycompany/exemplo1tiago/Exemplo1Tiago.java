/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplo1tiago;

/**
 *
 * @author Tiago
 */
public class Exemplo1Tiago {

    public static void main(String[] args) {
        //Objeto do tipo Carro
        
        Carro c1 = new Carro();
        
        c1.setMatricula("AA01AA");
        c1.ligar();
        
        System.out.println("A matricula do carro e "+c1.getMatricula());
        System.out.println("A velocidade atual é"+c1.velocidadeAtual);
        
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println("A velocidade atual e:"+c1.velocidadeAtual);
        
        c1.travar();
        System.out.println("A velocidade atual e:"+c1.velocidadeAtual);
        
        c1.buzinar();
        
        c1.desligar();
        
        //Declarar um carro citadino
        
        Citadino citadino1 = new Citadino();
        System.out.println("----------------------");
        citadino1.setMatricula("22AA44");
        citadino1.ligar();
        citadino1.acelerar();
        System.out.println("A matricula do carro e "+citadino1.getMatricula());
        System.out.println("A velocidade atual é"+citadino1.velocidadeAtual);
        citadino1.buzinar();
        citadino1.ligarACManual();
        citadino1.desligar();
        
    }
}
