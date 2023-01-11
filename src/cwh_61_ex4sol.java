class Library{
   String[]books;
   int no_of_books=0;
    Library(){
        this.books = new String[100];
        this.no_of_books=0;
    }
    void addbook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+ " has been added");

    }

    void showavailablebooks() {
        System.out.println("available books are");

        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("*" + book);

        }
    }
    void issuebook(String book){
        for(int i=0;i<this.books.length;i++){
            if(this.books[i]==(book)){


                System.out.println("the book has been issued");

                {
                    this.books[i]=null;{
                    continue;
                }
    }}}}
public class cwh_61_ex4sol {
    public static void main(String[] args) {
        Library centrallibrary=new Library();
        centrallibrary.addbook("signals and systems");
        centrallibrary.addbook("network analysis");
        centrallibrary.addbook("field theory");
        centrallibrary.showavailablebooks();
        centrallibrary.issuebook("field theory");


    }
}}
