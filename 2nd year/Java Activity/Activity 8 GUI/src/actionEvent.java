//Importing Java Utilities for GUI
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class actionEvent {
//Main Class
    public static void main(String[] args){
        new MainWindow();
    }
}
class MainWindow extends JFrame {
//Creating variable with final keyword
    protected final JMenuBar menubar;
    protected final JMenu menuFile, menuEdit, menuHelp;
    protected final JMenuItem opNew, opSav, opLoad, opQuit;
//Creating text field for each variables
    JTextField fnField = new JTextField(5);
    JTextField lnField = new JTextField(5);
    JTextField mnField = new JTextField(5);
    JTextField pField = new JTextField(5);
    JTextField bDayField = new JTextField(5);
    JTextField sField = new JTextField(5);
    private final JButton buttonAdd = new JButton("Add");
    private final JButton buttonClr = new JButton("Clear");
    private final DefaultListModel<String> model = new DefaultListModel<>();
    //Creating Main window for GUI
    public MainWindow() {
        setTitle("Employee's List");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addListeners();
        createWindow();
        setVisible(true);
        //Creating menu for the GUI
        menubar=new JMenuBar();
        menuFile=new JMenu("File");
        menuEdit=new JMenu("Edit");
        menuHelp=new JMenu("Help");
        opNew=new JMenuItem("New");
        opSav=new JMenuItem("Save");
        opLoad=new JMenuItem("Load");
        opQuit=new JMenuItem("Quit");

        menubar.add(menuFile);
        menubar.add(menuEdit);
        menubar.add(menuHelp);
        menuFile.add(opNew);
        menuFile.add(opSav);
        menuFile.add(opLoad);
        menuFile.add(opQuit);
        menuFile.addSeparator();
        setJMenuBar(menubar);

        opNew.addActionListener(e -> {
            dispose();
            new MainWindow();
        });

        opQuit.addActionListener(e -> System.exit(0));
    }
    //Creating the window layout
    private void createWindow() {
        add(createLabel(), BorderLayout.NORTH);
        add(createLabel(), BorderLayout.WEST);
        add(createLabel(), BorderLayout.EAST);
        add(createLabel(), BorderLayout.SOUTH);
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(createTop(), BorderLayout.NORTH);
        panel.add(createBottom(), BorderLayout.SOUTH);
        panel.add(createCenter());
        add(panel);
    }
    //Creating the label for the GUI
    private JLabel createLabel() {
        JLabel label = new JLabel(" ");
        label.setPreferredSize(new Dimension(10,10));
        return label;
    }
    //Creating the panel for the user input
    private JPanel createTop() {

        JPanel panel = new JPanel();

        JLabel LNlabel = new JLabel("Enter Last Name: ");
        JLabel FNlabel = new JLabel("Enter First Name: ");
        JLabel MNlabel = new JLabel("Enter Middle Name: ");
        JLabel Plabel = new JLabel("Enter Position: ");
        JLabel Blabel = new JLabel("Enter Birthdate: ");
        JLabel Slabel = new JLabel("Enter Salary: ");

        panel.add(LNlabel);
        panel.add(lnField);

        panel.add(FNlabel);
        panel.add(fnField);

        panel.add(MNlabel);
        panel.add(mnField);

        panel.add(Plabel);
        panel.add(pField);

        panel.add(Blabel);
        panel.add(bDayField);

        panel.add(Slabel);
        panel.add(sField);

        panel.add(buttonAdd, BorderLayout.EAST);

        return panel;
    }
    //Creating the panel
    private JPanel createCenter() {
        JList<String> lstName = new JList<>(model);
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(createLabel(), BorderLayout.NORTH);
        panel.add(createLabel(), BorderLayout.SOUTH);
        panel.add(new JScrollPane(lstName));
        return panel;
    }
    //For the CLEAR button
    private JPanel createBottom() {
        JPanel panel = new JPanel (new FlowLayout(FlowLayout.CENTER));
        panel.add(buttonClr);
        return panel;
    }
    //Creating Action Listener for the GUI
    private void addListeners() {

        buttonAdd.addActionListener(new AddAction());
        buttonClr.addActionListener(e -> model.clear());

    }
    //For the output Display of each input value
    class AddAction implements ActionListener {
        public void actionPerformed(ActionEvent e)
        {
            String Lname = lnField.getText();
            String Fname = fnField.getText();
            String Mname = mnField.getText();
            String pos = pField.getText();
            String bday = bDayField.getText();
            String sal = sField.getText();

            if(Lname.length()>0&&Fname.length()>0&&Mname.length()>0&&pos.length()>
                    0&&bday.length()>0&&sal.length()>0)
            {
                model.addElement("Last Name: " + Lname);
                model.addElement("First Name: " + Fname);
                model.addElement("Middle Name: " + Mname);
                model.addElement("Position: " + pos);
                model.addElement("Birthday [Month/Day/Year]: " + bday);
                model.addElement("Salary: " + sal);
                model.addElement(" ");
                lnField.setText(" ");
                fnField.setText(" ");
                mnField.setText(" ");
                pField.setText(" ");
                bDayField.setText(" ");
                sField.setText(" ");
            }
        }
    }
}