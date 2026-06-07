import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class Student extends JFrame {
    JTextField tfName, tfUSN, tfAge, tfCGPA;
    JTextArea taAddress;
    JComboBox<String> cbCategory;
    ArrayList<StudentGUI> students = new ArrayList<>();
    public Student()
    {
        setTitle("Student information system");
        setLayout(new GridLayout(8, 2, 5, 5));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new JLabel("Name: "));
        tfName = new JTextField();
        add(tfName);
        add(new JLabel("USN: "));
        tfUSN = new JTextField();
        add(tfUSN);
        add(new JLabel("Age: "));
        tfAge = new JTextField();
        add(tfAge);
        add(new JLabel("Address: "));
        taAddress = new JTextArea(2,10);
        add(new JScrollPane(taAddress));
        add(new JLabel("CGPA: "));
        tfCGPA = new JTextField();
        add(tfCGPA);
        add(new JLabel("Category : "));
        cbCategory = new JComboBox<>(new String[]{"General", "OBC","SC","ST"});
        add(cbCategory);
        JButton btnInsert = new JButton("Insert");
        JButton btnClear = new JButton("Clear");
        add(btnInsert);
        add(btnClear);
        btnInsert.addActionListener(e-> insertStudent());
        btnClear.addActionListener(e-> clearFields());
        pack();
        setVisible(true);

    }
    void insertStudent()
    {
        String name = tfName.getText().trim();
        String usn = tfUSN.getText().trim();
        String ageStr = tfAge.getText().trim();
        String cgpaStr = tfCGPA.getText().trim();
        String address = taAddress.getText().trim();
        if(name.isEmpty() || usn.isEmpty() || ageStr.isEmpty() || cgpaStr.isEmpty() || address.isEmpty() ) {
            JOptionPane.showMessageDialog(this, "All fields are required !", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    if(!name.matches("[a-zA-Z]+"))
    {
        JOptionPane.showMessageDialog(this, "Name must contain only alphabets","Error",JOptionPane.ERROR_MESSAGE);
        return;
    }
    if(!usn.matches("[1-9][A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{3}"))
    {
        JOptionPane.showMessageDialog(this, "Invalid USN format!", "Error",JOptionPane.ERROR_MESSAGE);
        return;

    }
    try {
        int age = Integer.parseInt(ageStr);
        if (age < 15 || age > 100) throw new NumberFormatException();
        double cgpa = Double.parseDouble(cgpaStr);
        if (cgpa < 0 || cgpa > 10) throw new NumberFormatException();
        StudentGUI s = new StudentGUI();
        s.name = name;
        s.usn = usn;
        s.age = age;
        s.cgpa = cgpa;
        s.address = address;
        s.category = (String) cbCategory.getSelectedItem();
        students.add(s);//adding into arraylist
        System.out.println("\n-------ALL STUDENTS-------\n");
        for (StudentGUI st : students) {
            System.out.println(st);
        }
        JOptionPane.showMessageDialog(this, "Student inserted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        clearFields();
    }
    catch (NumberFormatException ex)
    {
        JOptionPane.showMessageDialog(this, "Invalid Age or CGPA values!", "Error", JOptionPane.ERROR_MESSAGE);

    }

}
void clearFields()
{
    tfName.setText(" ");
    tfUSN.setText(" ");
    tfAge.setText(" ");
    tfCGPA.setText("");
    taAddress.setText("");
    cbCategory.setSelectedIndex(0);
}
public static void main(String[] args)
{
    SwingUtilities.invokeLater( () -> new Student());
}
}