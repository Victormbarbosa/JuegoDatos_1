
package lab_final_valeriaosoriovictorbarbosa;

public class Subnode {

    String info;
    Subnode link;

    public Subnode(String info, Subnode link) {
        this.info = info;
        this.link = link;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Subnode getLink() {
        return link;
    }

    public void setLink(Subnode link) {
        this.link = link;
    }

}
