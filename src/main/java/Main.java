public class Main {
    public static void main(String[] args){

        //clasa Pictor extinde clasa Artist
        Pictor p1 = new Pictor("Andrei", 12);
        System.out.println("p1="+p1);


        Artist artist = new Artist("Ioana", 20, new Ramura());
        Pictor p2 = new Pictor(artist, 34);
        System.out.println("p2="+p2);
        //apelarea functiilor specifice clasei parinte (Artist)
        System.out.println("Varsta pictorului p2="+p2.getVarsta());


        // containment
        Artist a1 = new Artist("Popescu",45, new Ramura("Pictura","natura statica"));
        System.out.println("a1=" + a1);


        // aggregation
        Ramura r1 = new Ramura("Pictura", "Portret");
        Ramura r2 = new Ramura("Sculptura", "Cioplire");
        Artist a2 = new Artist("Ion",67);
        a2.setRamura(r1);
        System.out.println("a2= " +a2);
        Artist a3 = new Artist("Radu", 28, r2);
        System.out.println("a3= " +a3);

        //Modificare a2
        a2.setNume("Iordache Ion");
        a2.setRamura(r2);
        System.out.println("a2= " +a2);




    }

}
