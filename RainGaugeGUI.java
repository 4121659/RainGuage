import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class RainGaugeGUI extends JFrame implements ActionListener {
    private JTextField nameField, usernameField;
    private JPasswordField passwordField, confirmPasswordField;
    private JButton registerButton;

    public RainGaugeGUI() {
        // creating and configuring the JFrame
        setTitle("Rain Gauge Registration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null); // centre the window

        // creating and configuring components
        JLabel nameLabel = new JLabel("Name:");
        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");

        nameField = new JTextField(20);
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        confirmPasswordField = new JPasswordField(20);

        registerButton = new JButton("Register");
        registerButton.addActionListener(this);

        // creating a panel for the components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(confirmPasswordLabel);
        panel.add(confirmPasswordField);
        panel.add(new JLabel()); // placeholder for spacing
        panel.add(registerButton);

        // adding the panel to the frame
        add(panel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            String name = nameField.getText();
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            String confirmPassword = new String(confirmPasswordField.getPassword());

            if (password.equals(confirmPassword)) {
                // registration successful, write the information to a file
                try {
                    FileWriter fileWriter = new FileWriter("registration.txt", true);
                    fileWriter.write("Name: " + name + "\n");
                    fileWriter.write("Username: " + username + "\n");
                    fileWriter.write("Password: " + password + "\n\n");
                    fileWriter.close();
                    JOptionPane.showMessageDialog(this, "Registration Successful! Information saved to 'registration.txt'");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error writing to file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Password could not be confirmed. Please start over.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RainGaugeGUI();
        });
    }
}