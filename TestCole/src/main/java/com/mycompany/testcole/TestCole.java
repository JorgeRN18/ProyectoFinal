/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testcole;

/**
 *
 * @author Administrador
 */
public class TestCole {
    public static void main(String[] args) {
     Alumno alu = new Alumno();
     Escuela esc = new Escuela();
        System.out.println("nota final: "+alu.CalculaMedia());
        System.out.println("------------");
        System.out.println("Bachiller: "+esc.CalculaBachiller());
        System.out.println("eso: "+esc.CalculaEso());
        System.out.println("primaria: "+esc.CalculaPrimaria());
    }

}
