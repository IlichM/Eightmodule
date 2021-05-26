package Demo;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStreamEx {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("test.txt");
        fos.write("Hello FileOutputStream world".getBytes());
        fos.close();
        //узнаем кодировку getBytes()
       // System.out.println(System.getProperty("file.encoding"));


    }
}