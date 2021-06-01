package Part2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Part1.Book;
import Part1.Patron;

class LibraryApplication {

    public static LocalDate date;
    public List<Book>books=new ArrayList<>();
    public List<Patron> borrowers = new ArrayList<>();

    public LibraryApplication() {
    }

    public void addBook(Book book) {
        books.add(book);
    }
    public void addBorrower(Patron borrower) {
        borrowers.add(borrower);
    }

    public void loanBook(Book book , Patron patron) {
        List<Integer>ids=new ArrayList<>();


        Book borrowedBook = book;
        Patron borrower = patron;

        borrowedBook.setIdBorrowed(borrower.getId());

        for (Patron patron1 : borrowers) {
            if(patron1.equals(borrower)) {
                ids.add(borrowedBook.getCatallogId());
                borrower.setCatallogIds(ids);
            }else {
                borrowedBook.setIdBorrowed(borrower.getId());
                ids.add(borrowedBook.getCatallogId());
                borrower.setCatallogIds(ids);
                borrowers.add(borrower);
            }
        }

    }
    public void returnBook(Book book,Patron patron) {

        for (Book book2 : books) {
            if(book2.equals(book)) {
                borrowers.remove(patron);
            }
        }
    }
    public String showBorrowers() {
        String temp = borrowers.toString();

        return temp;
    }
    public String showBooks() {
        String temp1 = books.toString();

        return temp1;
    }
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<Integer>(4);
        arr.add(1);

        Patron patron = new Patron("Eron", "Prishtine", 1, arr);
        Patron patron1 = new Patron("Fisnik", "Prishtine", 2, arr);
        Patron patron2 = new Patron("Erjona", "Prishtine", 3, arr);
        Patron patron3 = new Patron("Akil", "Prishtine", 4, arr);

          Book book = new Book("le petit prince", "Antonie de Saint-Exupery", 0, 0, 0);
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 1, 0,0);
        Book book2 = new Book("Malsorja", "Nazmi Rrahmani", 2, 0, 0);
        Book book3 = new Book("Keshtjella", "Ismail Kadare", 3, 0, 0);

        LibraryApplication library = new LibraryApplication();

        library.addBorrower(patron);
        library.addBorrower(patron1);
        library.addBorrower(patron2);
        library.addBorrower(patron3);

        System.out.println("--BORROWERS--"  + "\n"+ library.showBorrowers()); //Paraqitja e Borrowers

        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("--BOOKS available--"  + "\n" + library.showBooks()); //Paraqitja e librave

        library.loanBook(book, patron);
        library.loanBook(book1, patron1);
        library.loanBook(book2, patron2);
        library.loanBook(book3, patron3);

        library.showBorrowers();
        System.out.println(library.showBorrowers());


    }

}

