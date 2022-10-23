public class Main {

    public static void main(String[] args) {
        int n = 100;
        String str = generateRandomString(n);
        System.out.println(str);

        System.out.println("          ↑");
        System.out.println("Print the 11th character of the string is -> " + str.charAt(10));

        System.out.println("\nCompare strings with the same value");
        String str2 = str;
        System.out.println(str2);
        System.out.println("str.equals(str2) -> " + str.equals(str2));
        System.out.println(str == str2);

        System.out.println("\nCompare the same string after a temporary modification in its value");
        str2 = str.substring(0, str.length() - 1);
        System.out.println(str2);
        str2 = str2 + (str.charAt(str.length() - 1));
        System.out.println(str2);
        System.out.println("\nThe value remains the same");
        System.out.println("str.equals(str2) -> " + str.equals(str2));
        System.out.println("but the reference should not be the same anymore");
        System.out.println("str == str2 -> " + (str == str2));

        System.out.println("\nCompare uppercase/lowercase strings");
        String str3 = str2.replace("g", "G");
        System.out.println("str3 -> " + str3);
        String str4 = str3.toUpperCase();
        System.out.println("str4 -> " + str4);
        System.out.println("str4.compareToIgnoreCase(str3) -> " + str4.compareToIgnoreCase(str3)); //0 means that they have the same value

        System.out.println("\nCompare strings with the same value but not the same reference");
        System.out.println("str4.toLowerCase().compareTo(str) -> " + str4.toLowerCase().compareTo(str)); //0 means that they have the same value
        System.out.println("str4.toLowerCase().equals(str) -> " + str4.toLowerCase().equals(str)); //they have the same value and the same reference
        System.out.println("str4.toLowerCase() == str) -> " + (str4.toLowerCase() == str)); //they have the same value, but not the same reference


        char[] ch = {'a', 'b', 'c', 'd'};
        String charStr = String.valueOf(ch);
        System.out.println(charStr);

        int myNum = 1000;
        String myNumStr = String.valueOf(myNum);
        System.out.println(myNumStr);

        String concatStr = charStr.concat("ef");
        System.out.println(concatStr);

        String spaceStr = "ghij    ";
        String conStr = spaceStr + charStr;
        System.out.println(conStr);

        String trimmedStr = spaceStr.trim() + charStr;
        System.out.println(trimmedStr);

        String indexStr = String.valueOf(trimmedStr.lastIndexOf('c'));
        System.out.println(indexStr);

        String myMessage = "my-Mes-s-age";
        String[] arrOfMyMsg = myMessage.split("-", 3);
        for (String msg : arrOfMyMsg) {
            System.out.print(msg);
        }

        System.out.println();
        System.out.println(myMessage.replace("-", "&"));
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

