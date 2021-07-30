/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lampada.joao;

/**
 *
 * @author jazz
 */
public class Lampada {
    private String marca;
    private String modelo;
    private String tipo;
    private String formato;
    private int potencia;
    private int tempCor;

    public Lampada() {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.formato = formato;
        this.potencia = potencia;
        this.tempCor = tempCor;
    }
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getTempCor() {
        return tempCor;
    }

    public void setTempCor(int tempCor) {
        this.tempCor = tempCor;
    }
    
    void desligarLampada(){
        System.out.println("lampada desligada");
    }
    
    void ligarLampada(){
        System.out.println("lampada ligada");
    }
    
}
