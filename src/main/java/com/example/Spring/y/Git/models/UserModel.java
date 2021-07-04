package com.example.Spring.y.Git.models;

public class UserModel {


    private long id;
    private String nombre;
    private String apellidos;
    private String dni;
    private int numero;


    public UserModel(long id, String nombre, String apellidos, String dni, int numero) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.numero = numero;
    }
}
