import java.io.BufferedWriter;
import java.io.FileWriter;

public class Filehandling4 {
    public static void main(String[] args) {
        try{
            FileWriter file=new FileWriter("output.txt",true);
            BufferedWriter b=new BufferedWriter(file);
            b.write("it creates a new a file");
            b.newLine();
            b.write("and write the contents in it");
            b.close();
        }
        catch(Exception e){
            System.out.println("error");
    }
    } 
}