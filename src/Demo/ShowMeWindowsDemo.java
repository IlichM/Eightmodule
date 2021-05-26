package Demo;
import javax.swing.JOptionPane;

public class ShowMeWindowsDemo {
    public static void main(String[] args) {
        String title;
        String text;

        title = JOptionPane.showInputDialog(null,"Имя окна:","Название",JOptionPane.WARNING_MESSAGE);
        text = JOptionPane.showInputDialog(null, "Текст сообщения:", "Содержание", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,text,title,JOptionPane.INFORMATION_MESSAGE);
    }
}
