/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estruturas;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Matheus Simoes
 */
public class Grafo {
   public int contUsuario=50;
   public MatrizADJ matriz = new MatrizADJ();
   public ArrayList<String> ListaUsuarios = new ArrayList();    
    
    public void inicializaGrafo(){
        matriz.inicializaMatriz();
        
    }
    
    public void insereUsuario(Usuario usuario){
        
        ListaUsuarios.add(usuario.nome);
        matriz.insereUsuario(usuario);
        

        contUsuario--;
        
    }
    
    public void insereRelacao(String usuario, String seguidor, int tempo){
        System.out.println(Arrays.toString(ListaUsuarios.toArray()));
        int posUsuario = ListaUsuarios.indexOf(usuario);
        int posSeguidor = ListaUsuarios.indexOf(seguidor);
        
        matriz.insereRelacao(posUsuario,posSeguidor,tempo);
    }
    
      
    public void listarSeguidoresVelhos(){
        
    }
    
    public void atualizarRelacao(){
        
    }
    
    public void removeUsuario(){
    }
    
    public void removeRelacao(){
        
    }
    
    public boolean VerificaUsuarioJaInserido(String nome){
        //buscando dentro da lista de usuarios se o que foi inserido re entemente já existe
        
        if(ListaUsuarios.contains(nome)){
            return true;
        }
        
        return false;
    }
    
    
    public boolean BuscaRelacao(String nome, String seguidor){
        
        
        
        return false;
    }
    
   
  
    
}
