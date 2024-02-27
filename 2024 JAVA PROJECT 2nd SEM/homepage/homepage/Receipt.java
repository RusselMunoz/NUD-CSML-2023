package homepage;

import java.awt.*;
import javax.swing.*;

import java.util.ArrayList;
import java.util.List;

public class Receipt {
    private static List<String> selectedProducts = new ArrayList<>();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Cursor Online Purchase Receipt");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        JTextArea receiptTextArea = new JTextArea();
        receiptTextArea.setEditable(false);
        receiptTextArea.setFont(new Font("Monospaced", Font.PLAIN, 12));

        JScrollPane scrollPane = new JScrollPane(receiptTextArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Center the JTextArea using BoxLayout
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.add(Box.createVerticalGlue());
        centerPanel.add(scrollPane);
        centerPanel.add(Box.createVerticalGlue());
        frame.add(centerPanel, BorderLayout.CENTER);

        String receiptText = generateReceiptText(); // Change here
        receiptTextArea.setText(receiptText);

        frame.setVisible(true);
        frame.setLocationRelativeTo(null); // Center the JFrame on the screen
    }

    public static void setSelectedProducts(String... products) {
        selectedProducts.clear();  // Clear the previous products
        for (String product : products) {
            selectedProducts.add(product);
        }
    }

    public static String generateReceiptText() {
        StringBuilder receiptText = new StringBuilder();
        HomePage homePageInstance = new HomePage();

        double totalPrice = homePageInstance.calculateTotalPrice();

        receiptText.append("--------------------------------------------------------------\n");
        receiptText.append("                        Cursor\n");
        receiptText.append("                Online Purchase Receipt\n\n");
        receiptText.append("                Order Number: #123456789\n");
        receiptText.append("                Date: February 6, 2024\n\n");
        receiptText.append("--------------------------------------------------------------\n");
        receiptText.append("                    Billing Information:\n");
        receiptText.append("                        Name: John Doe\n");
        receiptText.append("       Address: 123 Main Street, Cityville, State, ZIP\n");
        receiptText.append("                Email: john.doe@example.com\n");
        receiptText.append("                    Phone: (123) 456-7890\n\n");
        receiptText.append("--------------------------------------------------------------\n");
        receiptText.append("                    Payment Information:\n");
        receiptText.append("                Payment Method: Visa **** 1234\n");
        receiptText.append("                    Total Amount:" + totalPrice + "\n\n");
        receiptText.append("--------------------------------------------------------------\n");
        receiptText.append("                        Order Details:\n");
        receiptText.append("Item                 Quantity       Price         Total\n");
        receiptText.append("--------------------------------------------------------------\n");
        for (String product : selectedProducts) {
            receiptText.append(product + "            1              20.00       20.00\n");
        }
        receiptText.append("--------------------------------------------------------------\n");
        receiptText.append("Subtotal:                                  50.00\n");
        receiptText.append("Shipping:                                  999,999\n");
        receiptText.append("Tax (7%):                                 3.50\n");
        receiptText.append("--------------------------------------------------------------\n");
        receiptText.append("Grand Total:                              53.50\n\n");
        receiptText.append("--------------------------------------------------------------\n");
        receiptText.append("Thank you for shopping with us!\n");
        receiptText.append("For inquiries, contact support@cursor.com\n");
        receiptText.append("--------------------------------------------------------------\n");

        return receiptText.toString();
    }
}

