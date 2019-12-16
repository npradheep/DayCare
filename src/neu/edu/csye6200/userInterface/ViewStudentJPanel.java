/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neu.edu.csye6200.userInterface;

import java.awt.CardLayout;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import neu.edu.csye6200.model.Rules;
import neu.edu.csye6200.model.Student;

/**
 *
 * @author 15085
 */
public class ViewStudentJPanel extends javax.swing.JPanel {
    private JPanel  userProcessJPanel;
    public ViewStudentJPanel(JPanel  userProcessJPanel) {
        initComponents();
        this.userProcessJPanel = userProcessJPanel;
    }

    public JTable getTblStudents() {
        return tblStudents;
    }

    public void setTblStudents(JTable tblStudents) {
        this.tblStudents = tblStudents;
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
        tblStudents = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblTeacher = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTeacherRecord = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblStudentRecordForTeacher = new javax.swing.JTable();
        btnStudenAssignedToATeacher = new javax.swing.JButton();
        textFieldStudentsSize = new javax.swing.JTextField();
        textFieldMaxAge = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textFieldMinAge1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textFieldTeachersSize = new javax.swing.JTextField();
        textFieldClassRoomName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        tblStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FirstName", "LastName", "Age", "StudentID"
            }
        ));
        jScrollPane1.setViewportView(tblStudents);

        btnBack.setBackground(new java.awt.Color(153, 255, 255));
        btnBack.setText("<Back ");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblTeacher.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTeacher.setForeground(new java.awt.Color(0, 51, 153));
        lblTeacher.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTeacher.setText("Teacher Details");

        tblTeacherRecord.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Register Time", "Teacher Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblTeacherRecord);

        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Details");

        tblStudentRecordForTeacher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student First Name", "Student Lat Name", "Student Id", "Teacher First Name"
            }
        ));
        jScrollPane3.setViewportView(tblStudentRecordForTeacher);

        btnStudenAssignedToATeacher.setBackground(new java.awt.Color(102, 255, 255));
        btnStudenAssignedToATeacher.setForeground(new java.awt.Color(0, 0, 0));
        btnStudenAssignedToATeacher.setText("Students Assigned to a Single Teacher");

        textFieldStudentsSize.setEditable(false);

        textFieldMaxAge.setEditable(false);

        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("Min Age");

        jLabel4.setForeground(new java.awt.Color(0, 51, 153));
        jLabel4.setText("MaxAge");

        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("Capactiy Of Students");

        textFieldMinAge1.setEditable(false);

        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("Capactiy Of Teachers");

        textFieldTeachersSize.setEditable(false);

        textFieldClassRoomName.setEditable(false);
        textFieldClassRoomName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textFieldClassRoomName.setForeground(new java.awt.Color(0, 51, 153));
        textFieldClassRoomName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(128, 128, 128)
                        .addComponent(textFieldClassRoomName, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldMinAge1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldMaxAge, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnStudenAssignedToATeacher)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldStudentsSize, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldTeachersSize, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(textFieldClassRoomName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldMaxAge, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldMinAge1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldStudentsSize, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldTeachersSize, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addComponent(lblTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnStudenAssignedToATeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessJPanel.remove(this);
        CardLayout layout = (CardLayout) userProcessJPanel.getLayout();
        layout.previous(userProcessJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    public JTable getTblTeacherRecord() {
        return tblTeacherRecord;
    }

   

    public JPanel getUserProcessJPanel() {
        return userProcessJPanel;
    }

    public void setUserProcessJPanel(JPanel userProcessJPanel) {
        this.userProcessJPanel = userProcessJPanel;
    }

    public JButton getBtnStudenAssignedToATeacher() {
        return btnStudenAssignedToATeacher;
    }

    public JTable getTblStudentRecordForTeacher() {
        return tblStudentRecordForTeacher;
    }

    public JTextField getTextFieldClassRoomName() {
        return textFieldClassRoomName;
    }

    public JTextField getTextFieldMaxAge() {
        return textFieldMaxAge;
    }

    public JTextField getTextFieldMinAge1() {
        return textFieldMinAge1;
    }

    public JTextField getTextFieldStudentsSize() {
        return textFieldStudentsSize;
    }

    public JTextField getTextFieldTeachersSize() {
        return textFieldTeachersSize;
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnStudenAssignedToATeacher;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblTeacher;
    private javax.swing.JTable tblStudentRecordForTeacher;
    private javax.swing.JTable tblStudents;
    private javax.swing.JTable tblTeacherRecord;
    private javax.swing.JTextField textFieldClassRoomName;
    private javax.swing.JTextField textFieldMaxAge;
    private javax.swing.JTextField textFieldMinAge1;
    private javax.swing.JTextField textFieldStudentsSize;
    private javax.swing.JTextField textFieldTeachersSize;
    // End of variables declaration//GEN-END:variables
}