import Models.*;
import Service.BookImpl;
import Service.LibraryImpl;
import Service.ReaderImpl;
import Service.impl.BookService;
import Service.impl.LibraryService;
import Service.impl.ReaderService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataBase dataBase = new DataBase();
        LibraryImpl service =  new LibraryService(dataBase);
        ReaderImpl serviceR = new ReaderService(dataBase);
        BookImpl serviceB = new BookService(dataBase);







        List<Reader> readers = new ArrayList<>(Arrays.asList(
           new Reader(11,"Myrzaiym","mika@gmail.com","0500500514", Gender.FEMALE),
           new Reader(22,"Zhigit","zhigit@gmail.com","0500400400", Gender.MALE),
           new Reader(33,"Askar","ali@gmail.com","0500566566", Gender.MALE),
           new Reader(44,"Gulumkan","gulum@gmail.com","0500500500", Gender.FEMALE)
        ));
        DataBase.readers.addAll(readers);
        Reader reader = new Reader(55,"Aiturgan","aiturgan@gmail.com","0500799799",Gender.FEMALE);


        List<Book> books = new ArrayList<>(Arrays.asList(
                new Book(10,"London","Djek London",Genre.POVEST),
                new Book(20,"Belyi Kluck","Djek London",Genre.POVEST),
                new Book(30,"Magiy utra","Sarra",Genre.ROMAN),
                new Book(40,"Do vstrechi","Luiza Hei",Genre.ROMAN)
        ));


        List<Library> libraries = new ArrayList<>(Arrays.asList(
                new Library(1,"Sartov","prospect Manasa",books,readers),
                new Library(2,"Kasym","Mederova",books,readers),
                new Library(3,"Baylinov","Gorkovo",books,readers),
                new Library(4,"Ch.Aitmatov","Chui",books,readers)
        ));
        Library library = new Library(8,"Luiza Hei","Naryn",books,readers);
        DataBase.libraries.addAll(libraries);
        DataBase.books.addAll(books);




        while (true){
            System.out.println("""
                    1.Get all libraries
                    2.Save Library
                    3.Get Library By Id
                    4.Update
                    5.Delete
                    6.Save Reader
                    7.Get all Readers
                    8.Get reader by ID
                    9.Update Reader
                    10.Assain Reader to Library
                    11.Save Book
                    12.Get all Book
                    13.Get Book by Id
                    14.Delete Book
                    15.Clear Books by Library Id
                    """);
            switch (scanner.nextLine()){
                case"1"->{
                    System.out.println(service.getAllLibraries());
                }
                case"2"->{
                    service.saveLibrary(new Library(5,"Alykul","Kant",books,readers));
                }
                case"3"->{
                    System.out.println(service.getLibraryById(3));
                }
                case"4"->{
                    System.out.println(service.updateLibrary(3, library));
                }
                case"5"->{
                    System.out.println(service.deleteLibrary(1));
                }
                case"6"->{
                    serviceR.saveReader(new Reader(77,"Kanat","kk2gamil.com","0999900900",Gender.MALE));
                }
                case"7"->{
                    System.out.println(serviceR.getAllReaders());
                }
                case"8"->{
                    System.out.println(serviceR.getReaderById(22));
                }
                case"9"->{
                    serviceR.updateReader(44,reader);
                }
                case"10"->{
                    serviceR.assignReaderToLibrary(22,1);
                }
                case "11"->{
                  DataBase.books.add(serviceB.saveBook(1,new Book(70,"Manas","Eldik",Genre.EPOS)) );
                }
                case"12"->{
                    System.out.println(serviceB.getAllBooks(3));
                }
                case"13"->{
                    System.out.println("Books "+serviceB.getBookById(4, 7110));
                }
                case "14"->{
                    System.out.println(serviceB.deleteBook(1, 10));
                }
                case"15"->{
                    serviceB.clearBooksByLibraryId(3);
                }
            }
        }

    }
}