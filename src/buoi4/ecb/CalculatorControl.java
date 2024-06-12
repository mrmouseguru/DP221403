package buoi4.ecb;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;;
public class CalculatorControl implements ActionListener {

    //field
    private CalculatorEntity calculatorEntityRemote = null;
    private CalculatorBoundary calculatorBoundaryRemote = null;

    CalculatorControl(CalculatorBoundary calculatorBoundaryRemote){
        calculatorEntityRemote = new CalculatorEntity();
        this.calculatorBoundaryRemote = calculatorBoundaryRemote;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(calculatorBoundaryRemote
        .getjTextFieldInputRemote1().getText());
        // lấy data từ text field 2
        double num2 = Double.parseDouble(calculatorBoundaryRemote
        .getjTextFieldInputRemote2().getText());
        // cộng
        String command = e.getActionCommand();
        if (command.equals("ADD")) {
            calculatorEntityRemote.add(num1, num2);
            calculatorBoundaryRemote.getjLabelOutputRemote().
            setText("" + calculatorEntityRemote.getResult());

        }else if (command.equals("SUB")){
         
        }

    }
}

