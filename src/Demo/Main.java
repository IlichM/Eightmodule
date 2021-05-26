package Demo;
import java.io.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) throws IOException {
        copyFileUsingStream("src/utf8.txt", "UTF-8", "src/win1251.txt", "Windows-1251" );

    }

    public static void copyFileUsingStream(String source, String sourceEnc, String dest, String descEnc) throws IOException {
        //создание входящей кодировки
        Charset sEnc = Charset.forName(sourceEnc);
        //создание выходящей кодировки
        Charset dEnc = Charset.forName(descEnc);

        Reader fis = new InputStreamReader(new FileInputStream(source), sEnc);
        Writer fos = new OutputStreamWriter(new FileOutputStream(dest), dEnc);
        char[] buffer = new char[1024];
        int length;
        while((length = fis.read(buffer)) > 0) {
            fos.write(buffer, 0, length);
        }
        fis.close();
        fos.close();
    }
}
