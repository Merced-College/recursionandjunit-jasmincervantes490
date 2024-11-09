//Jasmin Cervantes
//Date: 11.08.2024
//Recursion and JUnit Assignment
//Used AI to help me create the recursive methods and to understand them line per line.

public class Main {
    //Method #1: counts how many times 8 is found
    public static int count8(int n) { 
        if (n == 0) {
            return 0;
        }

        //last digit n % 10, rest of numbers n / 10
        if (n % 10 == 8) {
            //if another 8 is found before the last digit, it counts double
            if ((n / 10) % 10 == 8) {
                return 2 + count8(n / 10);
            } else {
                return 1 + count8(n / 10);
            }
        }

        return count8(n / 10);
    }

    //Method #2: count the number of times "hi" appears in a string
    public static int countHi(String str) {
        if (str.length() < 2) { //sets the base case at string length of 2 characters
            return 0;
        }

        //if first 2 characters equals "hi" then it counts 1 and calls itself again to check the rest of the string
        if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi(str.substring(1));
        } else { //if the first 2 characters do not equal "hi" checks the rest of string
            return countHi(str.substring(1));
        }
    }

    //Method #3: counts number of times "hi" appears as long as it does not have 'x' behind it
    public static int countHi2(String str) {
        if (str.length() < 2) { //sets base case at 2 again
            return 0;
        }

        if (str.startsWith("hi")) { //if string starts with "hi", then it counts it and checks the rest of string
            return 1 + countHi2(str.substring(2));
        }

        if (str.length() > 2 && str.charAt(0) == 'x' && str.substring(1, 3).equals("hi")) {
            return countHi2(str.substring(3));
        } // ^^if it starts with 'x' and precedes with "hi", it does not count and moves to the rest of the string

        return countHi2(str.substring(1)); //neither is true then it moves to index 1 to read the rest of string
    }

    //Method #4: counts the number of times the sub appears in the string
    public static int strCount(String str, String sub) {
        if (str.length() < sub.length()) { 
            return 0;
        }

        //if string start with sub, it counts it and calls itself to check the rest of the string from that point on
        if (str.substring(0, sub.length()).equals(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        }

        //if it does not start with sub, then it checks the rest of the string starting from index 1
        return strCount(str.substring(1), sub);
    }

    //Method #5: cleans the string and removes any repeated characters in the string
    public static  String stringClean(String str) {
        if (str.length() <= 1) { // if the string length is 0 or 1 then it returns itself because there cannot be any repeated characters
            return str;
        }

        if (str.charAt(0) == str.charAt(1)) { //if character at indexes 0 and 1 are equal to each other it removes one of the repeated characters
            return stringClean(str.substring(1)); // and moves to check the rest of the string starting at index 1
        }

        //if the first character is not equal to the next, then it preserves it and searches the rest of the string
        return str.charAt(0) + stringClean(str.substring(1)); 
    }
}