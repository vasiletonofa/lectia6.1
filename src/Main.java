import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int pozitiv = 0;
//        int negativ = 0;
//        int suma = 0;
//
//        Scanner scanner = new Scanner(System.in);
//
//        while (scanner.hasNext()) {
//         int g =  scanner.nextInt();
//         if (g == 0) {
//             System.out.println("Exit");
//             break;
//         }
//
//         if (g > 0) {
//             pozitiv++;
//             System.out.println("Numarul introdus la consola este: " + g +  " care e pozitiv");
//         } else {
//             negativ++;
//             System.out.println("Numarul introdus la consola este: " + g +  " care e negativ");
//         }
//
//         suma = suma + g;
//
//       }
//
//        System.out.println("Suma este: " + suma);
//        System.out.println("Numere pozitive sunt: " + pozitiv);
//        System.out.println("Numere negative sunt: " + negativ);

//        int count = 10;
//
//        if (count == 5) {
//            System.out.println("Mai mare ca 0");
//        } else if(count == 4 || count == 2) {
//            System.out.println("mai mare ca 1");
//        } else if(count == 3) {
//            System.out.println("mai mare ca 3");
//        } else {
//            System.out.println("negativ");
//        }


//        int a = 0;
//
//        switch (count) {
//            case 4: a = 4;
//                break;
//            case 3: a = 3;
//               break;
//            case 2: {
//                a = 2;
//                break;
//            }
//
//            default: {
//                a = -1;
//                System.out.println("Nu am gasit valoarea");
//            }
//        }
//
//        System.out.println(a);
////
//        Person person = new Person();
////
//       String val = "B";
////
//        switch (val) {
//            case "A", "V", "E" -> person.setName("Andrei");
//            case "B" -> person.setName("Boris");
//            case "C" -> System.out.println("C");
//            case "D" -> System.out.println("D");
//            default -> System.out.println("Nu am gasit valoare");
//        }
////
//        System.out.println(person.name);

//
//
//        if (count > 0) {
//            System.out.println("mai mare ca 0");
//        }
//        if (count > 1) {
//            System.out.println("mai mare ca 1");
//        }
//        if (count > 3) {
//            System.out.println("mai mare ca 3");
//        }


//        int v = 3;
//        switch (v) {
//            case 1: System.out.println("1");
//            case 2: System.out.println("2");
//            case 3: System.out.println("Hello");
//            case 4: System.out.println("Hello");
//            default: System.out.println("default");
//        }
//
//
//        String f = "A";
//        switch (f) {
//            case "A": System.out.println("1");
//            case "B": System.out.println("2");
//            default: System.out.println("default");
//        }


        char letter = 'C';

//        switch (letter) {
//            case 'C': System.out.println("Consoana");
//            case 'A':
//            case 'E':
//            case 'I':
//            case 'O':
//            case 'U': {
//                System.out.println("Vocala");
//                break;
//            }
//            default:
//                System.out.println("Consoana");
//        }


//        switch (letter) {
//            case 'T' -> System.out.println("Consoana T"); // BREAK
//            case 'B' ->  System.out.println("Consoana B"); // BREAK
//            case 'O', 'E', 'I' -> {
//                System.out.println("Vocala");
//            }
//            default -> System.out.println("Nu am gasit optiunea");
//        }
//
//        if (letter == 'T' || letter == 'B') {
//            System.out.println("Consoana");
//        } else if(letter == 'O') {
//            System.out.println("Vocala O");
//        } else if(letter == 'E') {
//            System.out.println("Vocala E");
//        } else if(letter == 'I') {
//            System.out.println("Vocala I");
//        } else {
//            System.out.println("Nu am gasit optiunea");
//        }
//

        Valuta v = Valuta.USD;

        switch (v) {
            case EUR -> System.out.println("EUR");
            case USD -> System.out.println("USD");
            case LEI -> System.out.println("LEI");
        }

        Boolean A = v == Valuta.USD;

        if(A) {
            System.out.println("USD");
        } else if(v == Valuta.EUR) {
            System.out.println("EUR");
        } else if(v == Valuta.LEI) {
            System.out.println("LEI");
        }
    }
}