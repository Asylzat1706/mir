package codingbat.string2;

public class DoublChar {
    public String doubleChar(String str) {
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            str2.append(str.charAt(i)).append(str.charAt(i));
        }  return str2.toString();
    }

}
