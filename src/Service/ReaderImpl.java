package Service;

import Models.Library;
import Models.Reader;

import java.util.List;

public interface ReaderImpl {
    void  saveReader(Reader reader);

    List<Reader> getAllReaders();

    List<Reader> getReaderById(int id);

    String updateReader(int id, Reader reader);

    void assignReaderToLibrary(int readerId,int libraryId);
}
