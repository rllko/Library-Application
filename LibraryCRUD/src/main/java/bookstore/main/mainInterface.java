/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookstore.main;

import java.awt.Point;
import tablemodel.AuthorBookTableModel;
import tablemodel.AuthorPickerTableModel;

/**
 *
 * @author ricar
 */
public class mainInterface extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    AuthorBookTableModel abtm = new AuthorBookTableModel();
    AuthorPickerTableModel atm = new AuthorPickerTableModel();
    Point lastPoint = new Point(0, 0);

    public mainInterface() {

        initComponents();
        jbookList.setModel(abtm);
        jPanel1.getRootPane().requestFocus();
        jbookList.setFillsViewportHeight(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jAddContentPopup = new javax.swing.JPopupMenu();
        jContentAdd = new javax.swing.JMenuItem();
        jContentRemove = new javax.swing.JMenuItem();
        jFrameAddContent = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabelAddISBN = new javax.swing.JLabel();
        jTextNewBookTitle = new javax.swing.JTextField();
        jLabelTitle = new javax.swing.JLabel();
        lblAddAuthors = new javax.swing.JLabel();
        jLabelQuantity = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePickAuthor = new javax.swing.JTable();
        jTextAddNewISBN = new javax.swing.JTextField();
        jTextNewBookQuantity = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtTitle = new javax.swing.JTextField();
        txtAuthor = new javax.swing.JTextField();
        btnSearchByAuthor = new javax.swing.JButton();
        btnRestart = new javax.swing.JButton();
        btnSearchByTitle = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jbookList = new javax.swing.JTable();

        jContentAdd.setText("add element");
        jContentAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jContentAddActionPerformed(evt);
            }
        });
        jAddContentPopup.add(jContentAdd);

        jContentRemove.setText("delete record");
        jContentRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jContentRemoveActionPerformed(evt);
            }
        });
        jAddContentPopup.add(jContentRemove);

        jFrameAddContent.setTitle("Add");
        jFrameAddContent.setMinimumSize(new java.awt.Dimension(351, 300));
        jFrameAddContent.setResizable(false);

        jPanel4.setMinimumSize(new java.awt.Dimension(351, 300));
        jPanel4.setPreferredSize(new java.awt.Dimension(351, 300));

        jLabelAddISBN.setText("ISBN");

        jTextNewBookTitle.setMaximumSize(new java.awt.Dimension(64, 25));
        jTextNewBookTitle.setMinimumSize(new java.awt.Dimension(64, 25));
        jTextNewBookTitle.setPreferredSize(new java.awt.Dimension(64, 25));
        jTextNewBookTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNewBookTitleActionPerformed(evt);
            }
        });

        jLabelTitle.setText("Title");

        lblAddAuthors.setText("Authors");

        jLabelQuantity.setText("Quantity");

        jButton2.setText("submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTablePickAuthor.setModel(atm);
        jTablePickAuthor.setFillsViewportHeight(true);
        jTablePickAuthor.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTablePickAuthor.getTableHeader().setResizingAllowed(false);
        jTablePickAuthor.getTableHeader().setReorderingAllowed(false);
        jTablePickAuthor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePickAuthorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTablePickAuthor);

        jTextAddNewISBN.setMaximumSize(new java.awt.Dimension(64, 25));
        jTextAddNewISBN.setMinimumSize(new java.awt.Dimension(64, 25));
        jTextAddNewISBN.setPreferredSize(new java.awt.Dimension(64, 25));
        jTextAddNewISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAddNewISBNActionPerformed(evt);
            }
        });

        jTextNewBookQuantity.setMaximumSize(new java.awt.Dimension(64, 25));
        jTextNewBookQuantity.setMinimumSize(new java.awt.Dimension(64, 25));
        jTextNewBookQuantity.setPreferredSize(new java.awt.Dimension(64, 25));
        jTextNewBookQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNewBookQuantityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextNewBookQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextNewBookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextAddNewISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(jLabelTitle)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabelAddISBN)
                                        .addGap(53, 53, 53))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabelQuantity)
                                        .addGap(44, 44, 44)))))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAddAuthors)
                .addGap(104, 104, 104))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAddAuthors)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabelAddISBN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextAddNewISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelTitle)
                        .addGap(3, 3, 3)
                        .addComponent(jTextNewBookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelQuantity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextNewBookQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap())
        );

        javax.swing.GroupLayout jFrameAddContentLayout = new javax.swing.GroupLayout(jFrameAddContent.getContentPane());
        jFrameAddContent.getContentPane().setLayout(jFrameAddContentLayout);
        jFrameAddContentLayout.setHorizontalGroup(
            jFrameAddContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameAddContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jFrameAddContentLayout.setVerticalGroup(
            jFrameAddContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameAddContentLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Book Store");
        setResizable(false);

        jPanel1.setDoubleBuffered(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("BOOK STORE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        txtTitle.setText("search by title");
        txtTitle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTitleFocusGained(evt);
            }
        });
        txtTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTitleActionPerformed(evt);
            }
        });

        txtAuthor.setText("search by author");
        txtAuthor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAuthorFocusGained(evt);
            }
        });
        txtAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAuthorActionPerformed(evt);
            }
        });

        btnSearchByAuthor.setText("search");
        btnSearchByAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByAuthorActionPerformed(evt);
            }
        });

        btnRestart.setText("restart filters");
        btnRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartActionPerformed(evt);
            }
        });

        btnSearchByTitle.setText("search");
        btnSearchByTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByTitleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearchByTitle)
                .addGap(86, 86, 86)
                .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearchByAuthor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearchByAuthor)
                        .addComponent(btnRestart)
                        .addComponent(btnSearchByTitle))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(10, 10, 10))
        );

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseReleased(evt);
            }
        });

        jbookList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jbookList.setRowSelectionAllowed(false);
        jbookList.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jbookList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbookListMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbookListMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jbookList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1061, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchByAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByAuthorActionPerformed
        if (txtTitle.getText().isBlank() || txtTitle.getText().equals(
                "search by author")) {
            return;
        }
        abtm.searchByAuthor(txtAuthor.getText());
        jbookList.repaint();

    }//GEN-LAST:event_btnSearchByAuthorActionPerformed

    private void txtTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTitleActionPerformed

    private void txtTitleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTitleFocusGained
        txtTitle.setText("");
    }//GEN-LAST:event_txtTitleFocusGained

    private void txtAuthorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAuthorFocusGained
        txtAuthor.setText("");
    }//GEN-LAST:event_txtAuthorFocusGained

    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
        abtm.resetFilter();
        jbookList.repaint();
    }//GEN-LAST:event_btnRestartActionPerformed

    private void txtAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAuthorActionPerformed

    }//GEN-LAST:event_txtAuthorActionPerformed

    private void btnSearchByTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByTitleActionPerformed
        if (txtTitle.getText().isBlank() || txtTitle.getText().equals(
                "search by title")) {
            return;
        }
        abtm.searchByTitle(txtTitle.getText());
        jbookList.repaint();
    }//GEN-LAST:event_btnSearchByTitleActionPerformed

    private void jbookListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbookListMouseReleased
        if (evt.isPopupTrigger()) {
            jAddContentPopup.show(jbookList, evt.getX(), evt.getY());
            lastPoint = evt.getPoint();
        }

    }//GEN-LAST:event_jbookListMouseReleased

    private void jScrollPane1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseReleased
        if (evt.isPopupTrigger()) {
            jAddContentPopup.show(jScrollPane1, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jScrollPane1MouseReleased

    private void jContentAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jContentAddActionPerformed
        jFrameAddContent.setLocationRelativeTo(jContentAdd);
        jFrameAddContent.setVisible(true);
    }//GEN-LAST:event_jContentAddActionPerformed

    private void jContentRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jContentRemoveActionPerformed
        int rowAt = jbookList.rowAtPoint(lastPoint);
        abtm.deleteBook(rowAt);
        jbookList.repaint();
    }//GEN-LAST:event_jContentRemoveActionPerformed

    private void jTextNewBookTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNewBookTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNewBookTitleActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String isbn = jTextAddNewISBN.getText();
        String title = jTextNewBookTitle.getText();
        Integer quantity_available = Integer.valueOf(
                jTextNewBookQuantity.getText());

        int rowAt = jTablePickAuthor.rowAtPoint(lastPoint);
        int author_id = (int) jTablePickAuthor.getValueAt(rowAt, 0);

        abtm.addNewBook(isbn, title, quantity_available, author_id);
        jbookList.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbookListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbookListMouseClicked

    }//GEN-LAST:event_jbookListMouseClicked

    private void jTextAddNewISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAddNewISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAddNewISBNActionPerformed

    private void jTextNewBookQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNewBookQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNewBookQuantityActionPerformed

    private void jTablePickAuthorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePickAuthorMouseClicked
        lastPoint = evt.getPoint();
    }//GEN-LAST:event_jTablePickAuthorMouseClicked

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
            java.util.logging.Logger.getLogger(mainInterface.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainInterface.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainInterface.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainInterface.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRestart;
    private javax.swing.JButton btnSearchByAuthor;
    private javax.swing.JButton btnSearchByTitle;
    private javax.swing.JPopupMenu jAddContentPopup;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenuItem jContentAdd;
    private javax.swing.JMenuItem jContentRemove;
    private javax.swing.JFrame jFrameAddContent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAddISBN;
    private javax.swing.JLabel jLabelQuantity;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePickAuthor;
    private javax.swing.JTextField jTextAddNewISBN;
    private javax.swing.JTextField jTextNewBookQuantity;
    private javax.swing.JTextField jTextNewBookTitle;
    private javax.swing.JTable jbookList;
    private javax.swing.JLabel lblAddAuthors;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
