import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        File myFile = new File("hello.txt");
       
        try {
            myFile.createNewFile();
        } catch (IOException e) {

            e.printStackTrace();
        }

        try {
            FileWriter file = new FileWriter("hello.txt");
            file.write("Kaise Ho app Log");
            file.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

     try {
     
        Scanner sc = new Scanner(myFile);
        while(sc.hasNextLine()){
         String   line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }


    if(myFile.delete()){
        System.out.println("delete ho gaya"+ myFile.getName());
    }
    else{
        System.out.println("koi to error h");
    }

    }

}