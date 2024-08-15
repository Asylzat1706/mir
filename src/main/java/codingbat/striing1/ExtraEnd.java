package codingbat.striing1;

public class ExtraEnd {
    public String extraEnd(String str) {
        String k = str.substring(str.length() - 2);
        return k + k + k;
    }
    }
