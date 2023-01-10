public class Persoana {
    String nume;
    String prenume;
    int age=33;
    String gen;
    Persoana(){
        gen="m";
        nume="Cormos";
        prenume="Adrian";
        age=33;
    }
    //this se refera la atributul din clasa curenta




    Persoana(String nume, String prenume) {

        this.nume = nume;
        this.prenume = prenume;
    }
        public Persoana(String nume, String prenume, int age, String gen) {
            this.nume = nume;
            this.prenume = prenume;
            this.age = age;
            this.gen = gen;



    }

}
