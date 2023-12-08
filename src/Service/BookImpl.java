package Service;

import Models.Book;

import java.util.List;

public interface BookImpl {
    Book saveBook(int libraryId,Book book);

    List<Book> getAllBooks(int libraryId);

    Book getBookById(int libraryId, int bookId);

    String deleteBook(int libraryId,int bookId);

    void clearBooksByLibraryId(int libraryId);
}
