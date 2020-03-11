/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estruturas;

/**
 *
 * @author 201811000014
 */
public class MatrizADJ {
    
public static class Relacao {
private int user1, user2, tempo;

//construtor da matriz
public Relacao(int user1, int user2, int tempo) {
    this.user1 = user1;
    this.user2 = user2;
    this.tempo = tempo; 
}

public int peso(){
    return this.tempo;
}
public int user1(){
    return this.user1;
} 
public int user2(){
    return this.user2;
} 
}
private int mat[][] ; //
private int contUsers;
private int posUsers[] ;

}