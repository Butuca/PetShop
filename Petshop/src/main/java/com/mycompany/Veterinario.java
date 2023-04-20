/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author lucas
 */
public class Veterinario {
   
    public void atenderAnimal(Animal aux ) throws Exception{
        
        System.out.println("\nNome do Paciente: " + aux.getNome());
        System.out.println("Idade do Paciente: " + aux.getIdade());
        
        if (aux instanceof Cachorro){
            Cachorro cachorro = (Cachorro) aux;
            System.out.println("Raca: " +  cachorro.raca);
        }else{
            throw new Exception("Nao é um cachorro");
        }
    }
}
