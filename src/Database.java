import java.util.ArrayList;

public class Database {
    static class Book{
        String bookName;
        String bookAuthor;
        String issuedTo;
        String issuedOn;
        static ArrayList<Book> db = new ArrayList<>();
        Book(String bookName, String bookAuthor, String issuedTo, String issuedOn){
            this.bookName = bookName;
            this.bookAuthor = bookAuthor;
            this.issuedTo = issuedTo;
            this.issuedOn = issuedOn;
        }

        public static void addBooks(String name, String Author){

            db.add(new Book(name,Author,"",""));
        }
 
    }
}
