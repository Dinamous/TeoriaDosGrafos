/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estruturas.Lista;

import Estruturas.Seguidor;
import Estruturas.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Matheus Simoes
 */
public class ListaADJ {
    public ArrayList<Usuario> listaUsuarios = new ArrayList();
    public ArrayList<String> listaNomes = new ArrayList();
    
    
    
    public void insereUsuario(String nome, int idade){
    Usuario usu = new Usuario();
        usu.nome = nome;
        usu.idade = idade;
        
    listaNomes.add(nome);
    listaUsuarios.add(usu);
    }
    
    public void insereRelacao(int posUsuario,String Usuario,String seguidor, int tempo){
        Seguidor seg = new Seguidor();
        seg.nome = seguidor;
        seg.tempo = tempo;
        
        listaUsuarios.get(posUsuario).listaSeguidor.add(seg);
        System.out.println(seguidor);
        
    }
    
    public ArrayList<Seguidor> listarSequidores(String nome, int posicao){//lista seguidores de um usuarioS
        ArrayList<Seguidor> AL = new ArrayList();
        
        return AL;
    }
    
    public ArrayList<Seguidor> listarSeque(String nome, int posicao){//lista pessoas que um usuario segue
        ArrayList<Seguidor> AL = new ArrayList();
       
        
        return AL;
    }
    
    
    
    public ArrayList<Usuario> listarSeguidoresVelhos(){
        ArrayList<Usuario> AL = new ArrayList();
        
        return AL;
    }
    
    public void atualizarRelacao(String usuario,String segue,int tempo){
        
    }
    
    public void removeUsuario(String usuario){
        
    }
    
    public void removeRelacao(String usuario,String segue){
       
    }
    
    public boolean ExisteRelacao(String usuario,String segue){
      
        return false;
    }
    
}
