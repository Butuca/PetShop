/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author lucas
 */
public class Mamifero extends Animal{
    public int qtdMamas;
    public boolean amamamenta;

    public Mamifero(int qtdMamas, String nome, int idade) {
        super(nome, idade);
        this.qtdMamas = qtdMamas;
    }

    public int getQtdMamas() {
        return qtdMamas;
    }

    public void setQtdMamas(int qtdMamas) {
        this.qtdMamas = qtdMamas;
    }

    public boolean isAmamamenta() {
        return amamamenta;
    }

    public void setAmamamenta(boolean amamamenta) {
        this.amamamenta = amamamenta;
    }

   
    
    
    
}
