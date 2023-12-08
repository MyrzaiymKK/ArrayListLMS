package Service;

import Models.Library;

import java.util.List;

public interface LibraryImpl {
    void saveLibrary(Library libraries);

    List<Library>getAllLibraries();

    List<Library> getLibraryById(int id);

    String updateLibrary(int id, Library library);

    String deleteLibrary(int id);
}
