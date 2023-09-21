import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter num one ");
        int numOne = scanner.nextInt();
        System.out.println("Enter num Two ");
        int numTwo = scanner.nextInt();
        int resultOne = add(numOne,numTwo);
        System.out.println(resultOne);
        System.out.println("Enter your name:");
        String name = scanner2.nextLine();
        String resultTwo = greeting(name);
        System.out.println(resultTwo);
        System.out.println("Enter num one");
        int one = scanner.nextInt();
        System.out.println("Enter num Two ");
        int two = scanner.nextInt();
        System.out.println("Enter num Three ");
        int three = scanner.nextInt();
        System.out.println("Enter num Four ");
        int four = scanner.nextInt();
        int resultThree = add(one,two,three,four);
        System.out.println(resultThree);
        System.out.println("What do you want to be printed?");
        String print = scanner2.nextLine();
        printMe(print);



    }

    public static int add(int numOne, int numTwo){
        return numOne+numTwo;
    }

    public static String greeting(String name){
        return "Bonjour, "+name+"!";
    }
    public static int add(int numOne, int numTwo, int numThree, int numFour) {
        return add(add(add(numOne,numTwo),numThree),numFour);
    }
    public static void printMe(String toBePrinted) {
        System.out.println(toBePrinted);
    }

}
//I Vincent, have neither given nor received unauthorized aid on this piece of work.