package Service.impl;

import Models.Book;
import Models.DataBase;
import Service.BookImpl;

import javax.xml.crypto.Data;
import java.util.List;

public class BookService implements BookImpl {
    public BookService(DataBase dataBase) {
    }

    @Override
    public Book saveBook(int libraryId, Book book) {
        for (int i = 0; i < DataBase.libraries.size(); i++) {
            if(libraryId == DataBase.libraries.get(i).getId()){
               DataBase.libraries.get(i).bookss.add(book);
                System.out.println("Successfully!");
            }
        }return book;
    }

    @Override
    public List<Book> getAllBooks(int libraryId) {
        for (int i = 0; i < DataBase.libraries.size(); i++) {
           if(libraryId == DataBase.libraries.get(i).getId()){
               return DataBase.books;
           }
        }
        System.out.println(DataBase.books);
        return null;
    }

    @Override
    public Book getBookById(int libraryId, int bookId) {
        for (int i = 0; i < DataBase.libraries.size(); i++) {
            if(libraryId == DataBase.libraries.get(i).getId()){
                for (int j = 0; j < DataBase.libraries.get(i).bookss.size(); j++) {
                    if(DataBase.libraries.get(i).bookss.get(i).getId() == bookId){
                        return DataBase.libraries.get(i).bookss.get(j);
                    }
                }
            }
        }
        return null;
    }

    @Override
    public String deleteBook(int libraryId, int bookId) {
        for (int i = 0; i < DataBase.libraries.size(); i++) {
            if(libraryId == DataBase.libraries.get(i).getId()){
                for (int j = 0; j < DataBase.libraries.get(i).bookss.size(); j++) {
                    if(DataBase.libraries.get(i).bookss.get(j).getId() == bookId){
                        DataBase.libraries.get(i).bookss.remove(j);
                        return "Successful deleted book";
                    }
                }
            }
        }
        return null;
    }

    @Override
    public void clearBooksByLibraryId(int libraryId) {
        for (int i = 0; i < DataBase.libraries.size(); i++) {
            if(libraryId == DataBase.libraries.get(i).getId()){
                DataBase.libraries.get(i).bookss.clear();
                System.out.println("Successfully!");
            }
        }
    }
}
