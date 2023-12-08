package Service.impl;

import Models.DataBase;
import Models.Library;
import Service.LibraryImpl;

import java.util.ArrayList;
import java.util.List;

public class LibraryService implements LibraryImpl {
    public LibraryService(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    DataBase dataBase;
    @Override
    public void saveLibrary(Library libraries) {
        dataBase.libraries.add(libraries);
        System.out.println("Successfully saved!");
        System.out.println();
    }

    @Override
    public List<Library> getAllLibraries() {
        return dataBase.libraries;
    }

    @Override
    public List<Library> getLibraryById(int id) {
        List<Library> newArray = new ArrayList<>();
        for (Library library : dataBase.libraries) {
            if(library.getId() == id){
              newArray.add(library);
            }
        }
        return  newArray;
    }

    @Override
    public String updateLibrary(int id, Library library) {

        for (int i = 0; i < dataBase.libraries.size(); i++) {
            if(dataBase.libraries.get(i).getId() == id){
            Library foundLibrarie = dataBase.libraries.get(i);
            foundLibrarie.setName(library.getName());
            foundLibrarie.setAddress(library.getAddress());
            }
        }
        return "Successfully updated";
    }

    @Override
    public String deleteLibrary(int id) {
        for (int i = 0; i < dataBase.libraries.size(); i++) {
            if(dataBase.libraries.get(i).getId() == id){
                dataBase.libraries.remove(dataBase.libraries.get(i));
            }
        }
        return "Successfully deleted!";
    }
}
