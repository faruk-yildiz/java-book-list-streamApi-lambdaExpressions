import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Book book1=new Book("Book1",100,"Author1");
        Book book2=new Book("Book2",200,"Author2");
        Book book3=new Book("Book3",300,"Author3");
        Book book4=new Book("Book4",400,"Author4");
        Book book5=new Book("Book5",500,"Author5");
        Book book6=new Book("Book6",600,"Author6");
        Book book7=new Book("Book7",700,"Author7");
        Book book8=new Book("Book8",800,"Author8");
        Book book9=new Book("Book9",900,"Author9");
        Book book10=new Book("Book10",1000,"Author10");

        Map<String,String> bookAndAuthor=new HashMap<>();
        ArrayList<Book> books=new ArrayList<>();
        ArrayList<Book> newList=new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
        books.add(book9);
        books.add(book10);

        books.stream().forEach(book -> bookAndAuthor.put(book.getName(),book.getAuthor()) );
        books.stream().filter(book -> book.getPage()>100).forEach(book -> newList.add(book));
    }
}
