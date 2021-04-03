package SortPackage;

import java.io.*;
import java.util.ArrayList;

public class ReadFile {

    public ArrayList<String> Read(){
        ArrayList res = new ArrayList();
        try {
            File file = new File("input.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                //System.out.println(line);
                // считываем остальные строки в цикле
                res.add(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }

}
