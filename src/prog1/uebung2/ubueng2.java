package prog1.uebung2;

public class ubueng2 {
    public static void main(String[] args){

        int myNumber = 2147483647;
        System.out.println("wert von i ist: " + myNumber);

        long myLongNumber = 2147483647;
        System.out.println(myLongNumber);

        char myChar = 'a';
        System.out.println(myChar);

        byte myByte = 127;
        System.out.println(myByte);

        short myShort = 32767;
        System.out.println(myShort);

        float myFloat = 4.23f;
        System.out.println(myFloat);

        double myDouble = 6.28;
        System.out.println(myDouble);

        boolean isStudent = true;
        System.out.println(isStudent);

        String Said = "Hallo ich bin Said";
        System.out.println(Said);

        // Aufgabe 4
        myNumber++;
        System.out.println(myNumber + " Nach der Erhöhung");

        // max cap bei int ist = 2147483647 deswegen haben wir hier ein overflow.
        // int kann nur 32bit deswegen sollten wir in dem Fall lieber long benutzen da es mehr speichern kann.

        // Aufgabe 5
        myLongNumber++;
        System.out.println(myLongNumber + " nach Erhöhung");

        // wie man sieht funktioniert es jetzt und wir sehen das es im Terminal nur um 1 erhöht wurde.

        /* Aufgabe 6
            es wird zu einem 'A' weil es in unicode ausgegeben wird
            66 = B | 67 = C  USW ab 97 wäre es dann ein kleines a
            char ein 16-Bit-Datentyp, der ein Unicode-Zeichen speichert.
            Unicode ist ein Zeichencode, der jedem Zeichen eine Zahl zuordnet.
        */
            // Aufgabe 7
        /*
            A ist richtig.
            obwohl ich zuerst dachte das b richtig ist
            prinln macht erst nextline nachdem es ergebnis ausgegeben hat.
         */
        System.out.print("answer=");
        System.out.println(40 + 2);

                        // Uebungsblatt 2.1
        /*
        1. Was haben int und long gemeinsam? Was ist deren Unterschied?

        Antwort : Beide sind primitive Datentypen für Ganze Zahlen.
                  werden für Rechnungen verwendet.
                  Unteschiede sind  das int 32 bit groß ist und long 64.
                  long kann viel längere/Größere zahlenfolgen speichern.

        2. Was bestimmt die Genauigkeit einer Division?
         */
            int a = 5;
            int b = 2;
            System.out.println(a / b); //  2


            double x = 5;
            double y = 2;
            System.out.println(x / y); //  2.5

         /* Antwort :

            int Rundet das Ergebnis auf eine ganze Zahl ab

            double jedoch zeigt auch nachkomma stellen.

         */
        // Aufgabe 3

        int age = 26;
        System.out.println(age);
        age++;
        System.out.println(age);
        age = 36;
        System.out.println(age);
//        long age = 26;
//        System.out.println(age)
//        Es geht nicht es gibt einen fehler auf weil es bereits deklariert wurde
//        wir können den Wert so oft ändern wie wir wollen aber deklaration nicht ändern.

        // Aufgabe 4 Wie kann man den Wert einer Variablen ändern?
//        Antwort : Eine Variable kann genau einmal deklariert, aber beliebig oft einen neuen
//        Wert zugewiesen bekommen. wie oben schon angezeigt
    }

}
