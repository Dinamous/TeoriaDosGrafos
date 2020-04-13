/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estruturas;

import Estruturas.AVL.AVL;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Matheus Simoes
 */
public class Grafo {
   public int contUsuario=80;
   public MatrizADJ matriz = new MatrizADJ();
   public AVL avl = new AVL();
   public ArrayList<String> ListaUsuarios = new ArrayList();    
    
    public void inicializaGrafo(){
        matriz.inicializaMatriz();
        
    }
    
    public void insereUsuario(String nome, int idade){
        
        ListaUsuarios.add(nome);
        matriz.insereUsuario(nome,idade);
        avl.insereUsuario(nome, idade);

        contUsuario--;
        
    }
    
    public void insereRelacao(String usuario, String seguidor, int tempo){
       
        int posUsuario = ListaUsuarios.indexOf(usuario);
        int posSeguidor = ListaUsuarios.indexOf(seguidor);
        
        matriz.insereRelacao(posUsuario,posSeguidor,tempo);
        avl.insereRelacao(usuario, seguidor, tempo);
    }
    
      
    public void listarSeguidoresVelhos(){
        matriz.listarSeguidoresVelhos();
        
    }
    
    public void atualizarRelacao(String usuario,String segue,int tempo){
        matriz.atualizarRelacao(usuario,segue,tempo);
        avl.atualizarRelacao(usuario, segue, tempo);
        
    }
    
    public void removeUsuario(String usuario){    
        System.out.println("grafo removido:"+usuario+" pos:"+ListaUsuarios.indexOf(usuario));
        matriz.removeUsuario(usuario);
        avl.removeUsuario(usuario);
    }
    
    public void removeRelacao(String usuario, String segue){
        matriz.removeRelacao(usuario,segue);
        avl.removeRelacao(usuario, segue);
    }
    
    public boolean VerificaUsuarioJaInserido(String nome){
        //buscando dentro da lista de usuarios se o que foi inserido re entemente já existe
        
        if(ListaUsuarios.contains(nome)){
            return true;
        }
        
        return false;
    }
    

    
    
    public void LerArquivo() throws FileNotFoundException, IOException{
         FileInputStream stream = new FileInputStream("script.txt");
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(reader);
        String linha = br.readLine();
        
        String[] temparray;
        Random rand = new Random();
        
        while(linha != null) {
           
            for(int i=0;i<50;i++){
                temparray = linha.split(" ");
                insereUsuario(temparray[0],Integer.parseInt(temparray[1]));
                linha = br.readLine();
            }
            
            linha = br.readLine();
            
            for(int i=0;i<50;i++){
                
                temparray = linha.split(" ");
                
                for(int j=1;j<temparray.length;j++){
                    String nome = ListaUsuarios.get(Integer.parseInt(temparray[j]));
                    insereRelacao(temparray[0],nome,rand.nextInt(25));
                    
//                    System.out.println("nome:"+temparray[0] +" seg:"+nome);
                }
                linha = br.readLine();
            }
                
    
        }
    }
   
  
    
}