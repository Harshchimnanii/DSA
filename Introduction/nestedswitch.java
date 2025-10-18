import java.util.Scanner;
public class nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String Department = in.next();
        switch (empID) {
            case 1:
            System.out.println("kunal kushwaha");
                break;
            case 2:
            System.out.println("Harsh chimnani");
                break;
            case 3:
            System.out.println("krishna vallabh");
                break;
            case 4:
            switch (Department) {
                case "IT":
                    System.out.println("IT Department");
                    break;
                case "Finance":
                    System.out.println("Finance Department");
                    break;
                default:
                System.out.println("No department entered");
                    break;
            }
                break;
        
            default:
            System.out.println("Please enter Correct Employee ID");
                break;
        }
    }
}
