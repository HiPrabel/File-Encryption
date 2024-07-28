
package gui;

import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {
        public Main(boolean usedTheApplication) {
                initComponents();
                setResizable(false);
                setLocationRelativeTo(null);
                setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

                addWindowListener(new WindowAdapter() {
                        public void windowClosing(WindowEvent e) {
                                JFrame frame = (JFrame) e.getSource();
                                Toolkit.getDefaultToolkit().beep();
                                int result = JOptionPane.showConfirmDialog(frame,
                                                "Are you sure you want to exit the application?",
                                                "Exit Application", JOptionPane.YES_NO_OPTION);

                                if (result == JOptionPane.YES_OPTION) {
                                        if (usedTheApplication) {
                                                new ThankYouDialog(new javax.swing.JFrame(), true)
                                                                .setVisible(rootPaneCheckingEnabled);
                                        }

                                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                }

                        }
                });
        }

        /**
         * This method is called from within the constructor to initialize the form.
         */
        @SuppressWarnings("unchecked")

        private void initComponents() {

                heading = new javax.swing.JLabel();
                jLabel1 = new javax.swing.JLabel();
                encryptButton = new javax.swing.JButton();
                decryptButton = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                heading.setFont(new java.awt.Font("Vrinda", 1, 18));
                heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                heading.setText("WELCOME TO FILE SECURITY SYSTEM");

                jLabel1.setFont(new java.awt.Font("Forte", 0, 24));
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("I want to");

                encryptButton.setFont(new java.awt.Font("Vrinda", 1, 14));
                encryptButton.setText("Encrypt the Files");
                encryptButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                encryptButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                encryptButtonActionPerformed(evt);
                        }
                });

                decryptButton.setFont(new java.awt.Font("Vrinda", 1, 14));
                decryptButton.setText("Decrypt the Files");
                decryptButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                decryptButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                decryptButtonActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(decryptButton)
                                                                                .addComponent(encryptButton)
                                                                                .addComponent(jLabel1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                150,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(281, 281, 281))
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(encryptButton,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                664,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)

                                                                                                                .addComponent(heading,
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)

                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addComponent(jLabel1)
                                                                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                                                                .addGroup(layout.createSequentialGroup()

                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addComponent(decryptButton)))
                                                                                                .addContainerGap()))));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(20, 20, 20)
                                                                .addComponent(heading,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                26,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(23, 23, 23)

                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)

                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                                                                .addGap(32, 32, 32)

                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                                                                .addGap(41, 41, 41)

                                                                .addGap(18, 18, 18)

                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                                                                .addGap(26, 26, 26)
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                36,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(encryptButton)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(decryptButton)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                21,
                                                                                Short.MAX_VALUE)

                                                                .addContainerGap()));

                pack();
        }

        private void encryptButtonActionPerformed(java.awt.event.ActionEvent evt) {
                FileChooser fileChooser = new FileChooser("ENCRYPT");
                fileChooser.setVisible(true);
                setVisible(false);
                dispose();
        }

        private void decryptButtonActionPerformed(java.awt.event.ActionEvent evt) {
                FileChooser fileChooser = new FileChooser("DECRYPT");
                fileChooser.setVisible(true);
                setVisible(false);
                dispose();
        }

        public static void main(String args[]) {

                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                }

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new Main(false).setVisible(true);
                        }
                });
        }

        // Variables declaration
        private javax.swing.JButton decryptButton;
        private javax.swing.JButton encryptButton;
        private javax.swing.JLabel heading;
        private javax.swing.JLabel jLabel1;
        // End of variables declaration
}
/**
 *
 * @author Vivek
 */