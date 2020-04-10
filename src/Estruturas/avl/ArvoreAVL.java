package avl;
/**
 *
 * @author Nayara Freire
 */
public class ArvoreAVL {
    private No raiz;

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }    
    
    public ArvoreAVL(No raiz) {
        this.raiz = raiz;
    }
    
    void AtualizaAltura(No n){
        n.altura = 1 + Math.max(Altura(n.esquerdo), Altura(n.direito));
    }
    
    int Altura(No n) {
        return n == null ? -1 : n.altura;
    }
    
    int Balancear(No n){
        return (n == null) ? 0 : Altura(n.direito) - Altura(n.esquerdo);
    }
    
    No RotacaoDireita(No y){
        No x = y.esquerdo;
        No z = x.direito;
        x.direito = y;
        y.esquerdo = z;
        AtualizaAltura(y);
        AtualizaAltura(x);
        return x;
    }   
    
    No RotacaoEsquerda(No y){
        No x = y.direito;
        No z = x.esquerdo;
        x.esquerdo = y;
        y.direito = z;
        AtualizaAltura(y);
        AtualizaAltura(x);
        return x;
    }
    
    private No filhoMaisEsquerdo(No no) {
        No atual = no;
        /* loop down to find the leftmost leaf */
        while (atual.esquerdo != null) {
            atual = atual.esquerdo;
        }
        return atual;
    }
    
    No Rebalanceia(No z){
        AtualizaAltura(z);
        int equilibrio = Balancear(z);
        
        if(equilibrio > 1){
            if(Altura(z.esquerdo.esquerdo) > Altura(z.direito.direito)){
                z = RotacaoEsquerda(z);
            }
            else{
                z.direito = RotacaoDireita(z.direito);
                z = RotacaoEsquerda(z);
            }
        }
        else if(equilibrio < -1){
            if(Altura(z.esquerdo.esquerdo) > Altura(z.esquerdo.esquerdo)){
                z = RotacaoDireita(z);
            }
            else{
                z.esquerdo = RotacaoEsquerda(z.esquerdo);
                z = RotacaoDireita(z);
            }
        }
        return z;
    }
    
    public void Inserir(int id) {
        raiz = Inserir(raiz, id);
    }
    
    No Inserir(No no, int id){
        if(no == null){
            return new No(id);
        }        
        else if(no.id > id){
            no.esquerdo = Inserir(no.esquerdo, id);
        }
        else if(no.id < id){
            no.direito = Inserir(no.direito, id);
        }
        else{
            throw new RuntimeException("duplicate Key!");
        }
        return Rebalanceia(no);
    }
    
    public void Deletar(int id) {
        raiz = Deletar(raiz, id);
    }
    
    No Deletar(No no, int id){
        if(no == null){
            return no;
        }
        else if(no.id > id){
            no.esquerdo = Deletar(no.esquerdo, id);
        }
        else if(no.id < id){
            no.direito = Deletar(no.direito, id);
        }
        else{
            if(no.esquerdo == null || no.direito == null){
                no = (no.esquerdo == null) ? no.direito : no.esquerdo;
            }
            else{
                No filhoMaisEsquerdo = filhoMaisEsquerdo(no.direito);
                no.id = filhoMaisEsquerdo.id;
                no.direito = Deletar(no.direito, no.id);
            }
        }
        if(no != null){
            no = Rebalanceia(no);
        }
        return no;
    }
    
    No Busca(int id){
        No atual = raiz;
        
        while(atual != null){
            if(atual.id == id){
                break;
            }
            atual = atual.id < id ? atual.direito : atual.esquerdo;
        }
        return atual;
    }
}
