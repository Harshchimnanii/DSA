import java.util.Arrays;
import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        // sum();
        // System.out.print("Mama ji ");
        // // void return types are called 
        // Greeting();
        // // other return types values are printed
        // int result = Sum2();
        // System.out.println(result);
        // String result = namaste();
        // System.out.println(result);
        // System.out.println(sum3(1,29 ));
        // int a = 10;
        // int b = 20;
        // swap(a , b);
        // the values are not swapped cause the variables are changed only for that particular function
        // System.out.println(a + " " + b);
        // but if we use a reference of the value in that variable the value can be alrered to the changed value
        // int arr [] = {1 , 2 , 3 , 3 , 6 };
        // change(arr);
        // System.out.println(Arrays.toString(arr));

    }
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int n2 = sc.nextInt();
        int sum =  n1 + n2;
        System.out.println("The Sum is : " + sum);
    }
    static void Greeting(){
        System.out.println("Radhe Radhe...!");
    }
    // use of return statement for integer type
    static int Sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int n2 = sc.nextInt();
        int sum =  n1 + n2;
        return sum;
        // return ke baad kuch bhi likhna vyarth h 
        // this is an unrechable statement
        // System.out.println("bhai print nhi hoga mehnat mat karr! ");
    }
    // use of return statement for String data type
    static String namaste(){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String result = name + " ji Namaste";
        return result;
    }
    // use of parameters in function calls
    static int sum3(int a , int b){
        int sum = a+b;
        return sum;
    }
    // function to swap two numbers 
    static void swap(int a , int b ){
        int temp = a ;
        a = b;
        b = temp; 
    }
    static void change(int nums[]){
        nums[0] = 99;
    }
}
