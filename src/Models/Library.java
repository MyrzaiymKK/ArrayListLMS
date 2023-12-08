package Models;

import java.util.ArrayList;
import java.util.List;

public class Library {

    int id;
    String name;
    String address;
    public List<Book> bookss = new ArrayList<>();
    public List<Reader>readerss= new ArrayList<>();

    public Library() {
    }

    public Library(int id, String name, String address, List<Book> bookss, List<Reader> readerss) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.bookss = bookss;
        this.readerss = readerss;
    }

    public Library(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Book> getBooks() {
        return bookss;
    }

    public void setBooks(List<Book> books) {
        this.bookss = books;
    }

    public List<Reader> getReaders() {
        return readerss;
    }

    public void setReaders(List<Reader> readers) {
        this.readerss = readers;
    }

    @Override
    public String toString() {
        return "  Library : " + "\n"+
                " id ->" + id + "\n"+
                " name ->" + name + "\n" +
                " address ->" + address + "\n" +
                " books ->" + bookss +"\n"+
                " readers ->" + readerss +"\n"
                ;
    }
}
