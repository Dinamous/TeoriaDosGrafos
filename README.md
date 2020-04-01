# Teoria dos Grafos

----
## MODELAGEM DE RELACIONAMENTOS ENTRE USUÁRIOS DE UMA REDE SOCIAL HIPOTÉTICA


   A estrutura matemática combinatória grafos é conhecida na literatura computacional pelo seu poder de
modelagem de diferentes tipos de cenários. Por exemplo, em uma rede social, os vértices de um dígrafo ponderado podem
representar os usuários dessa rede, e os arcos (arestas direcionadas), relações de seguidores entre tais usuários (o peso de
uma aresta, poderia ser um período de tempo associado entre dois usuários.  

  De modo a representar eficientemente as informações de um grafo, podem ser utilizadas várias estruturas
computacionais. Dentre elas, destacam-se a matriz de adjacências (ou matriz de pesos, quando o grafo for ponderado), a
lista de adjacências e a lista com adjacências em árvores AVL. Cada uma dessas estruturas possuem propriedades
singulares, por exemplo, quando o grafo representado por tais são densos ou esparsos.  

  Com base nessas informações, o presente trabalho consiste no desenvolvimento de um programa em Java que modela um conjunto de relacionamentos de uma rede social hipotética, por meio das três
estruturas representativas apresentadas no parágrafo anterior. Sumariamente, os vértices representam usuários que possuem *nome* e *idade* . A existência de um arco com peso z que parte de um vértice que representa um usuário x e incide em um outro vértice que representa um usuário y significa que x segue y e que y é seguido por x há um tempo z nessa rede social. Nesse sentido, o programa deverá fornecer recursos que realizem as ações das seguintes funções



----
## Funções Implementadas

<details>
  <summary>Click to expand!</summary>
  
  ## Heading
  1. A numbered
  2. list
     * With some
     * Sub bullets
</details>

<details>
  <summary>inicializaGrafos( )</summary>
  1. A numbered
  2. list
     * With some
     * Sub bullets
  1. Inicializa as três estruturas.  
    * Zera a matriz.  
    * Aloca espaço vazio na Lista e na Lista AVL.  
</details>

<details>
  <summary>inserirUsuario( )</summary>
  1. Libera espaço nas estruturas para a inserção.  
  2. Caso usuário já esteja inserido, retornar erro.  
</details>

<details>
  <summary>inserirRelacao( )</summary>
  1. Adiciona relação "é seguido de/ seguidor de".  
  2. Usuários devem estar previamente inseridos.  
  3. Caso relação já esteja inserido, oferecer opção de atualizar ao usuário.  
</details>

<details>
  <summary>listarSeguidores( )</summary>
  1. O utilizador deverá escolher um dos usuário previamente cadastrados e o sistema deve mostrar:  
    * Uma lista dos usuários que este segue.  
    * Uma lista dos usuários que seguem usuário.  
    * A estrutura AVL deve possuir a opção de ordenação (in-ordem, pre-ordem, pós-ordem).  
</details>

<details>
  <summary>listarSeguidoresVelhos( )</summary>
  1. Lista todos os usuários que são seguidos por usuários mais velhos.  
</details>

<details>
  <summary>atualizarRelacao( )</summary>
  1. Similar a insereRelacao( ) mas esta, usuários devem estar previamente cadastrados.  
  2. Caso a relação não exista, oferer a opção do utilizador fazê-la.  
</details>

<details>
  <summary>removerUsuário( )</summary>
  1. Remove um usuário previamente cadastrado, inclusive com suas relações.  
  2. Caso o usuário nãoo esteja cadastrado, retornar um erro.  
</details>

<details>
  <summary>removerRelacao( )</summary>
  1. Remove uma relação previamente cadastrada  
  2. Caso algum vértice da relação não esteja inserido, retornar erro.  
</details>

----
## Contribuições
* [Nayara Freire](https://github.com/NayFreire)
* Professor: Hugo Rezende
