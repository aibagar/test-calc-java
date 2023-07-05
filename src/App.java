// 
import java.util.*;

public class App {
    // private static double prevResult = 0;
    
    public static void main(String[] args) {
        System.out.println("Введите пример вида  a + b, a - b, a * b, a / b.:");
        try (Scanner st = new Scanner(System.in)) {
            String input = st.nextLine();
            System.out.println("Result: " + input);
            // String str = "apple,banana,orange";
       String[] fruits = input.split(" ");
      for (String fruit : fruits) {
          System.out.println(fruit);
        }
    }


        // while (true) {
        //     System.out.println("Enter expression (or 'q' to exit): ");
        //     String input = sc.nextLine();
        //     if (input.equalsIgnoreCase("q")) {
        //         System.out.println("You have exited the calculator.\nBye.");
        //         break;
        //     }
        //     if (input.charAt(0) == '+' || input.charAt(0) == '-' || input.charAt(0) == '*' || input.charAt(0) == '/') {
        //         input = prevResult + input;
        //     }
        //     // prevResulqt = helper.evaluate(input);
        //     System.out.println("Result: " + prevResult);
        // }
        // sc.close();
    }
}