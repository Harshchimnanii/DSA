import java.util.Scanner;
public class switchstatements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        // switch (fruit) {
        //     case "mango":
        //         System.out.println("KING OF FRUITS");
        //         break;
        //     case "apple":
        //         System.out.println("its found best in kashmir");
        //         break;
        //     case "banana":
        //         System.out.println("its long and healthy");
        //         break;
        //     case "orange":
        //         System.out.println("its a round fruit");
        //         break;
        //     case "kiwi":
        //         System.out.println("its very costly"); 
        //         break;
        //     default:
        //         System.out.println("Invalid Fruit");
        //         break;
        // }

        // ENHANCED SWITCH STATEMENTS 
        System.out.println("Enter the day");
        int Day = in.nextInt();
        switch (Day) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("friday");
            case 7 -> System.out.println("Saturday");
            default-> System.out.println("Enter a valid day");
        }
        
    }
}
