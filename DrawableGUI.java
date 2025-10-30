package OOP.java;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class DrawableGUI {
    private JFrame frame;
    private JTextField typeField;
    private JTextField valueField;
    private DefaultListModel<String> listModel;
    private List<Drawable> drawables;

    public DrawableGUI() {
        frame = new JFrame("Drawable Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        drawables = new ArrayList<>();
        listModel = new DefaultListModel<>();
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));
        panel.add(new JLabel("Shape Type:"));
        typeField = new JTextField();
        panel.add(typeField);
        panel.add(new JLabel("Dimension (Radius/Side):"));
        valueField = new JTextField();
        panel.add(valueField);
        JButton addButton = new JButton("Add Shape");
        panel.add(addButton);
        JList<String> shapeList = new JList<>(listModel);
        JScrollPane listScrollPane = new JScrollPane(shapeList);
        panel.add(listScrollPane);
        JButton calculateButton = new JButton("Calculate Total Area");
        panel.add(calculateButton);
        JTextArea resultArea = new JTextArea();
        resultArea.setEditable(false);
        panel.add(resultArea);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String type = typeField.getText().trim();
                double value;
                try {
                    value = Double.parseDouble(valueField.getText().trim());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid dimension value. Please enter a number.");
                    return;
                }
                Drawable drawable;
                if (type.equalsIgnoreCase("circle")) {
                    drawable = new Circle(value);
                } else if (type.equalsIgnoreCase("cube")) {
                    drawable = new Cube(value);
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid shape type. Supported types: circle, cube.");
                    return;
                }
                drawables.add(drawable);
                listModel.addElement(drawable.toString() + " " + drawable.getArea());
            }
        });
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double totalArea = 0;
                for (Drawable drawable : drawables) {
                    totalArea += drawable.getArea();
                }
                resultArea.setText("Total area of all drawables: " + totalArea);
            }
        });
        frame.add(panel);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new DrawableGUI();
    }
}
