import lombok.Data;

import java.util.Stack;
import java.util.Scanner;

public class HandleComplementaryPasses {
    private Stack<ComplementaryPasses> passStack = new Stack<>();

    public void handleComplementaryPasses() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            System.out.println("Choose an operation:");
            System.out.println("1. Redeem complementary passes");
            System.out.println("2. Display all the redeemed complementary passes");
            System.out.println("3. Display the last redeemed complementary pass");
            System.out.println("4. Undo any of the redeemed complementary pass");
            System.out.println("5. QUIT");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    redeemComplementaryPasses();
                    break;
                case 2:
                    displayComplementaryPasses();
                    break;
                case 3:
                    displayLastRedeemedComplementaryPass();
                    break;
                case 4:
                    undoRedeemedComplementaryPass();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void redeemComplementaryPasses() {
        // Implementation for redeeming passes
    }

    private void displayComplementaryPasses() {
        System.out.println("All redeemed complementary passes:");
        passStack.forEach(System.out::println);
    }

    private void displayLastRedeemedComplementaryPass() {
        if (!passStack.isEmpty()) {
            System.out.println("Last redeemed complementary pass:");
            System.out.println(passStack.peek());
        } else {
            System.out.println("No redeemed passes yet.");
        }
    }

    private void undoRedeemedComplementaryPass() {
        // Implementation for undoing redeemed pass
    }
}