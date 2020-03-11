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
private int maxUsers = 0;
private int mat[][] ; //definição da matriz
private int contUsers; // contador de usuarios
private int posUsers[] ;// vetor de busca de usuarios

public MatrizADJ(int contUsers){
this.mat = new int [contUsers][contUsers];
this.posUsers = new int [contUsers];
this.contUsers = contUsers;
this.maxUsers = maxUsers;

    for ( int i = 0; i < this.contUsers; i ++) {
        for ( int j = 0; j < this.contUsers; j ++){
            this.mat[i][j] = 0;
            this.posUsers[i] = -1;  
        }
    }
}

public void insereRelacao ( int user1, int user2, int tempo) {
this .mat[user1][user2] = tempo; 
}
public boolean existeRelacao ( int user1, int user2) {
return (this .mat[user1] [user2] > 0);
}

public boolean listaAdjVazia ( int v) {
for ( int i =0; i < this.contUsers; i++)
if (this .mat[v] [ i ] > 0) return false;
return true;
}

public Relacao retiraAresta ( int v1, int v2) {
    if (this.mat[v1][v2] == 0) return null ; // Aresta não existe
    else {
    Relacao relacao = new Relacao (v1, v2, this .mat[v1] [v2] ) ;
    this.mat[v1] [v2] = 0; return relacao;
    }
}


public void imprime ( ) {
    System.out. print ( " " );
    for ( int i = 0; i < this.contUsers; i++)
    System.out. print ( i + " " );
    System.out. println ( ) ;
    for ( int i = 0; i < this.contUsers; i ++) {
    System.out. print ( i + " " );
    for ( int j = 0; j < this.contUsers; j++)
    System.out. print (this .mat[ i ] [ j ] + " " );
    System.out. println ( ) ;
    }
}
public int numVertices ( ) {
return this.contUsers;
}

public void CadastraUsuario(){
    if(this.maxUsers<50){
        
    }
    //TODO função que alerta que o limite de usuario foi atingido
}
        

}