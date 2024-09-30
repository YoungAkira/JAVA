public class FileReader_ {

    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("art.txt");
            int num = reader.read();

            while(num != -1) {
                System.out.print((char)num);
                num = reader.read();
            }
            reader.close();

        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}