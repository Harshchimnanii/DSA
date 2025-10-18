public class scoping {
    public static void main(String[] args) {
        // Block scoping
        int a = 10; 
        int b = 20;
        {
            // cannot recreate a local varibale again
            // int a = 78;

            int c = 78;
            // values initialised inside the block will remain inside the block 
        }
        // System.out.println(c);

        // scoping in for loops
        for (int i = 0; i < 10; i++) {
            i = 10;
            System.out.println(i);  
            // loop ke andar initialise  ki value andar hi rahe to accha h          
        }
    }
}
