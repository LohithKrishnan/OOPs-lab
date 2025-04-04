import java.io.File;
public class Filehandling1 {
  public static void main(String args[]) {
    final String fileName = "file3.txt";
    File objFile = new File(fileName);

    if (objFile.exists() == true) {
      if (objFile.delete()) {
        System.out.println(objFile.getName() + " deleted successfully.");
      } else {
        System.out.println("File deletion failed!!!");
      }
    } else {
      System.out.println("File does not exist!!!");
    }
  }
}