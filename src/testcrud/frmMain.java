/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcrud;

import com.sun.istack.internal.logging.Logger;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andini Novidayanti A
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtNIS = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtKelas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        rdPerempuan = new javax.swing.JRadioButton();
        rdLaki = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        txtTL = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txthobi = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtcita = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbData = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(null);

        jLabel3.setText("ISIAN DATA SISWA");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 10, 120, 14);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 70, 310, 30);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(null);

        jLabel4.setText("NIS");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(10, 10, 70, 20);
        jPanel3.add(txtNIS);
        txtNIS.setBounds(10, 30, 130, 30);

        jLabel5.setText("NAMA");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(10, 60, 50, 20);

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        jPanel3.add(txtNama);
        txtNama.setBounds(10, 80, 280, 30);

        jLabel6.setText("JENIS KELAMIN");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(10, 120, 90, 20);

        jLabel7.setText("KELAS");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(10, 180, 100, 14);
        jPanel3.add(txtKelas);
        txtKelas.setBounds(10, 200, 160, 30);

        jLabel8.setText("EMAIL");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(10, 240, 90, 14);
        jPanel3.add(txtEmail);
        txtEmail.setBounds(10, 260, 220, 30);

        buttonGroup1.add(rdPerempuan);
        rdPerempuan.setText("PEREMPUAN");
        jPanel3.add(rdPerempuan);
        rdPerempuan.setBounds(10, 150, 110, 23);

        buttonGroup1.add(rdLaki);
        rdLaki.setText("LAKI LAKI");
        jPanel3.add(rdLaki);
        rdLaki.setBounds(150, 150, 130, 23);

        jLabel9.setText("ALAMAT");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(10, 300, 150, 14);

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane1.setViewportView(txtAlamat);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 320, 270, 80);

        jLabel10.setText("TANGGAL LAHIR");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(10, 410, 90, 14);
        jPanel3.add(txtTL);
        txtTL.setBounds(10, 430, 270, 40);

        jLabel11.setText("HOBI");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(10, 480, 50, 14);
        jPanel3.add(txthobi);
        txthobi.setBounds(10, 500, 270, 30);

        jLabel12.setText("CITA - CITA");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(10, 540, 80, 14);
        jPanel3.add(txtcita);
        txtcita.setBounds(10, 560, 270, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 110, 310, 630);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setLayout(null);

        tbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIS", "NAMA", "JENIS KELAMIN", "KELAS", "EMAIL", "ALAMAT", "TANGGAL LAHIR", "HOBI", "CITA _ CITA"
            }
        ));
        jScrollPane2.setViewportView(tbData);

        jPanel5.add(jScrollPane2);
        jScrollPane2.setBounds(10, 10, 810, 340);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(330, 200, 850, 510);

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setLayout(null);

        btnAdd.setText("SAVE");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel6.add(btnAdd);
        btnAdd.setBounds(10, 20, 80, 23);

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel6.add(btnDelete);
        btnDelete.setBounds(100, 20, 90, 23);

        btnEdit.setText("CLEAR");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel6.add(btnEdit);
        btnEdit.setBounds(200, 20, 80, 23);

        btnRefresh.setText("REFRESH");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jPanel6.add(btnRefresh);
        btnRefresh.setBounds(290, 20, 100, 23);

        Reset.setText("EDIT");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel6.add(Reset);
        Reset.setBounds(400, 20, 90, 23);

        jPanel1.add(jPanel6);
        jPanel6.setBounds(500, 120, 510, 60);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("FORM BIODATA SISWA SISWI SMK TELKOM ");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(10, -10, 570, 50);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("The Real Informatic School");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(10, 20, 320, 30);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(10, 10, 880, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if ("".equals(txtNIS.getText()) || "".equals(txtAlamat.getText()) ||"".equals(txtKelas.getText()) ||"".equals(txtNama.getText())||"".equals(txtEmail.getText()) ||"".equals(txtTL.getText())||"".equals(txthobi.getText())||"".equals(txtcita.getText())) {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data","Error", JOptionPane.WARNING_MESSAGE);
        } else {
            String JK = "";
                if (rdLaki.isSelected()){
                    JK = "L";
                }else{
                    JK ="P";
                }
            String SQL = "INSERT INTO t_siswa VALUES('"+txtNIS.getText()+"','"+txtNama.getText()+"','"+JK+"','"+txtKelas.getText()+"','"+txtEmail.getText()+"','"+txtAlamat.getText()+"','"+txtTL.getText()+"','"+txthobi.getText
                    ()+"','"+txtcita.getText()+"')";
            int status = KoneksiDB.execute(SQL);
            if (status == 1){
                    JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan","Sukses", JOptionPane.WARNING_MESSAGE);
                    selectData();
            } else{ 
                JOptionPane.showMessageDialog(this,"Data Gagal Ditambahkan","Sukses", JOptionPane.WARNING_MESSAGE);
            }
        }  
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int baris = tbData.getSelectedRow();
        if (baris != -1){
            String NIS = tbData.getValueAt(baris, 0).toString();
            String SQL ="DELETE FROM t_siswa WHERE NIS='"+NIS+"'";
            int status = KoneksiDB.execute(SQL);
            if (status==1){
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus","Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,"DAata gagal dihapus", "Galal", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih dahulu","Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        txtNama.setText("");
        txtNIS.setText("");
        txtKelas.setText("");
        buttonGroup1.clearSelection();
        txtEmail.setText("");
        txtAlamat.setText(""); 
        txtTL.setText("");
        txthobi.setText("");
        txtcita.setText("");
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        selectData();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        if ("".equals(txtNIS.getText()) || "".equals(txtAlamat.getText())||"".equals(txtKelas.getText())||"".equals(txtNama.getText())||"".equals(txtEmail.getText())||"".equals(txtTL.getText())||"".equals(txthobi.getText())||"".equals(txtcita.getText())){
            JOptionPane.showMessageDialog(this,"HArap Lengkapi Data","Error", JOptionPane.WARNING_MESSAGE);           
        } else {
            String JK = "";
            if (rdLaki.isSelected()){
                JK = "L";
            } else {
                JK = "p";
            }
        String SQL = "UPDATE t_siswa SET" + "WHERE NamaSiswa='"+txtNama.getText()+"',"+"WHERE JenisKelamin='"+JK+"',"+ "WHERE Kelas='"+txtKelas.getText()+"',"+"WHERE Email='"+txtEmail.getText()+"',"+"WHERE Alamat='"+txtAlamat.getText()+"',"+"WHERE NIS='"+txtNIS.getText()+"',"+"WHERE Tempat Lahir='"+txtTL.getText()+"',"+"WHERE Hobi='"+txthobi.getText()+"',"+"WHERE Cita Cita='"+txtcita.getText()+"'";
        int status = KoneksiDB.execute(SQL);
        if (status == 0){
            JOptionPane.showMessageDialog(this,"Data berhasil diupdate","Sukses", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Data gagal diupdate", "Sukses", JOptionPane.WARNING_MESSAGE);
        }
        }
    }//GEN-LAST:event_ResetActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reset;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnRefresh;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdLaki;
    private javax.swing.JRadioButton rdPerempuan;
    private javax.swing.JTable tbData;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtKelas;
    private javax.swing.JTextField txtNIS;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTL;
    private javax.swing.JTextField txtcita;
    private javax.swing.JTextField txthobi;
    // End of variables declaration//GEN-END:variables

    private void selectData() {
        String kolom[] = {"NIS","NamaSiswa","JenisKelamin","Kelas","Email","Alamat","TanggalLahir","Hobi","Cita-Cita"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM t_siswa";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
    try {
        while(rs.next()) {
            String NIS = rs.getString(1);
            String NamaSiswa = rs.getString(2);
            String JenisKelamin = "";
            if ("L".equals(rs.getString(3))){
                JenisKelamin = "Laki-Laki";                
            }else {
                JenisKelamin = "Perempuan";
            }
            String Kelas = rs.getString(4);
            String Email = rs.getString(5);
            String Alamat = rs.getString(6);
            String TanggalLahir = rs.getString(7);
            String Hobi = rs.getString(8);
            String Cita = rs.getString(9);
            String data[] ={NIS,NamaSiswa,JenisKelamin,Kelas,Email,Alamat,TanggalLahir,Hobi,Cita};
            dtm.addRow(data);
        }
    } catch (SQLException ex) {
        Logger.getLogger(frmMain.class).log(Level.SEVERE, null, ex);
    }
    tbData.setModel(dtm);
    }
}
