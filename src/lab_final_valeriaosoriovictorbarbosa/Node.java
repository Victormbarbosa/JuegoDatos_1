package lab_final_valeriaosoriovictorbarbosa;

public class Node {

    Node link;
    Subnode subroot;
    String info;

    public Node(Node link, Subnode subroot, String info) {
        this.link = link;
        this.subroot = subroot;
        this.info = info;
    }

    public Node(String info) {//Uso para listas simples
        this.link = null;
        this.info = info;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }

    public Subnode getSubroot() {
        return subroot;
    }

    public void setSubroot(Subnode subroot) {
        this.subroot = subroot;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
