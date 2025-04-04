import java.io.File;

public class Filehandling2 {
  public static void main(String[] args) {
    File file = new File("filee.txt");
    
    if (file.exists()) {
      System.out.println("File name: " + file.getName());
      System.out.println("Path: " + file.getAbsolutePath());
      System.out.println("Writable: " + file.canWrite());
      System.out.println("Readable: " + file.canRead());
      System.out.println("File size in bytes: " + file.length());
    } else {
      System.out.println("File not found.");
    }
  }
}
