import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class index {
    public static void main(String[] args) {

        //Create a New File

       File my =new File("sk.txt");
       try {
        my.createNewFile();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

// How to Write in File

    try {
        FileWriter myfile = new FileWriter(my);
        myfile.write("Ho Gayi Practice");
        myfile.close();
    }  
    
    catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

       try {
        FileWriter ile = new FileWriter(my);
        ile.write("Java File Handling");
        ile.close();
    }  
    
    catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }


    //How to read file

    try {
        Scanner sc =new Scanner(my);
       while(sc.hasNextLine()){
        String read = sc.nextLine();
        System.out.println(read);
       
       } sc.close();
    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }


    // Delete a File

    // if(my.delete()){
    //     System.out.println("Delete Ho gya h :-"+ my.getName());

    // }else{
    //     System.out.println("Kuch to Dikkat h");
    // }




    // BufferedReader myfile =new BufferedReader("sk.txt");

    }
}
