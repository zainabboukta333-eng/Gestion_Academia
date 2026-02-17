package org.example;

public class Person {
    /*
    1.ID
    2.Name
    3.Email
     */
    /// ---ATRIBUTOS---
    private int id;
    private String name;
    private String email;

    /// ---CONSTRUCTORES---

    ///  Los frameworks ORM (Hibernate/JPA) utilizan reflexión para crear instancia
    /// de las clases cuando recuperan datos de la base de datos.
    public Person()  {}

    /// Constructoe con todos los parametros
    /// Este constructor se usa cuando creamos un objeto Persona con todos sus datos conocidos.
    public Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    /// Constructor solo con name y email
    public Person (String nombre, String email) {
        this.name = nombre;
        this.email = email;

    ///---Métodos---
    /// Permisos / Retorno (void no retorna) / Nombre función / (): parametros
    public String mostrarInfo() {
        return "ID:" + id + "\n" +
            "NOMBRE" + name + "\n" +
            "EMAIL" + email


    }

    ///---Getters y setter--- (seleccionar atributos, clic derecho, generate, getter y setter)
    public int getId() {
    }
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
