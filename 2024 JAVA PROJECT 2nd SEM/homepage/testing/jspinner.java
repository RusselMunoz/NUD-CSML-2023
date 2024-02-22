package testing;

import javax.swing.*;
import java.awt.*;

public class jspinner {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Number Spinner Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create SpinnerModel
            SpinnerNumberModel numberModel = new SpinnerNumberModel(1, 0, 100, 1);

            // Create JSpinner with NumberEditor
            JSpinner spinner = new JSpinner(numberModel);
            JSpinner.NumberEditor editor = new JSpinner.NumberEditor(spinner, "0");
            spinner.setEditor(editor);

            // Set preferred size to ensure the editor fits the content
            Dimension preferredSize = spinner.getPreferredSize();
            preferredSize = new Dimension(80, preferredSize.height);
            spinner.setPreferredSize(preferredSize);

            // Create a panel and add the spinner to it
            JPanel panel = new JPanel();
            panel.add(spinner);

            // Add the panel to the frame
            frame.getContentPane().add(panel, BorderLayout.CENTER);

            // Set frame properties
            frame.setSize(300, 200);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
