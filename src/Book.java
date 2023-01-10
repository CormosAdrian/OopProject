public class Book {
    String author = "Jules Vern";

    String title = "Ocolul pamantului in 80 de zile";

    double price = 50.00;

    public double getPrice() {
        return price;
    }


    public String showauthorAndTitle() {
        return ("Book" + title + " is written by " + author);
    }

        public static void showILoveBooks() {
            System.out.println("I love books");
        }


}

