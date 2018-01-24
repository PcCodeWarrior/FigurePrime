public class figurePrime {


    public static void main(String[] args) {
        for (int num = 2; num < 100; num++) {
            if (isPrime(num))
                System.out.println(num + " is a prime number");
        }

    }

    public static boolean isPrime(int num) {
        if (num == 2)
            return true;
        //only need to check against 1 less than the first half of the number
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
