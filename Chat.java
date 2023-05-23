import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chat extends JFrame implements ActionListener {
    JTextField text;
    JPanel centerPanel;

    public Chat(){
        setBounds(100, 100, 600, 400);
        setLayout(new BorderLayout());

        centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));

        JScrollPane scrollPane = new JScrollPane(centerPanel);
        add(scrollPane, BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu file = new JMenu("FILE");
        menuBar.add(file);

        JMenuItem open = new JMenuItem("Open");
        file.add(open);

        JMenuItem save = new JMenuItem("Save as");
        file.add(save);

        JMenu help = new JMenu("Help");
        menuBar.add(help);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(Color.lightGray);

        JLabel chat = new JLabel("Enter text");
        bottomPanel.add(chat);

        text = new JTextField(20);
        bottomPanel.add(text);

        JButton send = new JButton("Send");
        send.addActionListener(this);
        bottomPanel.add(send);

        JButton reset = new JButton("Reset");
        reset.addActionListener(this);
        bottomPanel.add(reset);

        getContentPane().add(bottomPanel, BorderLayout.SOUTH);
        getContentPane().add(centerPanel, BorderLayout.CENTER);
        setVisible(true);


    }

    public static void main(String[] args) {
        new Chat();
    }

    public void actionPerformed(ActionEvent ae) {
        String content = text.getText();
        if (ae.getActionCommand() == "Reset"){
            text.setText("");
            centerPanel.removeAll();
            centerPanel.revalidate();
            centerPanel.repaint();
        } else if (ae.getActionCommand() == "Send") {
            JLabel disp = new JLabel(content);
            centerPanel.add(disp);
            centerPanel.revalidate();
            centerPanel.repaint();
            text.setText("");
        }
    }
}
