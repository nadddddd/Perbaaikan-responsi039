package view;

import javax.swing.*;

public class AnimalView extends JFrame {
    private JTextField idField;
    private JTextField nameField;
    private JTextField speciesField;
    private JTextField ageField;
    private JTextField searchField;
    private JButton addButton;
    private JButton updateButton;
    private JButton deleteButton;
    private JButton searchButton;

    public AnimalView() {
        setTitle("Manage Animals");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        add(panel);
        placeComponents(panel);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel idLabel = new JLabel("ID:");
        idLabel.setBounds(10, 20, 80, 25);
        panel.add(idLabel);

        idField = new JTextField(20);
        idField.setBounds(100, 20, 165, 25);
        panel.add(idField);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(10, 50, 80, 25);
        panel.add(nameLabel);

        nameField = new JTextField(20);
        nameField.setBounds(100, 50, 165, 25);
        panel.add(nameField);

        JLabel speciesLabel = new JLabel("Species:");
        speciesLabel.setBounds(10, 80, 80, 25);
        panel.add(speciesLabel);

        speciesField = new JTextField(20);
        speciesField.setBounds(100, 80, 165, 25);
        panel.add(speciesField);

        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(10, 110, 80, 25);
        panel.add(ageLabel);

        ageField = new JTextField(20);
        ageField.setBounds(100, 110, 165, 25);
        panel.add(ageField);

        addButton = new JButton("Add");
        addButton.setBounds(10, 140, 80, 25);
        panel.add(addButton);

        updateButton = new JButton("Update");
        updateButton.setBounds(100, 140, 80, 25);
        panel.add(updateButton);

        deleteButton = new JButton("Delete");
        deleteButton.setBounds(190, 140, 80, 25);
        panel.add(deleteButton);

        searchField = new JTextField(20);
        searchField.setBounds(280, 140, 165, 25);
        panel.add(searchField);

        searchButton = new JButton("Search");
        searchButton.setBounds(450, 140, 
