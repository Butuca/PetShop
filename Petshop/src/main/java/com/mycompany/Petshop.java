/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author lucas
 */
public class Petshop{ 
    List<Animal> animais = new ArrayList<>();
    
    public void cadastrarAnimal(Animal a){
        animais.add(a);
    }
    public void listarAnimais() {
        for (Animal animal : animais) {
            System.out.println("\nNome: " + animal.getNome());
            System.out.println("Idade: " + animal.getIdade() + " Anos");
            if (animal instanceof Cachorro) {
                Cachorro cachorro = (Cachorro) animal;
                System.out.println("Raça: " + cachorro.getRaca());
            }
        }
    }
}
