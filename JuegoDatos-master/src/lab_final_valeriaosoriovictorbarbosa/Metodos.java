package lab_final_valeriaosoriovictorbarbosa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Metodos {

    int contpuncoma = 0;

    public Metodos() {
    }

    public String VivirOMorir(JLabel r, JLabel r1, JButton b, JButton b1, JButton b3, String v, JLabel j, JLabel t) {
        if (r.getText().equals("Hasta aqui ha llegado tu camino")) {
            v = r.getText();
            b.setVisible(false);
            b1.setVisible(false);
            j.setVisible(false);
            esconder(b3);
            t.setVisible(true);
            b3.setVisible(true);
            r.setText("");
        }
        if (r1.getText().equals("Felicidades Afortunado")) {
            v = r1.getText();
            j.setVisible(false);
            b.setVisible(false);
            b1.setVisible(false);
            t.setVisible(true);
            b3.setVisible(true);
            esconder(b3);
            r1.setText("");
        }
        return v;
    }

    void esconder(JButton j) {
        j.setContentAreaFilled(false);
        j.setFocusPainted(false);
        j.setBorderPainted(false);
    }

    public String concatenar(String nombre) throws IOException {
        String temp = this.LeerArchivoV1(nombre);
        if ("null".equals(temp)) {
            temp = "";
        } else {
            temp = this.LeerArchivoV1(nombre);
        }
        return temp;
    }

    public void EnviarDatos(int x) throws IOException {
        Historia in = new Historia();
        if (x == 1) {
        }

    }

    public String LeerArchivoV1(String Nombre) throws IOException {
        File F = new File(Nombre);
        FileReader fw = new FileReader(F);
        BufferedReader bw = new BufferedReader(fw);
        String L = "";
        String x = "";
        while (true) {
            x = bw.readLine();
            if (x != null) {
                L = L + x + "\r\n";

            } else {
                break;
            }
        }
        bw.close();
        fw.close();
        return L;
    }

    public String LeerArchivo(String Nombre) throws IOException {
        int sw = 0, contadorlocal = 0;
        File F = new File(Nombre);
        FileReader fw = new FileReader(F);
        BufferedReader bw = new BufferedReader(fw);
        String L = "";
        String x;
        while (true) {
            x = bw.readLine();
            if (contpuncoma == contadorlocal) {
                if (x != null) {
                    L = L + x;
                }
            }
            for (int i = 0; i < x.length(); i++) {
                if (";".equals(x.substring(i, i + 1))) {
                    contadorlocal = contadorlocal + 1;
                }
            }
            if (contpuncoma < contadorlocal) {
                contpuncoma = contpuncoma + 1;
                break;
            }
        }
        bw.close();
        fw.close();
        return L;
    }

    public String LlenarLista(String info) {
        String ya = "";
        for (int i = 0; i < info.length(); i++) {
            if (info.substring(i, i + 1).equals(":")) {
                return ya;
            } else {
                ya = ya + info.substring(i, i + 1);
            }

        }
        return ya;

    }

    public String Desco(String x, int y) {//Desco se va a encargar que dependiendo de la poscion y, extraer un campo especifico
        int cont = 0;
        int j = 0, i = 0;
        String ty = "";
        while (j == 0) {

            if (x.substring(i, i + 1).equals(";")) {
                cont = cont + 1;
                if (cont == y) {
                    j = 1;
                } else {
                    ty = "";
                }
            } else {
                ty = ty + x.substring(i, i + 1);
            }
            i = i + 1;
        }
        return ty;
    }

    public String CampoEspecifico(String r, int t) {
        int contador = 0;
        String zota = "", z;
        for (int i = 0; i < r.length(); i++) {
            z = r.substring(i, i + 1);
            if (":".equals(z)) {
                contador++;
                if (contador == t) {
                    return zota;
                }
                zota = "";
                z = "";
            }
            zota = zota + z;
        }
        return zota;
    }

    public void Generador_de_Combobox(String x, JComboBox y) throws FileNotFoundException, IOException {

        File f = new File(x);
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        while (br.ready()) {
            String g = br.readLine();
            Metodos p = new Metodos();
            String h = p.Desco(g, 1);;
            y.addItem(h);

        }

    }

    public void Sobreescribir(ListaCola lc, String archivo) throws IOException {
        File f = new File(archivo);
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        Node p = lc.frente;
        while (p != null) {
            pw.print(p.info+"\r\n");
            p=p.link;
        }
        pw.close();
        bw.close();
        fw.close();

    }

}
