public class Ramura {
    private String nume;
    private String Gen;

    public Ramura() {

    }

    public Ramura(String inputNume, String inputGen){
        this.nume = inputNume;
        this.Gen = inputGen;
    }


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getGen() {
        return Gen;
    }

    public void setGen(String gen) {
        Gen = gen;
    }

    @Override
    public String toString() {
        return "Ramura{" +
                "nume='" + nume + '\'' +
                ", Gen='" + Gen + '\'' +
                '}';
    }
}
