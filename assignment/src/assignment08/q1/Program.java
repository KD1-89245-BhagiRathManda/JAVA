package assignments.assignment08.q1;


import java.util.*;

class Book{
    private String isbn;
    private double price;
    private String authorName;
    private int quantity;

    public Book() {
    }

    public Book(String isbn, double price, String authorName, int quantity) {
        this.isbn = isbn;
        this.price = price;
        this.authorName = authorName;
        this.quantity = quantity;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("%-15s%-15.1f%-15s%-15d", isbn, price, authorName, quantity);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(!(obj instanceof Book))
            return false;
        Book other = (Book) obj;
        if(other.getIsbn().equals(this.getIsbn())){
            return true;
        }
        return false;
    }

}

class SortByIsbn implements Comparator<Book> {

    @Override
    public int compare(Book x, Book y) {
        return x.getIsbn().compareTo(y.getIsbn());
    }
}

class SortReverseByIsbn implements Comparator<Book> {

    @Override
    public int compare(Book x, Book y) {
        return y.getIsbn().compareTo(x.getIsbn());
    }
}

public class Program {
    private static List<Book> bookList = new ArrayList<Book>();
    private static Scanner sc = new Scanner(System.in);

    public static Book[] getBooks(){
        Book[] books = new Book[6];
        books[0] = new Book("ISBN 978102", 200.1, "John Smith", 5);
        books[1] = new Book("ISBN 978201", 150.0, "James Gosling", 7);
        books[2] = new Book("ISBN 978422", 180.9, "Gary Pooch", 1);
        books[3] = new Book("ISBN 976122", 253.1, "Steve Freeman", 8);
        books[4] = new Book("ISBN 998202", 129.3, "Alex Periera", 3);
        books[5] = new Book("ISBN 900902", 225.3, "Jon Jonas", 2);

        return books;
    }
    public static void addBooksToList(Book[] books){
        for(Book book : books){
            bookList.add(book);
        }
    }

    public static void acceptRecord(String[] isbnNo){
        System.out.println("Enter the ISBN");
        isbnNo[0] = sc.nextLine();
    }

    public static void printBooksInForwardOrder(List<Book> books, Comparator<Book> comparator){
//        bookList.forEach(book -> System.out.println(book.toString()));
//        ListIterator<Book> trav= bookList.listIterator();
//        while(trav.hasNext()){
//            Book book = trav.next();
//            System.out.println(book.toString());
//        }
        Collections.sort(books, comparator);
        for(Book book : books){
            System.out.println(book);
        }


    }
    public static void printBooksInForwardOrder(List<Book> books){
        ListIterator<Book> trav= bookList.listIterator();
        while(trav.hasNext()){
            Book book = trav.next();
            System.out.println(book.toString());
        }
    }

//    public static void printBooksInReverseOrder(List<Book> books, Comparator<Book> comparator){
//        ListIterator<Book> trav= bookList.listIterator(bookList.size());
//        while(trav.hasPrevious()){
//            Book book = trav.previous();
//            System.out.println(book.toString());
//        }
//        Collections.sort(books, comparator);
//        for(Book book : books){
//        System.out.println(book);
//
//    }
//}

    public static void printBooksInReverseOrder(List<Book> books){
        ListIterator<Book> trav= bookList.listIterator(bookList.size());
        while(trav.hasPrevious()){
            Book book = trav.previous();
            System.out.println(book.toString());
        }
    }
    public static boolean deleteBook(String isbn){
        Book book = new Book();
        book.setIsbn(isbn);
        if(bookList.contains(book)){
            bookList.remove(book);
            return true;
        }
        return false;
    }


    public static int menuList(){
        System.out.println("0. EXIT");
        System.out.println("1. Add new book in list");
        System.out.println("2. Display all books in forward order");
        System.out.println("3. Display all books in reverse order");
        System.out.println("4. Delete a book at given index.");
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;

    }
    public static void main(String[] args) {
        int choice;
        String[] isbnNo = new String[1];
        while((choice = menuList()) != 0){
            switch(choice){
                case 1:
                    bookList.clear();
                    Program.addBooksToList(getBooks());
                    break;
                case 2:
                    if(!bookList.isEmpty()){
                        Program.printBooksInForwardOrder(bookList, new SortByIsbn());
                    }else{
                        System.out.println("Books are empty");
                    }
                    break;
                case 3:
                    if(!bookList.isEmpty()){
                        Program.printBooksInForwardOrder(bookList, new SortReverseByIsbn());
                    }else{
                        System.out.println("Books are empty");
                    }
                    break;
                case 4:
                {
                    Program.acceptRecord(isbnNo);
                    boolean returnedValue = Program.deleteBook(isbnNo[0]);
                    System.out.println(returnedValue ? "Book deleted successfully" : "Book was not found");
                }
                    break;
            }
        }
    }
}
