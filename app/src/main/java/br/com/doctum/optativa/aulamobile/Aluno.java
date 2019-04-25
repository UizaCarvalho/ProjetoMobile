package br.com.doctum.optativa.aulamobile;

import java.util.ArrayList;

public final class Aluno {
    public int id;
    public String nome;
    public String email;
    public String telefone;
    public int idade;

    private static final Aluno SELF = new Aluno();

    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public static  Aluno GetIstance() {
        return SELF;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
}
