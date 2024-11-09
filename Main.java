//Jasmin Cervantes
//Date: 11.08.2024
//Recursion and JUnit Assignment

public class Main {
    //Problem #1
    public static int count8(int n) {
        if (n == 0) {
            return 0;
        }

        //last digit n % 10, rest of numbers n / 10
        if (n % 10 == 8) {
            if ((n / 10) % 10 == 8) {
                return 2 + count8(n / 10);
            } else {
                return 1 + count8(n / 10);
            }
        }

        return count8(n / 10);
    }

    //Problem #2
    public static int countHi(String str) {
        if (str.length() < 2) {
            return 0;
        }

        if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi(str.substring(1));
        } else {
            return countHi(str.substring(1));
        }
    }

    //Problem #3
    public static int countHi2(String str) {
        if (str.length() < 2) {
            return 0;
        }

        if (str.startsWith("hi")) {
            return 1 + countHi2(str.substring(2));
        }

        if (str.length() > 2 && str.charAt(0) == 'x' && str.substring(1, 3).equals("hi")) {
            return countHi2(str.substring(3));
        }

        return countHi2(str.substring(1));
    }

    
}