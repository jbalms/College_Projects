import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactTracingRecord extends JFrame {
    private JPanel Panel;
    private JLabel nLabel;
    private JLabel aLabel;
    private JLabel cLabel;
    private JComboBox genderBox;
    private JTextField nField;
    private JTextField aField;
    private JTextField cField;
    private JLabel gLabel;
    private JButton submitButton;


    public ContactTracingRecord(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(Panel);
        this.pack();
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,"Your information has been saved!");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new ContactTracingRecord("My COVID-19 Contact Tracing Record");
        frame.setContentPane(new ContactTracingRecord("").Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}
