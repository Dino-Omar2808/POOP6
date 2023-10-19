/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.poo;

/**
 *
 * @author dinos 
 * Clase que contine los metodos de lo que hace una persona 
 */
public class Persona {
    private String nombre, direccion;
    private int edad;

    /** 
     * Constructor vacio de persona
     */
    public Persona() {
    }
    /**
     * Constructor lleno de persona
     * @param nombre El nombre de la perona en String
     * @param direccion La direccion de la persona en String
     * @param edad La edad de la persona en primitivo entero
     */
    public Persona(String nombre, String direccion, int edad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
    }
    /**
     * Metodo get NOmbre
     * @return regresa el nombre de la perona 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Modifica el Nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo get Direccion
     * @return regresa la direccion de la persona
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * Modifica la direccion
     * @param direccion 
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * Metodo get Edad
     * @return regresa la edad de la persona
     */
    public int getEdad() {
        return edad;
    }
    /**
     * Modifica al edad de la persona
     * @param edad 
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * Metodod que sirve para que la perosna hable 
     * @param var lo que la perosna esta diciendo
     */
    public void hablar(String var){
        System.out.println(var);
    }
    /**
     * Metodo sobre escrito que muestra 
     * los valores de los atributos
     * @return regresa una concatenacion 
     * de los valores de los atributos 
     */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre 
                + ", direccion=" + direccion 
                + ", edad=" + edad + '}';
    }
    
}
