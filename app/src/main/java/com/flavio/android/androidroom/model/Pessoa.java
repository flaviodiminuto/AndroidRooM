package com.flavio.android.androidroom.model;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class Pessoa {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private int idade;
    private String nome;
    private String profissao;

    public Pessoa() {}

    @Ignore
    public Pessoa(int id, int idade, String nome, String profissao) {
        this.id = id;
        this.idade = idade;
        this.nome = nome;
        this.profissao = profissao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
