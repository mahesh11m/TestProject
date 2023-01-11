import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class cwh_111_filehandle {
    public static void main(String[] args) {
        //code to create a file

     /*   File myfile =new File("cwh_111_filehandle.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            System.out.println("unable to create this file");
            throw new RuntimeException(e);
        }
        // code to write to a file*/

     /*   try {
            FileWriter fileWriter=new FileWriter("cwh_111_filehandle");
            fileWriter.write("this is our first file in java course\n okay bye now");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
        // reading a file

      /*  File myfile=new File("this.txt");
        try {
            Scanner sc=new Scanner(myfile);
            while (sc.hasNextLine()){
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }*/

        //deleting a file

        File myfile=new File("cwh_111_filehandle");
        if(myfile.delete()){
            System.out.println("the file has deleted" + myfile.getName());
        }
        else{
            System.out.println("some error ocuuered while deleting file");
        }
    }
}
