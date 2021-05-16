package Encryptor;
import java.util.Scanner;

public class Main extends BaseInfo {

    public Main(String cryp, String str) {
        super(cryp, str);
    }

    @Override
    public String inCrypt() {
        return "тут зашифровка";
    }

    @Override
    public String outCrypt() {
        return null;
    }

    public static void main(String[] args) {
        String in;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите символы для шифрования: ");
        in = scan.nextLine();
        System.out.println("Зашифрованные символы");
        inCrypt();


    }
}
