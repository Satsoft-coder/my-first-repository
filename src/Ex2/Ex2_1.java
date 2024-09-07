package Ex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2_1 {
    public static void main(String[] args) {

        //В строке "Мой номер телефона +375-29-1234567. Мой ник в Телеграм @TheGodFather." при помощи регулярных
        //выражений найти номер телефона без кода (1234567), и ник в телеграм без значка “@” (TheGodFather)

        // find telephone
        String regex = "([+]+[\\d]{3}+[-]+[\\d]{2}+[-])+([\\d]{7})";
        final String string = "Мой номер телефона +375-29-1234567. Мой ник в Телеграм @TheGodFather. Его номер +375-29-7766179";

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
//            System.out.println("Full match: " + matcher.group(0));
//
//            for (int i = 1; i <= matcher.groupCount(); i++) {
//                System.out.println("Group " + i + ": " + matcher.group(i));
//            }
            System.out.println(matcher.group(2));
        }

        //find instagram
        regex = "([ ][@])+([a-zA-Z]*)";

        final Pattern pattern1 = Pattern.compile(regex);
        final Matcher matcher1 = pattern1.matcher(string);

        while (matcher1.find()) {
//            System.out.println("Full match: " + matcher1.group(0));
//
//            for (int i = 1; i <= matcher.groupCount(); i++) {
//                System.out.println("Group " + i + ": " + matcher1.group(i));
//            }
            System.out.println(matcher1.group(2));
        }
    }
}
