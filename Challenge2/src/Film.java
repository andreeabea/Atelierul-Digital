public class Film {

    private Integer anAparitie;
    private String nume;
    private Actor[] actori;

    public Film(Integer an, String nume, Actor[] actori)
    {
        anAparitie=an;
        this.nume=nume;
        this.actori=actori;
    }

    public Integer getAnAparitie() {
        return anAparitie;
    }

    public void setAnAparitie(Integer anAparitie) {
        this.anAparitie = anAparitie;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Actor[] getActori() {
        return actori;
    }

    public void setActori(Actor[] actori) {
        this.actori = actori;
    }
}