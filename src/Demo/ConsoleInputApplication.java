package Demo;
import java.util.Scanner;

public class ConsoleInputApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String day, month;
        System.out.print("Какой сегодня день? ");
        day = input.nextLine();
        System.out.print("Какой месяц? ");
        month = input.nextLine();

        String text;
        text = "Сегодня " + day + ", месяц " + month;
        System.out.println(text);

    }
}
