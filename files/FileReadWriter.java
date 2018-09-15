import java.io.*;

public class FileReadWriter {
    public static void main(String args[]) throws IOException {
        FileInputStream fsIn = null;
        FileOutputStream fsOut = null;

        try {
            fsIn = new FileInputStream("input.txt");
            fsOut = new FileOutputStream("output.txt");

            int c;
            while((c = fsIn.read()) != -1){
                fsOut.write(c);
            }
        }
        finally {
            if(fsIn != null) {
                fsIn.close();
            }

            if(fsOut != null) {
                fsOut.close();
            }
        }
    }
}