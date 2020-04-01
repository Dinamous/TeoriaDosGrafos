
package Estruturas;

import java.util.ArrayList;

public class MatrizADJ {
   
  
  int[][] matriz = new int[50][50];
  public ArrayList<Usuario> ListaUsuarios = new ArrayList();
  
   public void inicializaMatriz(){
        for(int i=0;i<50;i++){
            for(int j=0;j<50;j++){
                matriz[i][j]=0;
            }
    }
   }

public void insereUsuario(Usuario usuario){
    
    ListaUsuarios.add(usuario);
    System.out.println(ListaUsuarios.get(0));
    }
    
    public void insereRelacao(int posUsuario,int posSeguidor, int tempo){
        matriz[posUsuario][posSeguidor] = tempo;
    }
    
    public void listarSequidores(){
        
    }
    
    public void listarSeguidoresVelhos(){
        
    }
    
    public void atualizarRelacao(){
        
    }
    
    public void removeUsuario(){
    }
    
    public void removeRelacao(){
        
    }
    
}