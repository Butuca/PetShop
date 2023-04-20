/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author lucas
 */
public class Principal {
    public static void main(String[] args)  {
        Veterinario vet = new Veterinario();
        Petshop pet = new Petshop();
        
        Animal animal1 = new Animal("Frajola", 3);
        pet.cadastrarAnimal(animal1);
        
        Animal animal2 = new Cachorro("Rex", 5, 8, "Labrador");
        pet.cadastrarAnimal(animal2);
        
        Animal animal3 = new Animal("Mel", 2);
        pet.cadastrarAnimal(animal3);
        
        pet.listarAnimais();
        
        System.out.println("Qual animal o veterinario vai atender ?: ");
   
        try{
            vet.atenderAnimal(animal3);
        }catch (Exception ex){
            System.out.println(ex);
        }
        
        
        
    }
}
