public class Book extends Publication{
    private String author;
    private long isbn;

    Book(String author, long isbn,  String title, String language, double price) {
        super(title, language, price);
        this.author = author;
        this.isbn=isbn;
    }

    public void print(){
        super.print();
        System.out.println(
                "Author: " + this.author+ " "
                +"isbn: " + this.isbn
        );
    }

}
