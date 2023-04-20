/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author lucas
 */
public class Cachorro extends Mamifero{
    public String raca;

    public Cachorro(String nome, int qtdMamas, int idade, String raca) {
        super(qtdMamas, nome, idade);
        this.raca = raca;
    }

    
        
    
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
}
