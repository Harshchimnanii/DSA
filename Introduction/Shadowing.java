public class Shadowing {
    static int x = 90; // this will be shadowed at line 6 
    public static void main(String[] args) {
         System.out.println(x);
         int x = 40;// the class varibale at line 2 will be shadowed by this 
         System.out.println(x);
         fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
