//Jasmin Cervantes
//Date: 11.08.2024
//Recursion and JUnit Assignment

public class Main {
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
}