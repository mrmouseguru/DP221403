package buoi3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorWindow extends JFrame
        implements ActionListener {

    private JLabel jLabelInputRemote1, jLabelInputRemote2,
            jLabelOutputRemote;
    private JTextField jTextFieldInputRemote1, jTextFieldInputRemote2;
    private JPanel jPanelRemote;
    private JButton addButtonRemote, subButtonRemote;
    private Calculator calculatorRemote;

    CalculatorWindow() {
        calculatorRemote = new Calculator();
        buildPanel();
        add(jPanelRemote);
        setTitle("Frame Viewer");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void buildPanel() {

        jLabelInputRemote1 = new JLabel("input1");
        // add(jLabelInputRemote1);
        jTextFieldInputRemote1 = new JTextField(10);
        // add(jTextFieldInputRemote1);
        jPanelRemote = new JPanel();
        // jPanelRemote.setBackground(Color.GREEN);
        jPanelRemote.add(jLabelInputRemote1);
        jPanelRemote.add(jTextFieldInputRemote1);

        jLabelInputRemote2 = new JLabel("input2");
        jTextFieldInputRemote2 = new JTextField(10);
        jPanelRemote.add(jLabelInputRemote2);
        jPanelRemote.add(jTextFieldInputRemote2);

        jLabelOutputRemote = new JLabel("Output");
        jPanelRemote.add(jLabelOutputRemote);

        addButtonRemote = new JButton("ADD");
        addButtonRemote.addActionListener(this);// calculatorWindowRemote === this
        subButtonRemote = new JButton("SUB");
        subButtonRemote.addActionListener(this);

        jPanelRemote.add(addButtonRemote);
        jPanelRemote.add(subButtonRemote);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(jTextFieldInputRemote1.getText());
        // lấy data từ text field 2
        double num2 = Double.parseDouble(jTextFieldInputRemote2.getText());
        // cộng
        String command = e.getActionCommand();
        if (command.equals("ADD")) {

            calculatorRemote.add(num1, num2);
            
          
            jLabelOutputRemote.setText("" + calculatorRemote.getResult());
        }else if (command.equals("SUB")){
         
        }

    }
}
