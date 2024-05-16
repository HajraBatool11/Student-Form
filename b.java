import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class b implements ActionListener {
    JFrame frame = new JFrame("Student Information");
    JButton button = new JButton("Submit");
    JPanel p = new JPanel(new SpringLayout());
    JLabel l = new JLabel("Student Form");
    JTextField text = new JTextField();
    JTextField text1 = new JTextField();
    JTextField text2 = new JTextField();
    JLabel l1 = new JLabel("First name:");
    JLabel l2 = new JLabel("Second name:");
    JLabel l3 = new JLabel("Contact number:");
    String[] programe = {"program", "java", "c++", "python"};
    String[] course = {"courses", "oop", "SE", "Calculas"};
    JComboBox<String> cbox = new JComboBox<>(programe);
    JComboBox cbox2=new JComboBox<>(course);
    JRadioButton femaleb=new JRadioButton("Female");
    JRadioButton maleb=new JRadioButton("Male");
    ButtonGroup group=new ButtonGroup();


    public b() {
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        SpringLayout layout = new SpringLayout();
        p.setLayout(layout);

        l.setFont(new Font("Arial", Font.BOLD, 25));
        frame.getContentPane().add(p, BorderLayout.CENTER);
        frame.setLocationRelativeTo(null);

        p.setBackground(Color.gray);
        p.add(l1);
        p.add(text);
        p.add(l2);
        p.add(text1);
        p.add(l3);
        p.add(text2);
        p.add(button);
        p.add(l);
        p.add(cbox);
        p.add(cbox2);

        layout.putConstraint(SpringLayout.WEST, l, 200, SpringLayout.WEST, p);
        layout.putConstraint(SpringLayout.NORTH, l, 10, SpringLayout.NORTH, p);

        layout.putConstraint(SpringLayout.WEST, l1, 10, SpringLayout.WEST, p);
        layout.putConstraint(SpringLayout.NORTH, l1, 60, SpringLayout.NORTH, p);

        layout.putConstraint(SpringLayout.WEST, text, 150, SpringLayout.WEST, p);
        layout.putConstraint(SpringLayout.NORTH, text, 60, SpringLayout.NORTH, p);
        text.setPreferredSize(new Dimension(300, 30));

        layout.putConstraint(SpringLayout.WEST, l2, 10, SpringLayout.WEST, p);
        layout.putConstraint(SpringLayout.NORTH, l2, 110, SpringLayout.NORTH, p);

        layout.putConstraint(SpringLayout.WEST, text1, 150, SpringLayout.WEST, p);
        layout.putConstraint(SpringLayout.NORTH, text1, 110, SpringLayout.NORTH, p);
        text1.setPreferredSize(new Dimension(300, 30));

        layout.putConstraint(SpringLayout.WEST, l3, 10, SpringLayout.WEST, p);
        layout.putConstraint(SpringLayout.NORTH, l3, 160, SpringLayout.NORTH, p);

        layout.putConstraint(SpringLayout.WEST, text2, 150, SpringLayout.WEST, p);
        layout.putConstraint(SpringLayout.NORTH, text2, 160, SpringLayout.NORTH, p);
        text2.setPreferredSize(new Dimension(300, 30));

        layout.putConstraint(SpringLayout.WEST, button, 250, SpringLayout.WEST, p);
        layout.putConstraint(SpringLayout.NORTH, button, 350, SpringLayout.NORTH, p);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, cbox, 0, SpringLayout.HORIZONTAL_CENTER, p);
        layout.putConstraint(SpringLayout.NORTH, cbox, 10, SpringLayout.SOUTH, text2);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, cbox2, 0, SpringLayout.HORIZONTAL_CENTER, p);
        layout.putConstraint(SpringLayout.NORTH, cbox2, 10, SpringLayout.SOUTH, cbox);

        p.add(femaleb);
        p.add(maleb);
        group.add(femaleb);
        group.add(maleb);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, femaleb, 0, SpringLayout.HORIZONTAL_CENTER, p);
        layout.putConstraint(SpringLayout.NORTH, femaleb, 10, SpringLayout.SOUTH, cbox2);

        layout.putConstraint(SpringLayout.WEST, maleb, 10, SpringLayout.EAST, femaleb);
        layout.putConstraint(SpringLayout.NORTH, maleb, 0, SpringLayout.NORTH, femaleb);

        button.addActionListener(this);
        cbox.addActionListener(this);
        frame.setVisible(true);
        group.add(femaleb);
        group.add(maleb);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            String firstName = text.getText();
            String semester = text1.getText();
            String contact = text2.getText();
            String program = (String) cbox.getSelectedItem();
            String course = (String) cbox2.getSelectedItem();
            String gender = "";
            String message = "Your information is saved successfully.\n" +
                    "First Name: " + firstName + "\n" +
                    "Semester: " + semester + "\n" +
                    "Contact: " + contact + "\n" +
                    "Program: " + program + "\n" +
                    "Course: " + course + "\n";
            JOptionPane.showMessageDialog(frame, message, "Student Information", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("your information has been saved successfuly. Which is given below.");
            System.out.println("First Name: " + firstName);
            System.out.println("Semester: " + semester);
            System.out.println("Contact: " + contact);
            System.out.println("Program: " + program);
            System.out.println("Course: " + course);
        }
    }
    public static void main(String[] args) {
        new b();
    }}

