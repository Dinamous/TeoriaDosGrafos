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
            matriz[i][j]=5;
            
        }
    }   
    //System.out.println(Arrays.deepToString(matriz));
}

public void insereUsuario(Usuario usuario){
    
    listaNomes.add(usuario.nome);
    
    System.out.println(Arrays.toString(listaNomes.toArray()));
    //System.out.println(Arrays.deepToString(matriz));
    }
    
    public void insereRelacao(int posUsuario,int posSeguidor, int tempo){
        this.matriz[posUsuario][posSeguidor] = tempo;
        System.out.println("x =" + posUsuario + "   y=" + posSeguidor + " t=" + matriz[posUsuario][posSeguidor]);
        System.out.println(Arrays.deepToString(matriz));
    }
    
    public ArrayList<Seguidor> listarSequidores(String nome, int posicao){//lista seguidores de um usuario
        ArrayList<Seguidor> AL = new ArrayList();
        Usuario usu = new Usuario();
        Seguidor seg = new Seguidor();
        System.out.println("posição: "+posicao);
       
        
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(this.matriz[i][j]);
            }
            System.out.println("");
        }
        
        for(int i=0;i<50;i++){
            //percorrendo a matriz pelas colunas em busca do usu solicitado
            if(matriz[i][posicao] != 0){ //se exite algum relacionamento
                System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
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
        Seguidor seg = new Seguidor();
        for(int i=0;i<50;i++){
            //percorrendo a matriz pelas linhas em busca do usu solicitado
            if(matriz[posicao][i] !=0){ //se exite algum relacionamento
                //buscando o nome da relação
                usu = ListaUsuarios.get(i);
                seg.nome = usu.nome;
                //buscando o tempo da relação
                seg.tempo = matriz[i][posicao];
                AL.add(seg);
            }
        }        
        
        return AL;
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