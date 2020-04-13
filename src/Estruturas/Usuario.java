/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estruturas;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Matheus Simoes
 */
public class Usuario {
    public int id;
    public String nome;
    public int idade;
    public Set<Seguidor> seguidores = new TreeSet<Seguidor>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
