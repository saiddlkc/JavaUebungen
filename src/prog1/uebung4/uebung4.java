package prog1.uebung4;

public class uebung4 {
    public static void main(String[] args) {
        boolean result = isPrime(8);
        System.out.println("ist eine Primzahl? " +result);
        printPrimeNumbers(40);
        int kleinsterTeiler = getSmallestDivider(99);
        System.out.println(" ");
        System.out.println( "Kleinster Teiler  " + kleinsterTeiler);
        beispiel6(5, 5);

    }
    public static void beispiel6(int breite, int hoehe) {

        for (int i = 0; i < hoehe; i++) {
            for (int j = 0; j < breite; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }

    public static int getSmallestDivider(int number){

        if (number < 2 || (isPrime(number))){
            return number;
        }
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                return i;
            }
        }
        return number;
    }

    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++){
            if (number % i == 0) {
                return false;
            }
    }
        return true;
}
    public static void printPrimeNumbers(int max){

        for (int i = 1; i <= max; i++) {
            if(isPrime(i)) {
                System.out.print(i +" ");
            }
            else{
                System.out.print(". ");
            }
        }
        }
    }







