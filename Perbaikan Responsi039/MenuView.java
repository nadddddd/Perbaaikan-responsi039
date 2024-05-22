package view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class MenuView extends JFrame {
    private JButton animalButton;
    private JButton employeeButton;
    private JLabel welcomeLabel;

    public MenuView(String username) {
        setTitle("Menu");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        add(panel);
        placeComponents(panel, username);
    }

    private void placeComponents(JPanel panel, String username) {
        panel.setLayout(null);

        welcomeLabel = new JLabel("Welcome, " + username);
        welcomeLabel.setBounds(10, 20, 200, 25);
        panel.add(welcomeLabel);

        animalButton = new JButton("Manage Animals");
        animalButton.setBounds(10, 60, 150, 25);
        panel.add(animalButton);

        employeeButton = new JButton("View Employees");
        employeeButton.setBounds(10, 100, 150, 25);
        panel.add(employeeButton);
    }

    public void addAnimalListener(ActionListener listener) {
        animalButton.addActionListener(listener);
    }

    public void addEmployeeListener(ActionListener listener) {
        employeeButton.addActionListener(listener);
    }
}
