package org.pablofranco.bean;

public class Estudiante {

    private int idEstudiante;
    private int[] notasEstudiantes = new int[5];

    public Estudiante(int idEstudiante, int[] notasEstudiantes) {
        this.idEstudiante = idEstudiante;
        this.notasEstudiantes = notasEstudiantes;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }


    public int[] getNotasEstudiantes() {
        return notasEstudiantes;
    }



}
