/*create a library managemenet system which issues book to student
book should have information like
1.book name
2.book author
3.issued to
4.issued on
user should be able to add books,return issued books,issue books
assume that all the  users are registered with their names in the central database
 */

import java.util.ArrayList;

class Book{
    public String name,author,issuedto,issuedon;
}
class MyLibrary{
    public ArrayList<Book> books;
    public MyLibrary(ArrayList<Book> books){
        this.books=books;
    }
    public void addBook(Book book){
        System.out.println("the book has been added");
        this.books.add(book);
    }
    public void issuebook(Book book){
        System.out.println("the book has been issued");
        this.books.remove(book);
    }
    public void returnBook(Book b){
        System.out.println("this book has been returned");
        this.books.add(b);
    }

}
public class cwh_113ex7sol {
    public static void main(String[] args) {
        ArrayList<Book> bk=  new ArrayList<>();
        bk.add(new Book());
        MyLibrary l=new MyLibrary(bk);
       // l.addBook(new Book("hh"));

    }
}
