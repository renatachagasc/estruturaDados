/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade;

/**
 *
 * @author 20171148060029
 */
public class Lista {

    private int tamMax;
    private int indice;
    private Pessoa[] lista;

    public Lista(int tamMax) {
        this.tamMax = tamMax;
        this.indice = 0;
        lista = new Pessoa[tamMax];
    }
    

    void inserir(Pessoa pessoa) {        
         if (indice == tamMax){
             System.out.println("Lista cheia");
         }else{
             lista[indice] = pessoa;
             indice ++;
             System.out.println("inserção realizada");
         }
    }

    void inserir(int posicao, Pessoa pessoa) {
    }

    int recuperar(int posicao) {
        return 0;
    }

    void remover(int posicao) {

    }

    Boolean contem(Pessoa pessoa) {
        return null;
    }

    int tamanho() {
        return 0;
    }

    void listarTodos() {
       for (Pessoa pessoa : lista)
            System.out.println(pessoa.toString());
    }
}
