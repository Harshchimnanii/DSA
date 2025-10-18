public class functionoverloading {
    public static void main(String[] args) {
        // whne two functions of same name are passed but with different parameters cause function overloading
        fun(23);
        fun("java");
    }
    static void fun(int a ){
        System.out.println(a);
    }
    static void fun(String a){
        System.out.println(a);
    }
    
}
