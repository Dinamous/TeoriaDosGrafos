/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estruturas.Lista;

import Estruturas.Seguidor;
import Estruturas.Usuario;
import java.util.ArrayList;
import java.util.Iterator;

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
        
        
    }
    
    public ArrayList<Seguidor> listarSequidores(String nome, int posicao){//lista seguidores de um usuarioS
        ArrayList<Seguidor> AL = new ArrayList();
        
        for(Usuario usu:listaUsuarios){
            for(Seguidor segue : usu.listaSeguidor){
               
                if(segue.nome.equals(nome)){
                    Seguidor seq = new Seguidor();
                    seq.nome = usu.nome;
                    seq.tempo = segue.tempo;
                    AL.add(seq);
                    System.out.println(nome);
                }
            }
        }
        
        return AL;
    }
    
    public ArrayList<Seguidor> listarSeque(String nome){//lista pessoas que um usuario segue
        int posUsuario = listaNomes.indexOf(nome); 
  
        for (Seguidor seg : listaUsuarios.get(posUsuario).listaSeguidor) {
            System.out.println(seg.nome);
        }
        return listaUsuarios.get(posUsuario).listaSeguidor;
    }
    
    
    
    public ArrayList<Usuario> listarSeguidoresVelhos(){
        ArrayList<Usuario> AL = new ArrayList();
        
        return AL;
    }
    
    public void atualizarRelacao(String usuario,String segue,int tempo){
        int posUsuario = listaNomes.indexOf(usuario);
        int posSegue = listaNomes.indexOf(segue);
        
        listaUsuarios.get(posUsuario).listaSeguidor.get(posSegue).tempo = tempo;
    }
    
    public void removeUsuario(String usuario){
//        int posUsuario = listaNomes.indexOf(usuario);
//        
//        //percorrendo todos os usuarios para escluir pessoas que seguem este usuario
//        for(Usuario usu :listaUsuarios){
//            if(usu.listaSeguidor.contains(usu)){
//                
//            }
//        }
//        
//        listaUsuarios.remove(posUsuario);
    }
    
    public void removeRelacao(String usuario,String segue){
        int posUsuario = listaNomes.indexOf(usuario);
        int posSegue = listaNomes.indexOf(segue);
        
        listaUsuarios.get(posUsuario).listaSeguidor.remove(posSegue);
        
    }
    
   
    
}
