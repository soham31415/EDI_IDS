import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class FileBrowserExample extends JFrame {
    private JTextField filePathField;
    private JButton browseButton;

    public FileBrowserExample() {
        setTitle("File Browser Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 100);
        setLocationRelativeTo(null); // Center the frame

        // Create components
        filePathField = new JTextField(30);
        browseButton = new JButton("Browse");

        // Add components to the frame
        JPanel panel = new JPanel();
        panel.add(filePathField);
        panel.add(browseButton);
        add(panel);

        // Add action listener to the browse button
        browseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openFile();
            }
        });
    }

    private void openFile() {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(this);
            File selectedFile = fileChooser.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();
            filePathField.setText(filePath);
            // Perform operations with the selected file
            // ...

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FileBrowserExample().setVisible(true);
            }
        });
    }
}
