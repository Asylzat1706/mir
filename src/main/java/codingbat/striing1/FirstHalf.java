package codingbat.striing1;

public class FirstHalf {
    public String firstHalf(String str) {
        if(str.length() % 2 != 0){
            return "";
        }
        int halfLength = str.length() / 2;
        return str.substring(0, halfLength);
    }
}
