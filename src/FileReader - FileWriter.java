import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GroceryFileProcessor {
    public static void main(String[] args) {
        String inputFile = "Groceries.txt";
        String outputFile = "GroceriesFormatted.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            double totalPrice = 0.0;

            writer.write("****************************************************\n");
            writer.write("ID# Item Quantity Price (€).\n");

            while ((line = reader.readLine()) != null) {
                String[] elements = line.split(",");
                String id = elements[0];
                String itemName = elements[1];
                String quantity = elements[2];
                double price = Double.parseDouble(elements[3]);

                writer.write(id + " " + itemName + " " + quantity + " " + price + ".\n");

                totalPrice += Double.parseDouble(quantity) * price;
            }

            writer.write("****************************************************\n");
            writer.write("The grocery shopping total is: €" + totalPrice + "\n");
            writer.write("****************************************************\n");

            System.out.println("File processing completed successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}