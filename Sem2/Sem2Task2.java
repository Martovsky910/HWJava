import java.io.BufferedReader;
import java.io.FileReader;

public class Sem2Task2 {
    public static void main(String[] args) throws Exception {
        String [] arrayData =  ReadLine("Task2.txt");
        for(int i = 0; i < arrayData.length; i++) {
            System.out.println(PrintLine(arrayData[i]));
        }
        
    }
    public static StringBuilder PrintLine(String line) {
        String line2 = line.replaceAll("\"", "");
        StringBuilder res = new StringBuilder("");
        String [] arrayData = line2.split(",");
        String [] listName = {"Студент ", " получил ", " по предмету "};
        for (int i = 0; i < arrayData.length; i++) {
            String[] arrData = arrayData[i].split(":");
            res.append(listName[i]);
            res.append(arrData[1]);
            }
        return res;
    }
    public static String [] ReadLine(String file) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        int size = 0;
        while ((line = br.readLine()) != null) {
            size +=1;
            }
        br.close();
        String [] listData = new String [size];
       
        int i = 0;
        BufferedReader br2 = new BufferedReader(new FileReader(file));
        while ((line = br2.readLine()) != null) {
            listData[i] = line;
            i += 1;
            }
        br2.close();
        return listData;
    
    }   
}