import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter num one ");
        int numOne = scanner.nextInt();
        System.out.println("Enter num Two ");
        int numTwo = scanner.nextInt();
        int resultOne = add(numOne,numTwo);
        System.out.println(resultOne);
        scanner.nextLine();

    }

    public static int add(int numOne, int numTwo){
        return numOne+numTwo;
    }

    public static String Greeting(String name){
        return"bonjour,"+name;
        String Greet= String name;
        System.out.println(Greet);

    }
    public static int add(int numOne, int numTwo, int numThree, int numFour) {
        int add1 = add(numOne, numTwo);
        int add2 = add(add1, numThree);
        return add(add2, numFour);
    }
    public static void printMe(String toBePrinted) {
        System.out.println(toBePrinted);
    }
}
}

