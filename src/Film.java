public class Film {

   private String titlu;
    int anProductie;
    double rating;
    boolean potrivitPtCopii;

    public static String unText="Toate filmele sunt frumoase";

    public static String getUnText() {
        return unText;
    }

    public static void setUnText(String unText) {
        Film.unText = unText;
    }

    public String getTitlu() {
        return titlu;

    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public Film() {
        this.titlu = "unknown";
        this.anProductie = 2000;
        this.rating = 10;
        this.potrivitPtCopii = false;
        System.out.println("Primul constructor e apelat");
    }


    public Film(String titlu, int anProductie, double rating, boolean potrivitPtCopii) {
        this.titlu = titlu;
        this.anProductie = anProductie;
        this.rating = rating;
        this.potrivitPtCopii = potrivitPtCopii;
    }

    public void afiseazaDacaEPotrivitPtCopii() {
        if (this.potrivitPtCopii) {
            System.out.println(this.titlu+ " Filmul e potrivit pentru copii");
        } else {
            System.out.println(this.titlu+" Filmul nu e potrivit pentru copii");
        }



    }
    public String afiseazaRaiting() {
        return (this.titlu + " are raiting " + this.rating);
    }

    public Film(String titlu, int anAparitie, boolean potrivitPtCopii) {
        this.titlu = titlu;
        this.anProductie = anProductie;
        this.potrivitPtCopii = potrivitPtCopii;
    }

        public static String afiseazaUnText(){
            return(unText);
        }
    }
