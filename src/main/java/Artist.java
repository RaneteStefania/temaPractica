public class Artist {

    private String nume;
    private int varsta;
    private Ramura ramura;

    public Artist(){

    }
    public Artist(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;

    }

    public Artist(String nume, int varsta, Ramura ramura) {
        this.nume = nume;
        this.varsta = varsta;
        this.ramura = ramura;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public Ramura getRamura() {
        return ramura;
    }

    public void setRamura(Ramura ramura) {
        this.ramura = ramura;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", ramura=" + ramura +
                '}';
    }
}
