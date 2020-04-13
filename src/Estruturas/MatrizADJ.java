package Estruturas;

import java.util.ArrayList;
import java.util.Arrays;

public class MatrizADJ {
   
  
  public int[][] matriz = new int[50][50];
  public ArrayList<Usuario> ListaUsuarios = new ArrayList();
  public ArrayList<String> listaNomes = new ArrayList();
 
  
public void inicializaMatriz(){
        
    for(int i=0;i<50;i++){
        for(int j=0;j<50;j++){
            matriz[i][j]=0;
            
        }
    }   
    
}

public void insereUsuario(String nome, int idade){
    Usuario usu = new Usuario();
    listaNomes.add(nome);
    usu.nome = nome;
    usu.idade = idade;
    ListaUsuarios.add(usu);
    
    
    }
    
    public void insereRelacao(int posUsuario,int posSeguidor, int tempo){
        matriz[posUsuario][posSeguidor] = tempo;
        
        
    }
    
    public ArrayList<Seguidor> listarSequidores(String nome, int posicao){//lista seguidores de um usuarioS
        ArrayList<Seguidor> AL = new ArrayList();
              
        for(int i=0;i<listaNomes.size();i++){
            //percorrendo a matriz pelas colunas em busca do usu solicitado
            if(matriz[i][posicao] != 0){ //se exite algum relacionamento
                 Seguidor seg = new Seguidor();
               
                //buscando o nome da relação
                seg.nome = listaNomes.get(i);
                //buscando o tempo da relação
                seg.tempo = matriz[i][posicao];
                AL.add(seg);
            }
        }        
        
        return AL;
    }
    
    public ArrayList<Seguidor> listarSeque(String nome, int posicao){//lista pessoas que um usuario segue
        ArrayList<Seguidor> AL = new ArrayList();
        Usuario usu = new Usuario();
        
        for(int i=0;i<listaNomes.size();i++){
            //percorrendo a matriz pelas linhas em busca do usu solicitado
            if(matriz[posicao][i] !=0){ //se exite algum relacionamento
                Seguidor seg = new Seguidor();
                //buscando o nome da relação
                seg.nome = listaNomes.get(i);
                //buscando o tempo da relação
                seg.tempo = matriz[posicao][i];
                AL.add(seg);
            }
        }        
        
        return AL;
    }
    
    
    
    public ArrayList<Usuario> listarSeguidoresVelhos(){
        ArrayList<Seguidor> AL = new ArrayList();
        Usuario usuario = new Usuario();
        Usuario seguidor = new Usuario();
        boolean velho = false;
         ArrayList<Usuario> ListaDeSeguidoresVelhos = new ArrayList();
        
        for(Usuario usu:ListaUsuarios){
            velho=false;
            for(Usuario seg: ListaUsuarios){
                if(ExisteRelacao(seg.nome, usu.nome)){
                    if(usu.idade<seg.idade){
                        ListaDeSeguidoresVelhos.add(usu);

                        

                        velho=true;
                    }
                }
                if(velho){
                    break;
                }
            }
            
        }
        
       
        
        return ListaDeSeguidoresVelhos;
    }
    
    public void atualizarRelacao(String usuario,String segue,int tempo){
        int posUsuario = listaNomes.indexOf(usuario);
        int posSegue = listaNomes.indexOf(segue);
        
        matriz[posUsuario][posSegue] = tempo;
    }
    
    public void removeUsuario(String usuario){
        //percorre todos os usuarios removendo seus relacionamentos
        int pos = listaNomes.indexOf(usuario);
       
         for(int i=0;i<50;i++){
             matriz[pos][i] = 0;
             matriz[i][pos] = 0;
         }   
        // removendo usuario da lista de usuarios
        ListaUsuarios.remove(pos);
        
        
       
        
    }
    
    public void removeRelacao(String usuario,String segue){
        int posUsuario = listaNomes.indexOf(usuario);
        int posSegue = listaNomes.indexOf(segue);
        
        matriz[posUsuario][posSegue] = 0;
    }
    
    public boolean ExisteRelacao(String usuario,String segue){
        int posUsuario = listaNomes.indexOf(usuario);
        int posSegue = listaNomes.indexOf(segue);
        if(matriz[posUsuario][posSegue] != 0){
            return true;
        }
        
        return false;
    }
}