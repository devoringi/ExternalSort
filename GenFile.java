package SortPackage;
import java.io.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GenFile {
    public void GenFile() {
        File file = new File("input.txt");
        int a = 0; // Начальное значение диапазона - "от"
        int b = 10000000; // Конечное значение диапазона - "до"
        int random_number = a + (int) (Math.random() * b); // Генерация 2-го числа
        try(FileWriter writer = new FileWriter("input.txt", true))
        {
            // запись всей строки
            for (int i = 0; i < random_number; i++) {
                String s = RandomString();
                writer.write(s);
                writer.flush();
                writer.append('\n');
                writer.flush();
            }

        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }


    }
    public String RandomString(){
        int a = 1; // Начальное значение диапазона - "от"
        int b = 100; // Конечное значение диапазона - "до"
        int n  = a + (int) (Math.random() * b);
        // выбрал символ случайный из этой строки

        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";


        // создаем StringBuffer размером AlphaNumericString
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            // генерируем случайное число между
            // 0 переменной длины AlphaNumericString
            int index = (int)(AlphaNumericString.length() * Math.random());
            // добавляем символ один за другим в конец sb
            sb.append(AlphaNumericString.charAt(index));
        }
        return sb.toString();
    }
}
