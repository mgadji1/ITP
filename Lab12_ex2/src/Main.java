import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try(FileInputStream in = new FileInputStream("C:\\Users\\user\\IdeaProjects\\Lab12_ex2\\src\\input.txt");
            FileOutputStream out = new FileOutputStream("C:\\Users\\user\\IdeaProjects\\Lab12_ex2\\src\\output.txt"))
        {
            byte[] buffer = new byte[in.available()];
            in.read(buffer, 0, buffer.length);
            out.write(buffer, 0, buffer.length);
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}