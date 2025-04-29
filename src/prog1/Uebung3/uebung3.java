package prog1.Uebung3;

public class uebung3 {
    public static void main(String[] args){

        printIntDivision(17,4);
    }

    public static void printIntDivision(int nr1, int nr2)
    {
        int div = getQuotient(nr1,nr2);
        int rest = getRemainder(nr1,nr2) ;
        System.out.println(nr1 + " geteilt durch " + nr2 +  " ergibt "+ div + " Es bleibt ein Rest von " + rest);
    }

    public static int getQuotient(int nr1, int nr2) {
        int quotient = nr1 / nr2;
//        System.out.println(nr1 + " / " + nr2 + " = " + quotient);
        return (quotient);

    }
    public static int getRemainder(int nr1, int nr2) {
        int rest = nr1 % nr2 ;
//        System.out.println(nr1 + " mod "+ nr2 + " = " + rest);
        return (rest);
    }

}