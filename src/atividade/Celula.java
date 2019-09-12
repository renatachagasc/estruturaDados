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
public class Celula {
    private Celula proximo;
    private Object elemento;

    public Celula(Object elemento) {
        this.elemento = elemento;
    }

    public Celula(Celula proxima, Object elemento) {
        this.proximo = proximo;
        this.elemento = elemento;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    void setProximo(Celula celula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  
}
