package Estruturas.AVL;

import Estruturas.Seguidor;
import Estruturas.Usuario;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Nayara Freire
 */
public class AVL {

    public ArrayList<Usuario> ListaUsuarios = new ArrayList();
    public ArrayList<String> ListaNomes = new ArrayList();
    int id = 0;

    public void insereUsuario(String nome, int idade) {
        Usuario usuario = new Usuario();
        usuario.nome = nome;
        usuario.idade = idade;
        usuario.id = id++;

        ListaNomes.add(nome);
        ListaUsuarios.add(usuario);
    }

    public void insereRelacao(String usuario, String seguidor, int tempo) {
        int pos = ListaNomes.indexOf(usuario);
       

        Seguidor seg = new Seguidor();
        seg.nome = seguidor;
        seg.tempo = tempo;

        boolean add = ListaUsuarios.get(pos).seguidores.add(seg);
       

    }

    public ArrayList<Usuario> listarSequidores(String nome, int posicao) {//lista seguidores de um usuarioS
        ArrayList<Usuario> AL = new ArrayList();

        int pos = ListaUsuarios.indexOf(nome);

        for (Usuario u : ListaUsuarios) {
            for (Seguidor s : u.seguidores) {

                if (s.nome.equals(nome)) {

                    AL.add(u);

                }
            }
        }

        return AL;
    }

    public ArrayList<Seguidor> listarSeque(String nome, int posicao) {//lista pessoas que um usuario segue
        ArrayList<Seguidor> AL = new ArrayList();

        for (Usuario u : ListaUsuarios) {
            if (u.nome.equals(nome)) {
                for (Seguidor seg : u.seguidores) {
                    AL.add(seg);
                }
            }
        }
        return AL;
    }

    public ArrayList<Usuario> listarSeguidoresVelhos() {
        ArrayList<Usuario> AL = new ArrayList();
        boolean velho = false;

        for (Usuario u : ListaUsuarios) {
            velho = false;
            for (Seguidor s : u.seguidores) {
                for (Usuario x : ListaUsuarios) {
                    if (s.nome.equals(x.nome)) {
                        if (u.idade < x.idade) {
                            AL.add(u);
                        }
                    }
                }
            }
        }
        return AL;
    }

    public void atualizarRelacao(String usuario, String segue, int tempo) {
        int pos = ListaNomes.indexOf(segue);

        for (Usuario u : ListaUsuarios) {
            if (u.nome.equals(usuario)) {
                for (Seguidor s : u.seguidores) {
                    if (s.nome.equals(segue)) {
                        s.tempo = tempo;
                       
                    }
                }
            }
        }
    }

    public void removeUsuario(String usuario) {

        for (Usuario usu : ListaUsuarios) {
            int pos = ListaNomes.indexOf(usu.nome);
            Usuario usuarioDeleta = ListaUsuarios.get(pos);
            Set<Seguidor> seguis = usuarioDeleta.seguidores;

            Iterator<Seguidor> it = seguis.iterator();
            while (it.hasNext()) {
                Seguidor y = it.next();
                if (y.nome.equals(usuario)) {
                    it.remove();
                }
            }

            Usuario novoUser = new Usuario();
            for (Seguidor s : seguis) {
                novoUser.seguidores.add(s);
            }

            for (Usuario z : ListaUsuarios) {
                if (z.nome.equals(usuario)) {
                    z = novoUser;
                }
            }
        }
        int posicao = ListaNomes.indexOf(usuario);;
        ListaNomes.remove(ListaNomes.get(posicao));
        ListaUsuarios.remove(posicao);
    }

    public void removeRelacao(String usuario, String segue) {
        int pos = ListaNomes.indexOf(usuario);
        Usuario usuarioDeleta = ListaUsuarios.get(pos);
        Set<Seguidor> seguis = usuarioDeleta.seguidores;

        Iterator<Seguidor> it = seguis.iterator();
        while (it.hasNext()) {
            Seguidor y = it.next();
            if (y.nome.equals(segue)) {
                it.remove();
            }
        }

        Usuario novoUser = new Usuario();
        for (Seguidor s : seguis) {
            novoUser.seguidores.add(s);
        }

        for (Usuario z : ListaUsuarios) {
            if (z.nome.equals(usuario)) {
                z = novoUser;
            }
        }

    }

}
