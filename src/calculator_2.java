/*
 * test GetHub
 */

/*
Abdullah Khalid Alshotairy
1535237
Fahad albalawi
1554782
*/

/**
 *
 * @author Abdullah
 */
public class calculator_2 extends javax.swing.JFrame {

    int FirstNum;
    int SecondNum;
    int Result; 
    String operation;
    
    public calculator_2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Display = new javax.swing.JTextField();
        Num1 = new javax.swing.JButton();
        Num2 = new javax.swing.JButton();
        Num3 = new javax.swing.JButton();
        Num7 = new javax.swing.JButton();
        Num8 = new javax.swing.JButton();
        Num9 = new javax.swing.JButton();
        Equal = new javax.swing.JButton();
        Multiply = new javax.swing.JButton();
        Plus = new javax.swing.JButton();
        Num5 = new javax.swing.JButton();
        Num4 = new javax.swing.JButton();
        Num6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Result");

        Display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayActionPerformed(evt);
            }
        });

        Num1.setText("1");
        Num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num1ActionPerformed(evt);
            }
        });

        Num2.setText("2");
        Num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num2ActionPerformed(evt);
            }
        });

        Num3.setText("3");
        Num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num3ActionPerformed(evt);
            }
        });

        Num7.setText("7");
        Num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num7ActionPerformed(evt);
            }
        });

        Num8.setText("8");
        Num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num8ActionPerformed(evt);
            }
        });

        Num9.setText("9");
        Num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num9ActionPerformed(evt);
            }
        });

        Equal.setText("=");
        Equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EqualActionPerformed(evt);
            }
        });

        Multiply.setText("*");
        Multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplyActionPerformed(evt);
            }
        });

        Plus.setText("+");
        Plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusActionPerformed(evt);
            }
        });

        Num5.setText("5");
        Num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num5ActionPerformed(evt);
            }
        });

        Num4.setText("4");
        Num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num4ActionPerformed(evt);
            }
        });

        Num6.setText("6");
        Num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(Plus, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Equal, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(83, 83, 83)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(93, 93, 93)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Num1)
                                .addComponent(Num7)
                                .addComponent(Num4))
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Num2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Num3))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Num8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Num9))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Num5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Num6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Num1)
                    .addComponent(Num2)
                    .addComponent(Num3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Num5)
                    .addComponent(Num4)
                    .addComponent(Num6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Num7)
                    .addComponent(Num9)
                    .addComponent(Num8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Equal)
                    .addComponent(Multiply)
                    .addComponent(Plus))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num1ActionPerformed
        String Number = Display.getText()+Num1.getText(); 
        Display.setText(Number);
    }//GEN-LAST:event_Num1ActionPerformed

    private void Num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num2ActionPerformed
        String Number = Display.getText()+Num2.getText();
        Display.setText(Number);
    }//GEN-LAST:event_Num2ActionPerformed

    private void Num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num3ActionPerformed
         String Number = Display.getText()+Num3.getText();
        Display.setText(Number);
    }//GEN-LAST:event_Num3ActionPerformed

    private void Num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num5ActionPerformed
         String Number = Display.getText()+Num5.getText();
        Display.setText(Number);
    }//GEN-LAST:event_Num5ActionPerformed

    private void Num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num7ActionPerformed
         String Number = Display.getText()+Num7.getText();
        Display.setText(Number);
    }//GEN-LAST:event_Num7ActionPerformed

    private void Num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num8ActionPerformed
         String Number = Display.getText()+Num8.getText();
        Display.setText(Number);
    }//GEN-LAST:event_Num8ActionPerformed

    private void Num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num9ActionPerformed
        String Number = Display.getText()+Num9.getText();
        Display.setText(Number);
    }//GEN-LAST:event_Num9ActionPerformed

    private void PlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusActionPerformed
        FirstNum = Integer.parseInt(Display.getText());
        Display.setText("");
        operation = "+";
    }//GEN-LAST:event_PlusActionPerformed

    private void MultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplyActionPerformed
        FirstNum = Integer.parseInt(Display.getText());
        Display.setText("");
        operation = "*";
    }//GEN-LAST:event_MultiplyActionPerformed

    private void EqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EqualActionPerformed
        SecondNum = Integer.parseInt(Display.getText());
        if(operation.equals("+"))
            Result = FirstNum + SecondNum;
        
        if(operation.equals("*"))
            Result = FirstNum * SecondNum;
        
        Display.setText(Result + "");
    }//GEN-LAST:event_EqualActionPerformed

    private void DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DisplayActionPerformed

    private void Num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num4ActionPerformed
         String Number = Display.getText()+Num4.getText();
        Display.setText(Number);
    }//GEN-LAST:event_Num4ActionPerformed

    private void Num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num6ActionPerformed
         String Number = Display.getText()+Num6.getText();
        Display.setText(Number);
    }//GEN-LAST:event_Num6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(calculator_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Display;
    private javax.swing.JButton Equal;
    private javax.swing.JButton Multiply;
    private javax.swing.JButton Num1;
    private javax.swing.JButton Num2;
    private javax.swing.JButton Num3;
    private javax.swing.JButton Num4;
    private javax.swing.JButton Num5;
    private javax.swing.JButton Num6;
    private javax.swing.JButton Num7;
    private javax.swing.JButton Num8;
    private javax.swing.JButton Num9;
    private javax.swing.JButton Plus;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
