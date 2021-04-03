package SortPackage;

import java.io.*;
import java.util.*;


public class main {
    public static void main(String[] args) {
        System.out.println("Sort started");
        // создаём класс-сортировщик
        GenFile generator = new GenFile();
        generator.GenFile();





        FileSort<String> sort = new FileSort<String>(

                new Iterator<String>() {
                    private int i = 0;
                    private Random rnd = new Random();
                    ReadFile r = new ReadFile();
                    ArrayList str = r.Read();


                    public boolean hasNext() {
                        return i != str.size()-1;
                    }
                    public String next() {
                        i++;
                        return (String) str.get(i);
                    }
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                });
        int i = 0;
        // выводим отсортированный результат
        try(FileWriter writer = new FileWriter("output.txt", true))
        {
            // запись всей строки
            for (String res : sort) {
                writer.write(res);
                writer.flush();
                writer.append('\n');
                writer.flush();
            }

        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
