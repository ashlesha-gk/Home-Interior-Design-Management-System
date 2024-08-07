/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package home;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
/**
 *
 * @author ashle
 */
public class supplier extends javax.swing.JFrame {
    
    private static final String username = "root";
    private static final String password = "mysqldbms04";
    private static final String HomeInterior = "jdbc:mysql://localhost:3306/home";
    
    Connection s = null;
    PreparedStatement pst = null;
    ResultSet rs=null;
    int q, i, id, deleteItem;
    
    public supplier() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    //===============================================Function=====================================================
    
    public void upDateDB()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            s = DriverManager.getConnection(HomeInterior,username,password);
            pst = s.prepareStatement("select * from supplier");
            
            rs=pst.executeQuery();
            ResultSetMetaData sData = rs.getMetaData();
            
            q = sData.getColumnCount();
            
            DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
            RecordTable.setRowCount(0);
            
            while(rs.next()) {
                Vector columnData = new Vector();
                
                for (i = 1;i <= q; i++)
                {
                    columnData.add(rs.getString("id"));
                    columnData.add(rs.getString("SUPPLIER_ID"));
                    columnData.add(rs.getString("S_NAME"));
                    columnData.add(rs.getString("S_CONTACT"));
                    columnData.add(rs.getString("S_ADDRESS"));
                }
                RecordTable.addRow(columnData);
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    //===============================================End-Function=========================================================
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jbtnInsert = new javax.swing.JButton();
        jbtnUpdate = new javax.swing.JButton();
        jbtnPrint = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtId = new javax.swing.JTextField();
        jtxtName = new javax.swing.JTextField();
        jtxtContact = new javax.swing.JTextField();
        jtxtAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ashle\\Downloads\\home interior\\suppliers.png")); // NOI18N
        jLabel1.setText("SUPPLIERS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 18, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "SUPPLIER_ID", "S_NAME", "S_CONTACT", "S_ADDRESS"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 80, 1186, -1));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ashle\\Downloads\\home interior\\close.jpg")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1476, 0, 31, 24));

        jbtnInsert.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnInsert.setText("INSERT");
        jbtnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(1358, 107, 101, -1));

        jbtnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnUpdate.setText("UPDATE");
        jbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1358, 193, -1, -1));

        jbtnPrint.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnPrint.setText("PRINT");
        jbtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrintActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(1358, 279, 101, -1));

        jbtnReset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnReset.setText("RESET");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(1358, 365, 101, -1));

        jbtnDelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnDelete.setText("DELETE");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1358, 454, 101, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Supplier ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 525, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SName");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 525, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SContact");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(791, 525, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SAddress");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1134, 525, -1, -1));
        getContentPane().add(jtxtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 562, 160, -1));

        jtxtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNameActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 562, 156, -1));
        getContentPane().add(jtxtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(791, 562, 157, -1));
        getContentPane().add(jtxtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(1134, 562, 136, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\ashle\\Downloads\\home interior\\spage.jpg")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -4, 1530, 1090));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    int yes = JOptionPane.showConfirmDialog(this,"Are you sure?","Exit",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(yes==JOptionPane.YES_OPTION)
            new homepage().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtxtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNameActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
    jtxtId.setText("");
    jtxtName.setText("");
    jtxtContact.setText("");
    jtxtAddress.setText("");
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnInsertActionPerformed
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        s=DriverManager.getConnection(HomeInterior,username,password);
        pst = s.prepareStatement("insert into SUPPLIER(SUPPLIER_ID,S_NAME,S_CONTACT,S_ADDRESS)values(?,?,?,?)");
        
        pst.setString(1, jtxtId.getText());
        pst.setString(2, jtxtName.getText());
        pst.setString(3, jtxtContact.getText());
        pst.setString(4, jtxtAddress.getText());
        
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this,"Record Added");
        upDateDB();
    }
    
    catch(ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(supplier.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
    } catch(SQLException ex) {
        java.util.logging.Logger.getLogger(supplier.class.getName()).log(java.util.logging.Level.SEVERE,null,ex); 
    }//GEN-LAST:event_jbtnInsertActionPerformed
    
    
}
    
    private void jbtnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrintActionPerformed
       MessageFormat header = new MessageFormat("Printing in progress");
       MessageFormat footer = new MessageFormat("Page (0, number, integer)");

       try
       {
             jTable1.print(JTable.PrintMode.NORMAL,header,footer);
       }
    
       catch(java.awt.print.PrinterException e)
       {
             System.err.format("No Printer Found", e.getMessage());
       }
    }//GEN-LAST:event_jbtnPrintActionPerformed

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
    
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();
        
        try
        {
                    id = Integer.parseInt(RecordTable.getValueAt(SelectedRows, 0).toString());
            
                    deleteItem = JOptionPane.showConfirmDialog(null,"Confirm if you want to delete item", "Warning",JOptionPane.YES_NO_OPTION);
            if (deleteItem == JOptionPane.YES_NO_OPTION)
            {
                Class.forName("com.mysql.jdbc.Driver");
              s = DriverManager.getConnection(HomeInterior,username,password);
              pst = s.prepareStatement("delete from supplier where id=?");
              
              pst.setInt(1,id);
              pst.executeUpdate();
              JOptionPane.showMessageDialog(this, "Record deleted");
              upDateDB();
              
             jtxtId.setText("");
             jtxtName.setText("");
             jtxtContact.setText("");
             jtxtAddress.setText("");
            }
        }
        
        catch(ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        } catch(SQLException ex) {
            System.err.println(ex);
        }
    }//GEN-LAST:event_jbtnDeleteActionPerformed

    private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateActionPerformed
    try
        {
            Class.forName("com.mysql.jdbc.Driver");
            s = DriverManager.getConnection(HomeInterior,username,password);
            pst = s.prepareStatement("update supplier set SUPPLIER_ID=?, S_NAME=?, S_CONTACT=?, S_ADDRESS=? where id=?");

            pst.setString(1, jtxtId.getText());
            pst.setString(2, jtxtName.getText());
            pst.setString(3, jtxtContact.getText());
            pst.setString(4, jtxtAddress.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Updated");
            upDateDB();
        }
         catch(ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        } catch(SQLException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_jbtnUpdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();
        
        jtxtId.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        jtxtName.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
        jtxtContact.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
        jtxtAddress.setText(RecordTable.getValueAt(SelectedRows, 4).toString());      
    }//GEN-LAST:event_jTable1MouseClicked


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
            java.util.logging.Logger.getLogger(supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new supplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnInsert;
    private javax.swing.JButton jbtnPrint;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JTextField jtxtAddress;
    private javax.swing.JTextField jtxtContact;
    private javax.swing.JTextField jtxtId;
    private javax.swing.JTextField jtxtName;
    // End of variables declaration//GEN-END:variables
}