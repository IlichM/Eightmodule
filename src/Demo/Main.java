package Demo;
import java.io.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

public class Main {
    public static void main(String[] args) {
        if (copyFileUsingStream("src/utf8.txt", "UTF-9", "src/win1251.txt", "Windows-1251")) {
            System.out.println("Перекодировка прошла успешно!");
        }

    }

    public static boolean copyFileUsingStream(String source, String sourceEnc, String dest, String destEnc) {

        //создание входящей кодировки
        //создание выходящей кодировки
        try (Reader fis = new InputStreamReader(new FileInputStream(source), Charset.forName(sourceEnc));
        Writer fos = new OutputStreamWriter(new FileOutputStream(dest), Charset.forName(destEnc))) {
            char[] buffer = new char[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                    fos.write(buffer, 0, length);
                }
        } catch (FileNotFoundException e) {
            System.out.println("Проблемма с файлами " + e.getMessage());
            return false;
        } catch (UnsupportedCharsetException e) {
            System.out.println("Проблемма с кодировкой файлов " + e.getMessage());
            return false;
        } catch(IOException e) {
            System.out.println("Проблемма при копировании " + e.getMessage());
            return false;
        }
        return true;
    }
}
