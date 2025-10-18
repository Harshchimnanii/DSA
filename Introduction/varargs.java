import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
        fun(1, 2 , 3 ,4 , 5);
        multiple(10,20, "harsh" , "kunal" , "divya");
    }
    static void multiple(int a ,int b , String ...c){
        System.out.println(a + b + Arrays.toString(c));
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
