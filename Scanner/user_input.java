package Scanner;

import java.util.Scanner;
public class user_input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

          System.out.print("Enter your username: ");
                 String username = input.nextLine();
               

          if (username.equalsIgnoreCase("Edciel D. Geolina")) {
                 System.out.println("Access Granted!");
          } else {
                 System.out.println("Access Denied!");
        }
          

        System.out.print("Enter your section: ");
        String section = input.nextLine();

        if (section.equalsIgnoreCase("Peridot")) {
            System.out.println("Welcome to Section Peridot!");
        } else {
            System.out.println("Access Denied!");
        }

        input.close();
    }
}
    
