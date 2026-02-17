package org.example;

public class student extends Person{


    }

    private String curso;
    private String notaMedia;

    public student() {}

    public student(int id, String name, String email, String curso, String notaMedia) {
        super(id, name, email);
        this curso = curso;
        this.notaMedia = notaMedia;
    }

    public student(String name, String email, String curso, String notaMedia) {
        super(name, email);
        this.curso = curso;
        this.notaMedia = notaMedia;
    }

    ///---Métodos---
    /// Permisos / Retorno (void no retorna) / Nombre función / (): parametros
    @Override
    public String mostrarInfo() {
        return "CURSO:" + curso + "\n" +
                "NOTA MEDIA" + notaMedia;
}

/// ---GETTERS & SETTERS---

public String getCurso() {
    return curso;
}

    public void setCurso(String curso) {
        this.curso = curso;
    }
public String getNotaMedia() {
    return notaMedia;
}

public void setNotaMedia(String notaMedia) {
    this.notaMedia = notaMedia;
}
