package pl.sda.ksiegarnia;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JSONUtils {


    public void writeBookList(String filename, List<Book> books){
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(filename), books);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readBookList(String filename){
        File file = new File(filename);
        ObjectMapper mapper = new ObjectMapper();

        try {
            Book value[] = mapper.readValue(file, Book[].class);
            for (int x = 0; x< value.length; x++){
                System.out.println("Tytuł książki: " + value[x].getName());
                System.out.println("Autor: " + value[x].getAuthor().getName() + " " + value[x].getAuthor().getLastname());
                System.out.println("Kategoria: " + value[x].getCathegory().getName());
                System.out.println("-------------------------------------");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
