package Ex2_2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchReg implements Searchable{

    @Override
    public int sum (String text,String searchWord){
        int sumText=0;

        final String regex = "[ |\"|-]+"+searchWord.toUpperCase()+"+[ |\\.|,|!|\\?|:|;|\\n|-|\"]";
       // final String regex = "[ ]+"+searchWord.toUpperCase();
        final String string = text.toUpperCase();

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            sumText++;
        }

        return sumText;
    }
}
