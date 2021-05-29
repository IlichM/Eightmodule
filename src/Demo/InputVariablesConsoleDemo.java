package Demo;
import java.util.Scanner;

public class InputVariablesConsoleDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age, now = 2021;
        String name;
        double height, mass;
        System.out.print("Ваше имя: ");
        name = input.nextLine();
        System.out.print("Ваш возраст: ");
        age = input.nextInt();
        System.out.print("Ваш рост (в метрах): ");
        height = input.nextDouble();
        System.out.print("Масса тела (в киллограмма): ");
        mass = input.nextDouble();
        double bmi = mass/height/height;
        System.out.println("Здравствуйте, "+name+"!");
        System.out.println("Вы родились в "+(now-age)+" году.");
        System.out.printf("Ваш индекс массы тела: %5.2f",bmi);
    }
}
