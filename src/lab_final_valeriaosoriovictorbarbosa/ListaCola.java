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
public class ListaCola {

   Node frente;
    Node fin;

    public ListaCola() {
        frente = fin = null;
    }

    public void insertar(String elemento) {
        Node a;
        a = new Node(elemento);
        if (colaVacia()) {
            frente = a;
        } else {
            fin.link = a;
        }
        fin = a;
    }

    public void ShowList() {
        Node p = frente;
        while (p != null) {
            System.out.println("" + p.info);
            p = p.link;
        }
    }

    public void Eliminar(Node p, Node antp, ListaCola lc) {

        if (p.info.equals(lc.frente.info)) {
            antp = antp.link;
            lc.frente = lc.frente.link;
            p.link = null;
        } else {
            if (!p.info.equals(lc.frente.info) && !p.info.equals(lc.fin.info)) {
                antp.link = p.link;
                p.link = null;
            } else {
                if (p.link==null) {
                    fin=antp;
                    antp.link = null;
                }
            }
        }
    }

    public boolean colaVacia() {
        if (frente == null) {
            return true;
        } else {
            return false;
        }
    }
}
