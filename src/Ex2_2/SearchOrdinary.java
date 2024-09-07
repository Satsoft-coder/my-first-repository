package Ex2_2;

public class SearchOrdinary implements Searchable {

    @Override
    public int sum(String text,String searchWord) {
        int summa=0;
        int index=0;
        final String symbolEnd=" .,!?:;\n-\"";
        final String symbolBegin=" \"";

        String source;
        source=text.toUpperCase();

        while ((index=source.indexOf(searchWord.toUpperCase(),index))!=-1) {
            if (index == 0) {
                for (int i = 0; i < symbolEnd.length(); i++) {
                    if ((source.charAt(index + searchWord.length()) == symbolEnd.charAt(i))) {
                        summa++;
                        index++;
                        break;
                    }
                }
            }
            else {

                if (source.charAt(index - 1) == symbolBegin.charAt(0) || source.charAt(index - 1) == symbolBegin.charAt(1)) {
                    for (int i = 0; i < symbolEnd.length(); i++) {
                        if ((source.charAt(index + searchWord.length()) == symbolEnd.charAt(i))) {
                            summa++;
                            index++;
                            break;
                        }
                    }
                }
            }
        };

        return summa;
    }
}
