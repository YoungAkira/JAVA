import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {

    public static void main(String[] args){

        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \nViolets are blue\nBooty Booty Booty Booty");
            writer.append("\n(a poem by me)");
            writer.close();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}