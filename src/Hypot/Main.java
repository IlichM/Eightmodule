package Hypot;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;
import java.io.File;

public class Main {
    public static void main(String[] args) throws IOException {
//        int a = 2;
//        int b = 3;
//        Math.abs(2);
//        System.out.println(Math.pow(a, b));
//        Date date = new Date();
//        System.out.println(date);
//        long time = System.currentTimeMillis();
//        System.out.println(time);
//        Date date1 = new Date();
//        System.out.println(date1.getTime());
//        Calendar calendar = Calendar.getInstance();
//        int era = calendar.get(Calendar.ERA);
//        int month = calendar.get(Calendar.MONTH);//Месяц Jan = 0, dec = 11
//        System.out.println(era + " " +   month);
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyy MMM dd HH:mm:ss");
//        System.out.println("Сейчас " + dateFormat.format(calendar.getTime()));
//        System.out.println(calendar.getTime());
        File file = new File("C:\\Test");
      String[] files = file.list();
        //for (String fileName: files) {
            System.out.println(files.length);
         // }
//        System.out.println(files);
//
//        File file = new File("C:\\Test\\Test.txt");
////        boolean isExists = file.exists();
////        System.out.println(isExists);
//        long length = file.length();
//        System.out.println(length);
    }
}

