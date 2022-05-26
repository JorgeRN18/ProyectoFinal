/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testcole;

/**
 *
 * @author Administrador
 */
public class Alumno {
    private String codigo;
    private String alumno;
    private int notaExamen1 = 4;
    private int notaExamen2 = 8;
    private int notaExamen3 = 3;
    private int notaExamen4 = 7;
    private int notaExamen5 = 3;
    private int notaExamen6 = 4;
    private double notaParcial1;
    private double notaParcial2;
    private double notaParcial3;
    private double notaFinal;

    public Alumno() {
    }

  
    
    public double CalcularParcial1 (){
        this.notaParcial1 = (this.notaExamen1+this.notaExamen2)/2;
        return notaParcial1;
    }
    
    public double CalcularParcial2 (){
        this.notaParcial2 = (this.notaExamen3+this.notaExamen4)/2;
        return this.notaParcial2;
    }
    
    public double CalcularParcial3 (){
        this.notaParcial3 = (this.notaExamen5+this.notaExamen6)/2;
        return this.notaParcial3;
    }
    
    public double CalculaMedia (){
        this.notaParcial1 = (this.notaExamen1+this.notaExamen2)/2;
        this.notaParcial2 = (this.notaExamen3+this.notaExamen4)/2;
        this.notaParcial3 = (this.notaExamen5+this.notaExamen6)/2;
        notaFinal = (this.notaParcial1 + this.notaParcial2 + this.notaParcial3)/3;
    
        return notaFinal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public int getNotaExamen1() {
        return notaExamen1;
    }

    public void setNotaExamen1(int notaExamen1) {
        this.notaExamen1 = notaExamen1;
    }

    public int getNotaExamen2() {
        return notaExamen2;
    }

    public void setNotaExamen2(int notaExamen2) {
        this.notaExamen2 = notaExamen2;
    }

    public int getNotaExamen3() {
        return notaExamen3;
    }

    public void setNotaExamen3(int notaExamen3) {
        this.notaExamen3 = notaExamen3;
    }

    public int getNotaExamen4() {
        return notaExamen4;
    }

    public void setNotaExamen4(int notaExamen4) {
        this.notaExamen4 = notaExamen4;
    }

    public int getNotaExamen5() {
        return notaExamen5;
    }

    public void setNotaExamen5(int notaExamen5) {
        this.notaExamen5 = notaExamen5;
    }

    public int getNotaExamen6() {
        return notaExamen6;
    }

    public void setNotaExamen6(int notaExamen6) {
        this.notaExamen6 = notaExamen6;
    }

    public double getNotaParcial1() {
        return notaParcial1;
    }

    public void setNotaParcial1(double notaParcial1) {
        this.notaParcial1 = notaParcial1;
    }

    public double getNotaParcial2() {
        return notaParcial2;
    }

    public void setNotaParcial2(double notaParcial2) {
        this.notaParcial2 = notaParcial2;
    }

    public double getNotaParcial3() {
        return notaParcial3;
    }

    public void setNotaParcial3(double notaParcial3) {
        this.notaParcial3 = notaParcial3;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
    
    
}

