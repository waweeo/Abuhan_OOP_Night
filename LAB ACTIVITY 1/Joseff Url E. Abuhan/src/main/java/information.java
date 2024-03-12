import java.util.Scanner;

public class information {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("Enter your full name (Last name, First name): ");   
            String fullName = scanner.nextLine();
            
            System.out.println("Enter your age: ");
            int age = scanner.nextInt   ();
            scanner.nextLine(); 
            
            System.out.println("Enter your gender: ");
            String gender = scanner.nextLine();
            
            System.out.println("Enter your address: ");
            String address = scanner.nextLine();
            
            System.out.println("Enter your civil status: ");
            String civilStatus = scanner.nextLine();
            
            System.out.println("Enter the number of brothers/sisters: ");
            int numSiblings = scanner.nextInt();
            
    
            System.out.println("Full name: " + fullName);
            System.out.println("Age: " + age);
            System.out.println("Gender: " + gender);
            System.out.println("Address: " + address);
            System.out.println("Civil Status: " + civilStatus);
            System.out.println("# of brothers/sisters: " + numSiblings);
        }
    }
}