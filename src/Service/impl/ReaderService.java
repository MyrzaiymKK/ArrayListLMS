package Service.impl;

import Models.DataBase;
import Models.Library;
import Models.Reader;
import Service.ReaderImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderService implements ReaderImpl {
    public ReaderService(DataBase dataBase) {
    }

    @Override
    public void  saveReader(Reader reader) {
       DataBase.readers.add(reader);
        System.out.println("Successfully saved!");
        System.out.println();

    }

    @Override
    public List<Reader> getAllReaders() {
        return DataBase.readers;
    }

    @Override
    public List<Reader> getReaderById(int id) {
        List<Reader> newArray = new ArrayList<>();
        for (Reader reader : DataBase.readers) {
            if(reader.getId() == id){
                newArray.add(reader);
            }
        }
        return newArray;
    }

    @Override
    public String updateReader(int id, Reader reader) {
        for (int i = 0; i < DataBase.readers.size(); i++) {
            if(DataBase.readers.get(i).getId() == id){
                Reader found = DataBase.readers.get(i);
                found.setId(reader.getId());
                found.setFullName(reader.getFullName());
                found.setEmail(reader.getEmail());
                found.setPhoneNumber(reader.getPhoneNumber());
                found.setGender(reader.getGender());
            }
        }
        return "Successfully";
    }

    @Override
    public void assignReaderToLibrary(int readerId, int libraryId) {
        for (int i = 0; i < DataBase.libraries.size(); i++) {
            if(libraryId == DataBase.libraries.get(i).getId()){
                for (int j = 0; j < DataBase.readers.size(); j++) {
                    if(readerId == DataBase.readers.get(i).getId()){
                        DataBase.libraries.get(i).getReaders().add(DataBase.readers.get(j));
                        System.out.println("Successfully!");
                    }
                }
            }
        }
    }
}
