/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.newproject;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;

/**
 *
 * @author krish
 */
public class UserPage extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(UserPage.class.getName());

    /**
     * Creates new form UserPage
     */
    public UserPage() {
        setContentPane(new FinalBossPanel()); // Background gradient applied

        initComponents();

        setLayout(null);
        bossCard.setLayout(null);

        bossCard.setBounds(100, 150, 700, 550);
        add(bossCard);

        // Move all components INSIDE bossCard
        for (Component c : getContentPane().getComponents()) {
            if (c != bossCard) {
                bossCard.add(c);
            }
        }

        customizeUI();
        centerComponents();
    }

    private void customizeUI() {
        Color gold = new Color(212, 175, 55);
        Color goldBright = new Color(255, 215, 85);
        Color navyDark = new Color(10, 20, 40);

        Font titleFont = new Font("Segoe UI Black", Font.BOLD, 30);
        Font labelFont = new Font("Segoe UI Semibold", Font.BOLD, 15);
        Font fieldFont = new Font("Segoe UI", Font.PLAIN, 14);
        Font buttonFont = new Font("Segoe UI Black", Font.BOLD, 15);

        // Title
        JLabel title = new JLabel("USER DASHBOARD");
        title.setFont(titleFont);
        title.setForeground(gold);
        title.setBounds(220, 20, 350, 40);
        bossCard.add(title);

        JSeparator sep = new JSeparator();
        sep.setBounds(200, 65, 300, 3);
        sep.setBackground(goldBright);
        sep.setForeground(goldBright);
        bossCard.add(sep);

        // Style all JLabels
        for (JLabel lbl : new JLabel[] { jLabel3, jLabel4 }) {
            lbl.setFont(labelFont);
            lbl.setForeground(goldBright);
        }

        // Instruction label - bigger and bold
        jLabel2.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
        jLabel2.setForeground(goldBright);

        // Welcome label - bigger and bold
        jLabel1.setFont(new Font("Segoe UI Black", Font.BOLD, 22));
        jLabel1.setForeground(goldBright);

        // ComboBox styling
        downloadfile.setFont(fieldFont);
        downloadfile.setBackground(new Color(255, 255, 255, 230));
        downloadfile.setBorder(new LineBorder(gold, 2, true));

        // TextField styling
        fileUrl.setFont(fieldFont);
        fileUrl.setBackground(new Color(255, 255, 255, 230));
        fileUrl.setBorder(new LineBorder(gold, 2, true));

        // Submit button styling
        submit.setFont(buttonFont);
        submit.setBackground(navyDark);
        submit.setForeground(goldBright);
        submit.setBorder(new LineBorder(goldBright, 3, true));
        submit.setFocusPainted(false);

        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent e) {
                submit.setBackground(goldBright);
                submit.setForeground(navyDark);
            }

            public void mouseExited(java.awt.event.MouseEvent e) {
                submit.setBackground(navyDark);
                submit.setForeground(goldBright);
            }
        });
    }

    private void centerComponents() {
        int startX_label = 80;
        int startX_field = 250;
        int width_label = 160; // label width - increased to fit "SELECT TYPE"
        int width_field = 380;
        int height = 33;
        int labelHeight = 25;

        int y = 100;

        // Welcome message centered
        jLabel1.setBounds(220, y, 300, 30);

        y += 50;

        // Instruction label centered (wider for long text)
        jLabel2.setBounds(80, y, 550, 30);

        y += 60;

        // Select type row
        jLabel3.setBounds(startX_label, y, width_label, labelHeight);
        downloadfile.setBounds(startX_field, y - 5, width_field, height);

        y += 80;

        // Submit button centered
        submit.setBounds(275, y, 150, 40);

        y += 70;

        // File URL label centered
        jLabel4.setBounds(180, y, 350, 30);

        y += 40;

        // File URL field centered
        fileUrl.setBounds(160, y, 380, height);
    }

    JPanel bossCard = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;

            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            g2.setColor(new Color(255, 255, 255, 220));
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 35, 35);

            g2.setColor(new Color(212, 175, 55, 120));
            g2.setStroke(new BasicStroke(6));
            g2.drawRoundRect(3, 3, getWidth() - 6, getHeight() - 6, 35, 35);
        }
    };

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        downloadfile = new javax.swing.JComboBox<>();
        submit = new javax.swing.JButton();
        fileUrl = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("WELCOME TO ARCHIVE");

        jLabel2.setText("SELECT THE TYPE OF FILE YOU WANT TO DOWNLOAD");

        jLabel3.setText("SELECT TYPE");

        downloadfile.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Historical", "Legal", "Goverment Records", "Survey", "General Knowledge", "Science" }));

        submit.setText("SUBMIT");
        submit.addActionListener(this::submitActionPerformed);

        jLabel4.setText("FILE URL WILL BE SHOWED HERE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(downloadfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fileUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(downloadfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(53, 53, 53)
                .addComponent(submit)
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(fileUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:

        try {
            String docType = String.valueOf(downloadfile.getSelectedItem());

            ResultSet rs;
            rs = DataBase.getDocument(docType);

            if (rs.next()) {
                String fUrl = rs.getString("file_url");
                fileUrl.setVisible(true);
                fileUrl.setText(fUrl);
            } else {
                JOptionPane.showMessageDialog(this, "No data found");

            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Something went wrong");
        }
    }// GEN-LAST:event_submitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new UserPage().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> downloadfile;
    private javax.swing.JTextField fileUrl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
