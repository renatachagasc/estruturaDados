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
public class TestaLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista pessoas = new Lista(2);
        Pessoa p1 = new Pessoa("joao", "21212", "joa@gmail.com");
        Pessoa p2 = new Pessoa("maria", "21212", "joa@gmail.com");
        Pessoa p3 = new Pessoa("luis", "21212", "joa@gmail.com");
        
        pessoas.inserir(p1);
        pessoas.inserir(p2);
        pessoas.inserir(p3);
        pessoas.listarTodos();
        
        System.out.println(pessoas.tamanho());
    }

}
