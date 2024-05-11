/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudexample;
import java.sql.Date;
/**
 *
 * @author miguelcatalan
 */
public class Estudiante {
    private String carne;
    private String nombres;
    private String apellidos;
    private int edad;
    private char sexo;
    private boolean solvente;
    private java.sql.Date fechaInscripcion;
    

    public Estudiante() {
    }
    
    public Estudiante(String numeroCarne, String nombre, String apellido, int edad, char sexo) {
        this.carne = numeroCarne;
        this.nombres = nombre;
        this.apellidos = apellido;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    @Override
    public String toString() {
        return "Datos de estudiante: Carne: " + getCarne() + " Nombre: " + getNombres() +  " Apellido: " + getApellidos() + " Edad: " + getEdad() + " Sexo: " + getSexo();
    }
}
