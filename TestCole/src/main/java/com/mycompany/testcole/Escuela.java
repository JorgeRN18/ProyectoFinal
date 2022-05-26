/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testcole;

/**
 *
 * @author Administrador
 */
public class Escuela {
    int Alumnos = 390;
    // bachiller es el 20% del total
    int bachiller;
    // bachiller es el 40% del total
    int eso;
    // bachiller es el 40% del total
    int primaria;

    public Escuela() {
        this.bachiller = bachiller;
        this.eso = eso;
        this.primaria = primaria;
    }
    
    
    public int CalculaBachiller(){
    bachiller = (int) (Alumnos*0.20);
        return bachiller;
}
    
        public int CalculaEso(){
    eso = (int) (Alumnos*0.40);
        return eso;
}
        
            public int CalculaPrimaria(){
    primaria = (int) (Alumnos*0.40);
        return primaria;
}
}
