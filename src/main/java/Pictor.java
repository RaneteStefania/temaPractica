public class Pictor extends Artist{

    private int nrPicturi;

    public Pictor(String inputNume, int inputNrPicturi){
        this.nrPicturi = inputNrPicturi;
        super.setNume(inputNume);
    }
    public Pictor(Artist inputArtist, int inputNrPicturi){
        this.nrPicturi = inputNrPicturi;
        this.setNume(inputArtist.getNume());
        this.setVarsta(inputArtist.getVarsta());
        this.setRamura(inputArtist.getRamura());

    }

    public int getNrPicturi() {
        return nrPicturi;
    }

    public void setNrPicturi(int nrPicturi) {
        this.nrPicturi = nrPicturi;
    }

    @Override
    public String toString() {
        return "Pictor{" + super.toString() +
                ", nrPicturi=" + nrPicturi +
                '}';
    }
}
