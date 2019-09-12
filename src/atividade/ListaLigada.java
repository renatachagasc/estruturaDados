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
public class ListaLigada {

    private Celula primeira;
    private Celula ultima;

    public void adicionar(Pessoa elemento) {
        Celula celula = new Celula(elemento);
        if (primeira == null) {
            primeira = celula;
            ultima = celula;
        } else {
            ultima.setProximo(celula);
            ultima = celula;
        }
    }

    void adicionarInicio(Pessoa elemento) {
        Celula celula = new Celula(elemento);
        if (primeira == null) {
            primeira = celula;
            ultima = celula;
        } else {
            ultima.setProximo(primeira);
            primeira = celula;
        }
    }
}
