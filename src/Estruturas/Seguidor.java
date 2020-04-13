/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estruturas;

/**
 *
 * @author Matheus Simoes
 */
public class Seguidor implements Comparable<Seguidor>{
    public String nome;
    public int tempo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }    
    
    @Override
    public int compareTo(Seguidor s) {
        if(this.nome == s.getNome()){
            return 0;
        }
        else{
            return 1;
        }
    }
    
}