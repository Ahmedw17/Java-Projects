import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Lab16 extends JFrame {
    private JTextArea textArea;
    private Path selectedPath;

    public Lab16() {
        setTitle("File Editor");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);
       
        JPanel panel = new JPanel();
        JButton openButton = new JButton("Open File");
        JButton saveButton = new JButton("Save Changes");
        panel.add(openButton);
        panel.add(saveButton);
        add(panel, BorderLayout.SOUTH);
        
        openButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                selectedPath = fileChooser.getSelectedFile().toPath();
                try {
                    String content = Files.readString(selectedPath);
                    textArea.setText(content);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error reading file: " + ex.getMessage());
                }
            }
        });
       
        saveButton.addActionListener(e -> {
            if (selectedPath == null) {
                JOptionPane.showMessageDialog(this, "No file selected. Please open a file first.");
                return;
            }
            try {
                Files.writeString(selectedPath, textArea.getText());
                JOptionPane.showMessageDialog(this, "File saved successfully!");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error saving file: " + ex.getMessage());
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Lab16::new);
    }
}
