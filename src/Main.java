import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n = 100;
        String str = generateRandomString(n);
        System.out.println(str);
    }

    static String generateRandomString(int l) {
        StringBuilder s = new StringBuilder(l);

        int i;
        for (i = 1; i <= l; i++) {
            //generate random numbers from 97-122 (a-z ascii code)
            int rnd = (int) (Math.random() * (122 - 97) + 97);
            //convert numbers to ascii characters so to produce a clear letter string
            char ch = (char) rnd;
            s.append(ch);
        }
        return s.toString();
    }
}

