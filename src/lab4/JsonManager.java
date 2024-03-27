package lab4;

import com.google.gson.Gson;
import modelLab4.University;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonManager {

    public void writeToJson(Object object, String filePath) {

        Gson gson = new Gson();

        String jsonFile = gson.toJson(object);

        try {
            FileWriter fileWriter = new FileWriter(filePath);

            fileWriter.write(jsonFile);
            fileWriter.close();

            System.out.println("Успешная запись в файл");

        } catch (IOException e) {

            System.out.println("Ошибка чтения из файла");

            e.printStackTrace();
        }
    }

    public Object readFromJson(String filePath) {

        Gson gson = new Gson();

        try {
            FileReader fileReader = new FileReader(filePath);

            return gson.fromJson(fileReader, University.class);
        } catch (FileNotFoundException e) {

            System.out.println("Файл не найден: " + filePath);

            e.printStackTrace();
        } catch (Exception e) {

            System.out.println("Ошибка чтения JSON из файла: " + filePath);

            e.printStackTrace();
        }
        return null;
    }
}

