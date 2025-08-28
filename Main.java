import java.util.Arrays;
import java.util.Scanner;


public class Main{

    public static void printName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of times you want to print your name: ");
        int num1 = sc.nextInt();
        System.out.println(" ");
        System.out.print("Enter your name: ");
        String name = sc.next();
        for(int i = 1;i <= num1; i++){
            System.out.println(name);
        }
    }

    public static void printSum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int a = sc.nextInt();
        System.out.println("Enter number 2: ");
        int b = sc.nextInt();
        System.out.println(a+b);
    }
    public static void addNum(int a,int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        //Basic
        /*System.out.println("Hello World");
        String name = "Dhruv";
        int age = 21;
        System.out.println(name+" "+age);*/

        //String
        /*String fname = "Dhruv";
        String lname = "Malik";
        String Fullname = fname +" "+ lname;
        System.out.println(Fullname);
        System.out.println(Fullname.length());
        String Username = Fullname.replace(" ","_");
        System.out.println(Username);
        System.out.println(Username.substring(5,6));*/

        //Arrays
        /*int[] marks = new int[4];
        marks[0] = 23;
        marks[1] = 45;
        marks[2] = 52;
        marks[3] = 34;
        System.out.println(marks[3]);
        Arrays.sort(marks);
        System.out.println(marks[3]);
        System.out.println(Arrays.toString(marks));
        int[][] finalmarks = {{23,43,54}, {65,65,23}};
        System.out.println(Arrays.deepToString(finalmarks));
        for(int i = 0; i < finalmarks.length; i++){
            for(int j = 0; j < finalmarks[i].length; j++){
                System.out.println("Student number "+ (i+1) + " has marks "+ finalmarks[i][j]);
            }
        }*/

        //Scanner
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println(age);*/

        //Conditional Statement: If-Else
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter another number: ");
        int b = sc.nextInt();
//        System.out.println(a);
//        System.out.println(b);
        if(a>b){
            System.out.println((a-b) +" is the difference between two numbers");
        }
        else if (b>a) {
            System.out.println("The second number is greater so we'll add "+ (a+b));
        }
        else{
            System.out.println("Both Numbers are equal");
        }*/

        //Conditional Statement: Switch Case
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 to 7: ");
        int num = sc.nextInt();
        switch (num){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("The number is not between 1 to 7");
                break;
        }*/

        //Loops
        /*for(int i = 1;i<=3;i++){
            System.out.println(i);
        }
        System.out.println(" ");
        int j = 10;
        while(j>=1){
            System.out.println(j);
            j--;
        }
        int a = 10;
        System.out.println(" ");
        do{
            System.out.println(a);
        }while(a!=10);*/

        //Exception Handling: Try and Catch
        /*int[] marks = {23,53,65};
        try{
            System.out.println(marks[5]);
        } catch(Exception exception){
            System.out.print("There is an error or a bug: ");
            System.out.println(exception);
        }
        System.out.println("The rest of the program is working as it is");*/

        //Functions/Methods (made at the top before psvm)
        printName();
        printSum();
        addNum(45,54);
    }
}