import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab17 extends JFrame {
    JLabel txtDisplay;
    JRadioButton rbRed, rbBlue, rbBlack;
    JCheckBox chkBold, chkItalic;
    ButtonGroup colorGroup;

    public Lab17() {
        setTitle("Lab17");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        txtDisplay = new JLabel("Sample Text");
        txtDisplay.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(txtDisplay);

        add(new JLabel("Colors"));
        rbRed = new JRadioButton("Red");
        rbBlue = new JRadioButton("Blue");
        rbBlack = new JRadioButton("Black");
        colorGroup = new ButtonGroup();
        colorGroup.add(rbRed);
        colorGroup.add(rbBlue);
        colorGroup.add(rbBlack);
        add(rbRed);
        add(rbBlue);
        add(rbBlack);

        add(new JLabel("Style"));
        chkBold = new JCheckBox("Bold");
        chkItalic = new JCheckBox("Italic");
        add(chkBold);
        add(chkItalic);

        rbRed.addActionListener(e -> txtDisplay.setForeground(Color.RED));
        rbBlue.addActionListener(e -> txtDisplay.setForeground(Color.BLUE));
        rbBlack.addActionListener(e -> txtDisplay.setForeground(Color.BLACK));
        chkBold.addActionListener(e -> updateFont());
        chkItalic.addActionListener(e -> updateFont());
    }

    private void updateFont() {
        int style = Font.PLAIN;
        if (chkBold.isSelected() && chkItalic.isSelected())
            style = Font.BOLD + Font.ITALIC;
        else if (chkBold.isSelected())
            style = Font.BOLD;
        else if (chkItalic.isSelected())
            style = Font.ITALIC;
        txtDisplay.setFont(new Font("Tahoma", style, 20));
    }

    public static void main(String[] args) {
        new Lab17().setVisible(true);
    }
}
