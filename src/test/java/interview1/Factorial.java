package interview1;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(faktorial(3));

    }

    public static int faktorial(int number) {
        int faktorial = 1;
        for (int i = 1; i <= number; i++) {
            if (number == 0) {
                faktorial = 1;

            } else {
                faktorial = faktorial * i;
            }

        } return faktorial;
    }
}