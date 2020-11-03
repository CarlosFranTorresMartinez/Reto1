/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ctmar
 */
public class Nota {

    private String nombre;
    private int problema;
    private int teoria;
    private int practica;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getProblema() {
        return problema;
    }

    public void setProblema(int problema) {
        this.problema = problema;
    }

    public int getTeoria() {
        return teoria;
    }

    public void setTeoria(int teoria) {
        this.teoria = teoria;
    }

    public int getPractica() {
        return practica;
    }

    public void setPractica(int practica) {
        this.practica = practica;
    }

    @Override
    public String toString() {
        return "Nota{" + "nombre=" + nombre + ", problema=" + problema + ", teoria=" + teoria + ", practica=" + practica + '}';
    }

}
