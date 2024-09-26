import java.io.File;

public class FileClass {

    public static void main(String[] args) {
        // Use absolute path with double backslashes or forward slashes
        File file = new File("SecretMessage.txt");
        
        if(file.exists()) {
            System.out.println("That file exists! ^^");
        } else {
            System.err.println("That file doesn't exist! :O!");
        }
    }
}
