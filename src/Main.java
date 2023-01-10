public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello world!");

        Book book1=new Book();

        System.out.println(book1.showauthorAndTitle());


        //creaza un obiect nou din clasa oop

        Oop object1= new Oop();
        Oop object2= new Oop();
        System.out.println(object1.x);
        object2.x=10;

        System.out.println(object2.x);


        Car bmw =new Car();
        Car volvo= new Car();
        volvo.culoare="albastru";
        volvo.anFabricatie=2020;
        System.out.println(bmw.culoare+" "+ bmw.anFabricatie);
        System.out.println(volvo.culoare+" "+ volvo.anFabricatie);


        Persoana person1= new Persoana();
        Persoana person2=new Persoana("Maria","Ionescu");
        System.out.println("Nume: "+person2.nume+" "+person2.prenume);
        System.out.println("Age:"+ person2.age);
        System.out.println("Gen: "+person2.gen);


        Persoana person3= new Persoana("Cristina","Barnutiu",18,"Feminin");
        System.out.println("Nume: "+person3.nume+" "+person3.prenume);
        System.out.println("Age:"+ person3.age);
        System.out.println("Gen: "+person3.gen);

        //arata adresa lui person3
        System.out.println(person3);

        System.out.println(person3.gen);


        Film film1 = new Film();
        film1.setTitlu("Avatar 2");
        film1.getTitlu();
        film1.rating = 7.9;
        film1.potrivitPtCopii = false;
        //Film.unText
        film1.afiseazaDacaEPotrivitPtCopii();
        System.out.println(film1.anProductie);

        Film film2=new Film("Motanul incaltat 2",2021, true);
        System.out.println(film2.rating);

        film2.afiseazaDacaEPotrivitPtCopii();
        film2.rating=8.0;
        System.out.println(film2.afiseazaRaiting());
        System.out.println(film1.afiseazaRaiting());
        System.out.println(Film.afiseazaUnText());


    }

public static void afiseaza2(){
    System.out.println("Afiseaza");
}


}