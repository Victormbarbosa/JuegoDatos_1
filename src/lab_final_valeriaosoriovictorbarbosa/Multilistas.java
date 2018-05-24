/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_final_valeriaosoriovictorbarbosa;

import java.io.IOException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Multilistas {

    Node root = null;
    int stop = 0;
    public static int pop;

    public Multilistas() {

    }

    public void createList() throws IOException {
        int n = 0, contsubn = 0, numero = 0;//contador encargado de llevar la cuenta de los subnodos agregados
        int opc = 0;
        int sw = 0;
        String info;
        Node p = null;
        Metodos e = new Metodos();
        do {
            info = e.LeerArchivo("ho.txt");

            if (sw == 0) {
                opc = 1;
                sw = 1;
                n = n + 1;
            }
            if ("FIN;".equals(info)) {
                opc = 0;
            }
            switch (opc) {
                case 1:
                    if (root == null) {
                        root = new Node(null, null, info);
                        p = root;
                        break;
                    } else {
                        Node q = new Node(null, null, info);
                        p.link = q;
                        p = q;
                        break;
                    }

                case 2:
                    Node objetivo = BusquedaPorPosicion(n);
                    if (objetivo != null) {
                        Subnode z = new Subnode(info, null);
                        if (objetivo.getSubroot() == null) {
                            objetivo.setSubroot(z);
                        } else {
                            Subnode w = objetivo.getSubroot();
                            while (w.getLink() != null) {
                                w = w.getLink();
                            }
                            w.setLink(z);
                        }
                    } else {
                        System.out.println("No se encontro el nodo con esa informacion");
                    }
                    contsubn = contsubn + 1;
                    break;
            }

            if (sw == 1) {
                if (opc == 1) {
                    contsubn = 0;
                    String des = e.LlenarLista(info);
                    numero = Integer.parseInt(des);
                    opc = 2;
                }
                if (contsubn == numero) {
                    sw = 0;
                }
            }

        } while (opc != 0);
    }

    public Node BusquedaPorPosicion(int info) {
        Node p = root;
        int contador = 1;
        while (p != null) {
            if (contador == info) {
                return p;
            }
            contador++;
            p = p.getLink();
        }
        return null;
    }

    public void SubNodeCorrect(int info, JLabel r, JLabel r1, JLabel r2) {
        String ya = "";
        int contador, sw = 0;
        Node x = BusquedaPorPosicion(info);
        Subnode z = x.subroot;
        Inicio in = new Inicio();
        if (info == 1) {
            enviartexto(info, r, r1, r2, z);
        } else {
            while (z != null && sw == 0) {
                contador = 0;
                ya = "";
                for (int i = 0; i < z.info.length(); i++) {
                    if (z.info.substring(i, i + 1).equals(":")) {
                        contador++;
                        if (in.orden.equals(ya) && contador == 1) {
                            enviartexto(info, r, r1, r2, z);
                            i = z.info.length();
                            sw = 1;
                        }
                    } else {
                        ya = ya + z.info.substring(i, i + 1);
                    }
                }
                z = z.link;
            }
        }
    }

    public void enviartexto(int info, JLabel r, JLabel r1, JLabel r2, Subnode z) {
        String ya = "";
        int contador = 0;
        for (int i = 0; i < z.info.length(); i++) {
            if (z.info.substring(i, i + 1).equals(":")) {
                contador++;
                switch (contador) {
                    case 2:
                        TextoLetraPorLetra(ya, r);
                        break;

                    case 3:

                        r1.setText(ya);

                        break;
                    case 4:
                        r2.setText(ya);

                        break;
                }

                ya = "";
            } else {
                ya = ya + z.info.substring(i, i + 1);
            }

        }
    }

    public void TextoLetraPorLetra(String t, JLabel Impresor) {
        Timer time = new Timer();
        TimerTask tarea = new TimerTask() {

            int popmax = pop * 195, popmin = popmax - 195;
            int i = popmin, o = popmin + 1, k = 0;
            Boolean sw = false;
            String total = " ";

            public void run() {

                if (popmax > t.length() && i == popmin) {
                    popmax = t.length();
                }
                if (i >= t.length() + 1) {
                    total = total + "<html>";
                    JOptionPane.showMessageDialog(null, "Fin del texto.");
                    time.cancel();
                } else {
                    if (i == popmin) {
                        total = "<html><body><br/>";
                        if (i >= 1) {
                            k = -2;
                        }
                    }
                    if (i != popmax) {

                        total = total + t.substring(i + k, i + 1 + k);

                        if (o == 33 && sw == false) {
                            total = total + "";
                            total = total + "<br/>";
                            o = 0;
                            sw = true;
                        }
                        if (o == 32 && sw == true) {
                            total = total + "";
                            total = total + "<br/>";
                            o = 0;
                            sw = true;
                        }
                        Impresor.setText(total);
                        o++;

                    }
                    if (i == popmax) {
                        
                        time.cancel();

                    }
                    i++;
                }
            }

        };
        time.schedule(tarea, 0, 15);;

    }

    public void showList() {
        System.out.println("Lista");
        if (root != null) {
            Node p = root;
            while (p != null) {
                System.out.println(p.getInfo());
                if (p.getSubroot() != null) {
                    Subnode z = p.getSubroot();
                    while (z != null) {
                        System.out.println("-->" + z.getInfo());
                        z = z.getLink();
                    }
                }
                p = p.getLink();
            }
        }
    }

}
