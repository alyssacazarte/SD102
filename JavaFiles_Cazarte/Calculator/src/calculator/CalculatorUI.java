/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author 1styrGroupB
 */
public class CalculatorUI extends javax.swing.JFrame {
     double firstint;
     double secondint;
     double result;
     String operations;
    /**
     * Creates new form CalculatorUI
     */
    public CalculatorUI() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldOutput = new javax.swing.JTextField();
        jButtonDel = new javax.swing.JButton();
        jButtonSeven = new javax.swing.JButton();
        jButtonEight = new javax.swing.JButton();
        jButtonNine = new javax.swing.JButton();
        jButtonDivide = new javax.swing.JButton();
        jButtonFive = new javax.swing.JButton();
        jButtonFour = new javax.swing.JButton();
        jButtonSix = new javax.swing.JButton();
        jButtonMultiply = new javax.swing.JButton();
        jButtonTwo = new javax.swing.JButton();
        jButtonOne = new javax.swing.JButton();
        jButtonThree = new javax.swing.JButton();
        jButtonMinus = new javax.swing.JButton();
        jButtonZero = new javax.swing.JButton();
        jButtonPeriod = new javax.swing.JButton();
        jButtonEquals = new javax.swing.JButton();
        jButtonPlus = new javax.swing.JButton();
        jButtonOperators = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.lightGray);

        jTextFieldOutput.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldOutputActionPerformed(evt);
            }
        });

        jButtonDel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonDel.setText("DEL");
        jButtonDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDelMouseClicked(evt);
            }
        });

        jButtonSeven.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonSeven.setText("7");
        jButtonSeven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSevenMouseClicked(evt);
            }
        });
        jButtonSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSevenActionPerformed(evt);
            }
        });

        jButtonEight.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonEight.setText("8");
        jButtonEight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEightMouseClicked(evt);
            }
        });

        jButtonNine.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonNine.setText("9");
        jButtonNine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonNineMouseClicked(evt);
            }
        });

        jButtonDivide.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonDivide.setText("/");
        jButtonDivide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDivideMouseClicked(evt);
            }
        });

        jButtonFive.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonFive.setText("5");
        jButtonFive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonFiveMouseClicked(evt);
            }
        });

        jButtonFour.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonFour.setText("4");
        jButtonFour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonFourMouseClicked(evt);
            }
        });

        jButtonSix.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonSix.setText("6");
        jButtonSix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSixMouseClicked(evt);
            }
        });

        jButtonMultiply.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonMultiply.setText("*");
        jButtonMultiply.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMultiplyMouseClicked(evt);
            }
        });

        jButtonTwo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonTwo.setText("2");
        jButtonTwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonTwoMouseClicked(evt);
            }
        });

        jButtonOne.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonOne.setText("1");
        jButtonOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonOneMouseClicked(evt);
            }
        });

        jButtonThree.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonThree.setText("3");
        jButtonThree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonThreeMouseClicked(evt);
            }
        });

        jButtonMinus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonMinus.setText("-");
        jButtonMinus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMinusMouseClicked(evt);
            }
        });

        jButtonZero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonZero.setText("0");
        jButtonZero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonZeroMouseClicked(evt);
            }
        });

        jButtonPeriod.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonPeriod.setText(".");
        jButtonPeriod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonPeriodMouseClicked(evt);
            }
        });

        jButtonEquals.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonEquals.setText("=");
        jButtonEquals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEqualsMouseClicked(evt);
            }
        });

        jButtonPlus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonPlus.setText("+");
        jButtonPlus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonPlusMouseClicked(evt);
            }
        });

        jButtonOperators.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonOperators.setText("+/-");
        jButtonOperators.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonOperatorsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonFour, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jButtonFive, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonEight, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jButtonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonZero, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jButtonPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonNine, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonSix, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonThree, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonDel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonOperators, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jTextFieldOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOperators, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEight, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNine, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFour, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFive, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSix, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonThree, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonZero, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setText("            SKYLER CALCULATOR");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextFieldOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldOutputActionPerformed

    private void jButtonSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSevenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSevenActionPerformed

    private void jButtonDelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDelMouseClicked
    jTextFieldOutput.setText ("");
    }//GEN-LAST:event_jButtonDelMouseClicked

    private void jButtonOneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOneMouseClicked
    String Enternumber = jTextFieldOutput.getText()+ jButtonOne.getText();
    jTextFieldOutput.setText (Enternumber);
    }//GEN-LAST:event_jButtonOneMouseClicked

    private void jButtonTwoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTwoMouseClicked
    String Enternumber = jTextFieldOutput.getText()+ jButtonTwo.getText();
    jTextFieldOutput.setText (Enternumber);
    }//GEN-LAST:event_jButtonTwoMouseClicked

    private void jButtonPlusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPlusMouseClicked
    firstint = Double.parseDouble(jTextFieldOutput.getText());
    jTextFieldOutput.setText("");
    operations= "+";   
    }//GEN-LAST:event_jButtonPlusMouseClicked

    private void jButtonEqualsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEqualsMouseClicked
    
        String answer;
        secondint = Double.parseDouble(jTextFieldOutput.getText());
        if (operations == "+")
        {
            result = firstint + secondint;
            answer = String.format("%.10f",result);
            jTextFieldOutput.setText(answer);
        }
        else if (operations == "-")
        {
            result = firstint - secondint;
            answer = String.format("%.10f",result);
            jTextFieldOutput.setText(answer);
        }
        else if (operations == "*")
        {
            result = firstint * secondint;
            answer = String.format("%.10f",result);
            jTextFieldOutput.setText(answer);
        }
        else if (operations == "/")
        {
            result = firstint / secondint;
            answer = String.format("%.10f",result);
            jTextFieldOutput.setText(answer);
        }
        else if (operations == "%")
        {
            result = firstint % secondint;
            answer = String.format("%.10f",result);
            jTextFieldOutput.setText(answer);
        }
    
    }//GEN-LAST:event_jButtonEqualsMouseClicked

    private void jButtonZeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonZeroMouseClicked
   String Enternumber = jTextFieldOutput.getText()+ jButtonZero.getText();
    jTextFieldOutput.setText (Enternumber);
    }//GEN-LAST:event_jButtonZeroMouseClicked

    private void jButtonThreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonThreeMouseClicked
    String Enternumber = jTextFieldOutput.getText()+ jButtonThree.getText();
    jTextFieldOutput.setText (Enternumber);
    }//GEN-LAST:event_jButtonThreeMouseClicked

    private void jButtonFourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFourMouseClicked
    String Enternumber = jTextFieldOutput.getText()+ jButtonFour.getText();
    jTextFieldOutput.setText (Enternumber);
    }//GEN-LAST:event_jButtonFourMouseClicked

    private void jButtonFiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFiveMouseClicked
    String Enternumber = jTextFieldOutput.getText()+ jButtonFive.getText();
    jTextFieldOutput.setText (Enternumber);
    }//GEN-LAST:event_jButtonFiveMouseClicked

    private void jButtonSixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSixMouseClicked
    String Enternumber = jTextFieldOutput.getText()+ jButtonSix.getText();
    jTextFieldOutput.setText (Enternumber);
    }//GEN-LAST:event_jButtonSixMouseClicked

    private void jButtonSevenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSevenMouseClicked
    String Enternumber = jTextFieldOutput.getText()+ jButtonSeven.getText();
    jTextFieldOutput.setText (Enternumber);
    }//GEN-LAST:event_jButtonSevenMouseClicked

    private void jButtonEightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEightMouseClicked
    String Enternumber = jTextFieldOutput.getText()+ jButtonEight.getText();
    jTextFieldOutput.setText (Enternumber);
    }//GEN-LAST:event_jButtonEightMouseClicked

    private void jButtonNineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNineMouseClicked
    String Enternumber = jTextFieldOutput.getText()+ jButtonNine.getText();
    jTextFieldOutput.setText (Enternumber);
    }//GEN-LAST:event_jButtonNineMouseClicked

    private void jButtonDivideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDivideMouseClicked
    firstint = Double.parseDouble(jTextFieldOutput.getText());
    jTextFieldOutput.setText("");
    operations= "/";   
    }//GEN-LAST:event_jButtonDivideMouseClicked

    private void jButtonMultiplyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMultiplyMouseClicked
    firstint = Double.parseDouble(jTextFieldOutput.getText());
    jTextFieldOutput.setText("");
    operations= "*";   
    }//GEN-LAST:event_jButtonMultiplyMouseClicked

    private void jButtonMinusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMinusMouseClicked
    firstint = Double.parseDouble(jTextFieldOutput.getText());
    jTextFieldOutput.setText("");
    operations= "-";   
    }//GEN-LAST:event_jButtonMinusMouseClicked

    private void jButtonOperatorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOperatorsMouseClicked
    double ops = Double.parseDouble(String.valueOf(jTextFieldOutput.getText()));
    ops = ops * (-1);
    jTextFieldOutput.setText(String.valueOf(ops));
    }//GEN-LAST:event_jButtonOperatorsMouseClicked

    private void jButtonPeriodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPeriodMouseClicked
     String Enternumber = jTextFieldOutput.getText()+ jButtonPeriod.getText();
    jTextFieldOutput.setText (Enternumber);
    }//GEN-LAST:event_jButtonPeriodMouseClicked

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
            java.util.logging.Logger.getLogger(CalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDel;
    private javax.swing.JButton jButtonDivide;
    private javax.swing.JButton jButtonEight;
    private javax.swing.JButton jButtonEquals;
    private javax.swing.JButton jButtonFive;
    private javax.swing.JButton jButtonFour;
    private javax.swing.JButton jButtonMinus;
    private javax.swing.JButton jButtonMultiply;
    private javax.swing.JButton jButtonNine;
    private javax.swing.JButton jButtonOne;
    private javax.swing.JButton jButtonOperators;
    private javax.swing.JButton jButtonPeriod;
    private javax.swing.JButton jButtonPlus;
    private javax.swing.JButton jButtonSeven;
    private javax.swing.JButton jButtonSix;
    private javax.swing.JButton jButtonThree;
    private javax.swing.JButton jButtonTwo;
    private javax.swing.JButton jButtonZero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldOutput;
    // End of variables declaration//GEN-END:variables
}