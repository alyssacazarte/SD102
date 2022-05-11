
package mysimplenotepad;

import java.awt.Color;
import java.awt.FileDialog;
import static java.awt.Toolkit.getDefaultToolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.event.TextEvent;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import javax.swing.JOptionPane;
import java.awt.datatransfer.StringSelection;


public class MyJFrame extends javax.swing.JFrame {
//variable declaration
    
    String programName = "Notepad";
    String filename = "";
    String holdText;
    String fn;
    String dir;
    boolean textChanged = false;
    String fileName;
    Clipboard clip = getToolkit () . getSystemClipboard ();
    Clipboard clipboard=getDefaultToolkit().getSystemClipboard();

  
    public MyJFrame() {
        initComponents();
    }
    public void checkFile() {
        BufferedReader read;
        StringBuffer sb = new StringBuffer ();
        try {
            read = new BufferedReader (new FileReader(filename));
            String line;
            while ((line = read.readLine ()) != null) {
                sb.append(line + "\n");
            }
            textArea.setText(sb.toString());
            read.close();    
        }catch (FileNotFoundException e) {
            System.out.println("File not Found");
        }catch (IOException ioe) {
            
        }
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        dialogColor = new javax.swing.JDialog();
        colorChooser = new javax.swing.JColorChooser();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jDialog4 = new javax.swing.JDialog();
        jDialog5 = new javax.swing.JDialog();
        jDialog6 = new javax.swing.JDialog();
        jDialog7 = new javax.swing.JDialog();
        jDialog8 = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newMenu = new javax.swing.JMenuItem();
        openMenu = new javax.swing.JMenuItem();
        saveMenu = new javax.swing.JMenuItem();
        saveasMenu = new javax.swing.JMenuItem();
        exitMenu = new javax.swing.JMenuItem();
        Paste = new javax.swing.JMenu();
        colorMenu = new javax.swing.JMenuItem();
        cutMenu = new javax.swing.JMenuItem();
        copyMenu = new javax.swing.JMenuItem();
        pasteMenu = new javax.swing.JMenuItem();

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout dialogColorLayout = new javax.swing.GroupLayout(dialogColor.getContentPane());
        dialogColor.getContentPane().setLayout(dialogColorLayout);
        dialogColorLayout.setHorizontalGroup(
            dialogColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogColorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(colorChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
                .addContainerGap())
        );
        dialogColorLayout.setVerticalGroup(
            dialogColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogColorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(colorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog5Layout = new javax.swing.GroupLayout(jDialog5.getContentPane());
        jDialog5.getContentPane().setLayout(jDialog5Layout);
        jDialog5Layout.setHorizontalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog5Layout.setVerticalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog6Layout = new javax.swing.GroupLayout(jDialog6.getContentPane());
        jDialog6.getContentPane().setLayout(jDialog6Layout);
        jDialog6Layout.setHorizontalGroup(
            jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog6Layout.setVerticalGroup(
            jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog7Layout = new javax.swing.GroupLayout(jDialog7.getContentPane());
        jDialog7.getContentPane().setLayout(jDialog7Layout);
        jDialog7Layout.setHorizontalGroup(
            jDialog7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog7Layout.setVerticalGroup(
            jDialog7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog8Layout = new javax.swing.GroupLayout(jDialog8.getContentPane());
        jDialog8.getContentPane().setLayout(jDialog8Layout);
        jDialog8Layout.setHorizontalGroup(
            jDialog8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog8Layout.setVerticalGroup(
            jDialog8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Notepad");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        textArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textAreaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(textArea);

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        newMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        newMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mysimplenotepad/new.png"))); // NOI18N
        newMenu.setText("New");
        newMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMenuActionPerformed(evt);
            }
        });
        jMenu1.add(newMenu);

        openMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mysimplenotepad/open.png"))); // NOI18N
        openMenu.setText("Open");
        openMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuActionPerformed(evt);
            }
        });
        jMenu1.add(openMenu);

        saveMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        saveMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mysimplenotepad/save.png"))); // NOI18N
        saveMenu.setText("Save");
        saveMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuActionPerformed(evt);
            }
        });
        jMenu1.add(saveMenu);

        saveasMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        saveasMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mysimplenotepad/save as.png"))); // NOI18N
        saveasMenu.setText("Save As");
        saveasMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveasMenuActionPerformed(evt);
            }
        });
        jMenu1.add(saveasMenu);

        exitMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        exitMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mysimplenotepad/exit.png"))); // NOI18N
        exitMenu.setText("Exit");
        exitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuActionPerformed(evt);
            }
        });
        jMenu1.add(exitMenu);

        jMenuBar1.add(jMenu1);

        Paste.setText("Edit");

        colorMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mysimplenotepad/font color .png"))); // NOI18N
        colorMenu.setText("Font Color");
        colorMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorMenuActionPerformed(evt);
            }
        });
        Paste.add(colorMenu);

        cutMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cutMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mysimplenotepad/cut.png"))); // NOI18N
        cutMenu.setText("Cut");
        cutMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuActionPerformed(evt);
            }
        });
        Paste.add(cutMenu);

        copyMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        copyMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mysimplenotepad/copy.png"))); // NOI18N
        copyMenu.setText("Copy");
        copyMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuActionPerformed(evt);
            }
        });
        Paste.add(copyMenu);

        pasteMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        pasteMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mysimplenotepad/paste.png"))); // NOI18N
        pasteMenu.setText("Paste");
        pasteMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteMenuActionPerformed(evt);
            }
        });
        Paste.add(pasteMenu);

        jMenuBar1.add(Paste);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void saveMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuActionPerformed
     if(filename.equals(""))
         saveAs();
     else
         save(filename);
    }//GEN-LAST:event_saveMenuActionPerformed

    private void saveasMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveasMenuActionPerformed
        saveAs();
    }//GEN-LAST:event_saveasMenuActionPerformed

    private void textAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textAreaMouseClicked
       if (TextEvent.TEXT_VALUE_CHANGED!=0)
       {
           if(!textChanged)
               setTitle("*"+getTitle());
           textChanged=true;
           saveMenu.setEnabled(true);
       }
    }//GEN-LAST:event_textAreaMouseClicked

    private void newMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMenuActionPerformed
       newFile();
    }//GEN-LAST:event_newMenuActionPerformed

    private void openMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuActionPerformed
       if (textArea.getText().length() < 1) {
           FileDialog fd = new FileDialog(this, "Choose File", FileDialog.LOAD);
           fd.show();
           if (fd.getFile() !=null) {
               filename = fd.getDirectory() + fd.getFile();
               setTitle(fileName);
               checkFile();     
           }
           textArea.requestFocus();
       }
       else if(!textChanged) {
           FileDialog fd = new FileDialog (this, "Choose File", FileDialog.LOAD);
           fd.show();
           if (fd.getFile() !=null) {
               fileName = fd.getDirectory() + fd.getFile();
               setTitle(fileName);
               checkFile();     
           }
           textArea.requestFocus();
       }
       else{
           int confirm = JOptionPane.showConfirmDialog(null,"Do you want to save before existing this program");
            if (confirm==JOptionPane.YES_OPTION)
            {
                if("".equals(filename)) {
                    saveAs();    
       }
                else{
                    save(filename);
                }
              FileDialog fd = new FileDialog(this, "Choose File", FileDialog.LOAD);
              fd.show();
              if (fd.getFile() != null) {
                  fileName = fd.getDirectory() + fd.getFile();
                  setTitle(fileName);
                  checkFile();     
              }
              textArea.requestFocus();
              
              }
            else if(confirm == JOptionPane.NO_OPTION){
                FileDialog fd = new FileDialog(this, "Choose File", FileDialog.LOAD);
                fd.show();
                if (fd.getFile() != null) {
                  fileName = fd.getDirectory() + fd.getFile();
                  setTitle(fileName);
                  checkFile();    
                }
            }
       }
    }//GEN-LAST:event_openMenuActionPerformed

    private void exitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuActionPerformed
       if("".equals(textArea.getText())){
           System.exit(0);
       }
       else if(!textChanged) {
           System.exit(0);
       }
       else{
           int confirm = JOptionPane.showConfirmDialog(this,"Do you want to save before existing this program?");
           if (confirm==JOptionPane.YES_OPTION) {
               if(filename.equals(""))
                   saveAs();
               else
                   save(filename);
           }
           if (confirm==JOptionPane.NO_OPTION)
           {
               System.exit(0);
           }
                   
               
           }
    }//GEN-LAST:event_exitMenuActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if("".equals(textArea.getText())){
            System.exit(0);
        }
        else if(!textChanged){
            System.exit(0);
        }
        else{
            int confirm = JOptionPane.showConfirmDialog(this,"Do you want to save before existing this program?");
            if (confirm==JOptionPane.YES_OPTION){
                if(filename.equals(""))
                    saveAs();
                else
                    save(filename);
                System.exit(0);
            }
            if (confirm==JOptionPane.NO_OPTION)
            {
                System.exit(0);
            }
        }
    }//GEN-LAST:event_formWindowClosing

    private void colorMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorMenuActionPerformed
        Color c = colorChooser.showDialog(null,"ColorDialog",getBackground());
        textArea.setForeground(c);
    }//GEN-LAST:event_colorMenuActionPerformed

    private void pasteMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteMenuActionPerformed
     try {
         Transferable pasteText = clipboard.getContents(MyJFrame.this);
         String sel = (String) pasteText.getTransferData(DataFlavor.stringFlavor);
         textArea.replaceRange(sel,textArea.getSelectionStart(),textArea.getSelectionEnd());
         
     }catch (Exception e){
         System.out.println("Didn't work");
     }
    }//GEN-LAST:event_pasteMenuActionPerformed

    private void cutMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuActionPerformed
      String cutString = textArea.getSelectedText();
      StringSelection cutSelection = new StringSelection(cutString);
      clipboard.setContents(cutSelection,cutSelection);
      textArea.replaceRange("", textArea.getSelectionStart(), textArea.getSelectionEnd());
    }//GEN-LAST:event_cutMenuActionPerformed

    private void copyMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuActionPerformed
        String copyText = textArea.getSelectedText();
        StringSelection copySelection = new StringSelection(copyText);
        clipboard.setContents(copySelection, copySelection);
    }//GEN-LAST:event_copyMenuActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Paste;
    private javax.swing.JColorChooser colorChooser;
    private javax.swing.JMenuItem colorMenu;
    private javax.swing.JMenuItem copyMenu;
    private javax.swing.JMenuItem cutMenu;
    private javax.swing.JDialog dialogColor;
    private javax.swing.JMenuItem exitMenu;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JDialog jDialog5;
    private javax.swing.JDialog jDialog6;
    private javax.swing.JDialog jDialog7;
    private javax.swing.JDialog jDialog8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuItem newMenu;
    private javax.swing.JMenuItem openMenu;
    private javax.swing.JMenuItem pasteMenu;
    private javax.swing.JMenuItem saveMenu;
    private javax.swing.JMenuItem saveasMenu;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables

    private void saveAs() {
      FileDialog fd = new FileDialog (MyJFrame.this, "save",FileDialog.SAVE);
      fd.show ();
      if (fd.getFile() != null) {
          
          fn=fd.getFile();
          dir=fd.getDirectory();
          filename = dir + fn + ".txt";
          
          setTitle(filename);
          try
          {
              DataOutputStream d = new DataOutputStream(new FileOutputStream(filename));
              holdText = textArea.getText();
              BufferedReader br = new BufferedReader(new StringReader(holdText));
              while ((holdText = br.readLine()) != null)
              {
                  d.writeBytes(holdText + "\r\n");
                  d.close();
              }
          }
          catch (Exception e)
          {
              System.out.println("File note found");
          }
          textArea.requestFocus();
          save(filename);
      }
    }

    private void save(String filename) {
     setTitle(programName+ " "+filename);
     try
     {
         FileWriter out;
         out = new FileWriter(fn);
         out.write(textArea.getText());
         out.close();
     }
     catch (Exception err)
     {
         System.out.println("Error: "+ err);   
     }
     textChanged=false;
     saveMenu.setEnabled(false);
    }

    private void newFile() {
        if(textArea.getText().length() < 1){
            setTitle("Untitled-"+programName);
            textArea.setText("");
            textChanged=false;
        }
        else if (!textChanged){
            setTitle("Untitled-"+programName);
            textArea.setText("");
            textChanged=false;
        }
        else{
            int confirm = JOptionPane.showConfirmDialog(null,"Do you want to save before existing this program");
            if (confirm==JOptionPane.YES_OPTION)
            {
                if("".equals(filename)) {
                    saveAs();
                }
                else{
                    save(filename);
                }
                setTitle(programName);
                filename="";
                textArea.setText("");
                textChanged=false;
            }
            else if (confirm == JOptionPane.NO_OPTION)
               setTitle(programName);
               textArea.setText("");
               textChanged=false;
            
        }
    }
}
