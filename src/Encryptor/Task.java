package Encryptor;
import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        String str = "Well done";
        String str2;
        System.out.println("Строка для шифрования - " + str);
        str2 = str.replaceAll(str, "Llew enod");
        System.out.print("Зашифрованная строка - ");
        System.out.println(str2);
    }
}