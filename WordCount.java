import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
public class WordCount {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\soham\\OneDrive\\Documents\\SY_sem2\\OOP\\file.txt");

        try {
            FileWriter w = new FileWriter("C:\\Users\\soham\\OneDrive\\Documents\\SY_sem2\\OOP\\file.txt");
            w.append("Yeah Whatever");
            w.close();
        }
        catch (IOException e){
            System.out.println("Error occured");
        }

        int count = 0;
        try{
            Scanner scan = new Scanner(file);
            while (scan.hasNext()){
                scan.next();
                count++;
            }
        }
        catch (FileNotFoundException ae){
            System.out.println("not found");
        }

        System.out.println("The number of words are: " + count);

    }


}
