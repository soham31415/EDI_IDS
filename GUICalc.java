import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUICalculator extends JFrame implements ActionListener {

    JTextField ans;
    String currentInput = ""; // variable to store the current input

    public GUICalculator() {
        setBounds(100, 100, 600, 400);
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();

        ans = new JTextField(60);
        topPanel.add(ans);

        JPanel cPanel = new JPanel();
        cPanel.setLayout(new GridLayout(4, 4));

        JButton b9 = new JButton("9");
        cPanel.add(b9);
        b9.addActionListener(this);

        // Add the remaining buttons

        getContentPane().add(topPanel, BorderLayout.NORTH);
        getContentPane().add(cPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GUICalculator();
    }

    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        if (actionCommand.matches("[0-9]")) {
            // Append the digit to the current input
            currentInput += actionCommand;
            ans.setText(currentInput);
        } else if (actionCommand.equals("C")) {
            // Clear the current input
            currentInput = "";
            ans.setText("");
        } else if (actionCommand.equals("=")) {
            // Evaluate the current input and display the result
            try {
                int result = evaluateExpression(currentInput);
                ans.setText(String.valueOf(result));
                currentInput = String.valueOf(result); // Store the result for further calculations
            } catch (Exception ex) {
                ans.setText("Invalid Expression");
            }
        } else {
            // Append the operator to the current input
            currentInput += actionCommand;
            ans.setText(currentInput);
        }
    }

    // Method to evaluate the arithmetic expression
    private int evaluateExpression(String expression) {
        return (int) new ScriptEngineManager().getEngineByName("JavaScript").eval(expression);
    }
}
