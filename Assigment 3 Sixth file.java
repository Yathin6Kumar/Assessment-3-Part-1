import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ExpenseTrackerGUI extends JFrame {

    //ArrayList to store expenses
    ArrayList<String> expenses = new ArrayList<>();

    // GUI components
    JComboBox<String> dayComboBox;
    JComboBox<String> categoryComboBox;
    JTextField amountField;
    JTextField descriptionField;

    public ExpenseTrackerGUI() {

        setTitle("Weekly Expense Tracker");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

       // Add Panel
       JPanel panel = new JPanel();
       
       // Add Label
       JLabel dayLabel = new JLabel("Select Day:");

       // Add Days for dropdown
       String[] days = {
               "Monday",
               "Tuesday",
               "Wednesday",
               "Thursday",
               "Friday",
               "Saturday",
               "Sunday"
            };

       // Add Dropdown menu
       dayComboBox = new JComboBox<>(days);

       // Add components to panel
       panel.add(dayLabel);
       panel.add(dayComboBox);

       // Category label
       JLabel categoryLabel = new JLabel("Category:");

       // Category options
       String[] categories = {
               "Groceries",
               "Eating out",
               "Petrol",
               "Uber",
               "Bills",
               "Rent",
               "Others"
       };

       // Category dropdown
        categoryComboBox =
               new JComboBox<>(categories);
      
       // Add category components to panel
       panel.add(categoryLabel);
       panel.add(categoryComboBox);

       // Amount label
       JLabel amountLabel = new JLabel("Amount:");

       // Text field for amount
       amountField = new JTextField(10);

       // Add amount components to panel
       panel.add(amountLabel);
       panel.add(amountField);

       // Description label
       JLabel descriptionLabel = new JLabel("Description:");

       // Description text field
       descriptionField = new JTextField(15);

       // Add description components to panel
       panel.add(descriptionLabel);
       panel.add(descriptionField);

       // Add Expense button
       JButton addButton = new JButton("Add Expense");

       // Add Button to panel
       panel.add(addButton);

       // Button click event
       addButton.addActionListener(new ActionListener() {
           
           @Override
           public void actionPerformed(ActionEvent e) {

        // Get Selected day
        String day = dayComboBox.getSelectedItem().toString();

        // Get Selected Category
        String category = 
                categoryComboBox.getSelectedItem().toString();
        
        // Get amount entered
        String amount = amountField.getText();

        // Check if amount field is empty
        if (amount.isEmpty()) {

            JOptionPane.showMessageDialog(
                  null,
                "Please enter an amount!"
            );

            return;
        }

        // Convert amount to number
        double amountValue;

        try {

            amountValue = Double.parseDouble(amount);

        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(
                    null,
                    "Amount must be a valid number!"
            );

            return;

        }

        // Check for negative amount
        if (amountValue < 0) {

            JOptionPane.showMessageDialog(
                    null,
                    "Amount cannot be negative!"
            );

            return;

        }

        // Get description entered
        String description = descriptionField.getText();

        // Combine everything into one expense record
        String expense =
                day + " | " +
                category + " | $" +
                amount + " | " +
                description;

        // Store expense in ArrayList
        expenses.add(expense);
        
        // Show success message
        JOptionPane.showMessageDialog(null, 
                "Expense Added Successfully!");

               
           }
       });

       // Add panel to frame
       add(panel);

       // Make window visible
       setVisible(true);
    }

    public static void main(String[] args) {

        new ExpenseTrackerGUI();
    }
}

 

