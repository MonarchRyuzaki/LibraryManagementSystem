import java.util.ArrayList;

public class Database {
    static class Book{
        String bookName;
        String bookAuthor;
        String issuedTo;
        static ArrayList<Book> db = new ArrayList<>();
        Book(String bookName, String bookAuthor, String issuedTo){
            this.bookName = bookName;
            this.bookAuthor = bookAuthor;
            this.issuedTo = issuedTo;
        }



        public static void addBooks(String name, String Author){

            db.add(new Book(name,Author,""));
        }

        public static int search(String bookName){
            for (int i=0; i<db.size();i++){
                if (bookName.equals(db.get(i).bookName) && db.get(i).issuedTo.equals("")){
                    return i;
                } else if (bookName.equals(db.get(i).bookName) && !(db.get(i).issuedTo.equals(""))) {
                    return -1;
                }
            }
            return -2;
        }
        public static void issueBooks(String bookName, String Author, String myName){

            int val = search(bookName);
            if (val >= 0){
                db.remove(val);
                db.add(new Book(bookName, Author, myName));
                new IssueDone();
            }
            else if (val == -1){
               new IssuetoSomeone();
            } 
            else if (val == -2){
                new NotPresent();
            }
        }
 
    }
}
