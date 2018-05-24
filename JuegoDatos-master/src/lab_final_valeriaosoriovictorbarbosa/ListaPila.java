/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_final_valeriaosoriovictorbarbosa;

/**
 *
 * @author Victor
 */
class ListaPila {

    private Node cima;

    public ListaPila() {
        cima = null;
    }

    public boolean pilaVacia() {

        if (cima == null) {
            return true;
        } else {
            return false;
        }

    }

    public void insertar(String elemento) {
        Node nuevo;
        nuevo = new Node(elemento);
        nuevo.link = cima;
        cima = nuevo;
    }
    
    public String quitar() {
        if (pilaVacia()) {
            return "";
        }

        String aux = cima.info;
        cima = cima.link;
        return aux;
    }

    public void limpiarPila() {
        Node t;
        while (!pilaVacia()) {
            t = cima;
            cima = cima.link;
            t.link = null;
        }
    }

}
