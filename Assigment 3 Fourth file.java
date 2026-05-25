import javax.swing.*;

public class ExpenseTrackerGUI extends JFrame {

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
       JComboBox<String> dayComboBox = new JComboBox<>(days);

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
       JComboBox<String> categoryComboBox =
               new JComboBox<>(categories);
      
       // Add category components to panel
       panel.add(categoryLabel);
       panel.add(categoryComboBox);

       // Amount label
       JLabel amountLabel = new JLabel("Amount:");

       // Text field for amount
       JTextField amountField = new JTextField(10);

       // Add amount components to panel
       panel.add(amountLabel);
       panel.add(amountField);

       // Description label
       JLabel descriptionLabel = new JLabel("Description:");

       // Description text field
       JTextField descriptionField = new JTextField(15);

       // Add description components to panel
       panel.add(descriptionLabel);
       panel.add(descriptionField);

       // Add panel to frame
       add(panel);

       // Make window visible
       setVisible(true);
    }

    public static void main(String[] args) {

        new ExpenseTrackerGUI();
    }
}

 

