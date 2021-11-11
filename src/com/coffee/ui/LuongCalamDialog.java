/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.coffee.ui;

/**
 *
 * @author Admin
 */
public class LuongCalamDialog extends javax.swing.JDialog {

    /** Creates new form LuongCalamDialog */
    public LuongCalamDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbltieude = new javax.swing.JLabel();
        pncalam = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        lblmacalam = new javax.swing.JLabel();
        lbltencalam = new javax.swing.JLabel();
        lblgioketthuc = new javax.swing.JLabel();
        lblgiobatdau = new javax.swing.JLabel();
        lbltongtien = new javax.swing.JLabel();
        txtmacalam = new javax.swing.JTextField();
        txttencalam = new javax.swing.JTextField();
        txtgiobd = new javax.swing.JTextField();
        txtgiokt = new javax.swing.JTextField();
        txttongtien = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldscalam = new javax.swing.JTable();
        btnmoi = new javax.swing.JButton();
        btnthem = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        pnluongnv = new javax.swing.JPanel();
        lbl2 = new javax.swing.JLabel();
        lblkiluong = new javax.swing.JLabel();
        lblmacalam1 = new javax.swing.JLabel();
        lblmanv = new javax.swing.JLabel();
        lbltongca = new javax.swing.JLabel();
        txtkiluong = new javax.swing.JTextField();
        txtmacalam1 = new javax.swing.JTextField();
        txttongcalam = new javax.swing.JTextField();
        lbltongluong = new javax.swing.JLabel();
        txttongluong = new javax.swing.JTextField();
        cbbnhanvien = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbldsluongnv = new javax.swing.JTable();
        btnmoi1 = new javax.swing.JButton();
        btnthem1 = new javax.swing.JButton();
        btnxoa1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbltieude.setBackground(new java.awt.Color(238, 207, 161));
        lbltieude.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbltieude.setForeground(new java.awt.Color(102, 0, 0));
        lbltieude.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltieude.setText("QUẢN LÍ THÔNG TIN SẢN PHẨM");

        pncalam.setBackground(new java.awt.Color(238, 207, 161));

        lbl1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lbl1.setForeground(new java.awt.Color(102, 51, 0));
        lbl1.setText("*QUẢN LÍ CA LÀM VIỆC NHÂN VIÊN");

        lblmacalam.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblmacalam.setForeground(new java.awt.Color(153, 0, 51));
        lblmacalam.setText("Mã ca làm");

        lbltencalam.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbltencalam.setForeground(new java.awt.Color(153, 0, 51));
        lbltencalam.setText("Tên ca làm");

        lblgioketthuc.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblgioketthuc.setForeground(new java.awt.Color(153, 0, 51));
        lblgioketthuc.setText("Giờ kết thúc");

        lblgiobatdau.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblgiobatdau.setForeground(new java.awt.Color(153, 0, 51));
        lblgiobatdau.setText("Giờ bắt đầu");

        lbltongtien.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbltongtien.setForeground(new java.awt.Color(153, 0, 51));
        lbltongtien.setText("Tổng tiền/ca");

        txtmacalam.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N

        txttencalam.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N

        txtgiobd.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N

        txtgiokt.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N

        txttongtien.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N

        tbldscalam.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        tbldscalam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã ca làm", "Tên ca làm", "Giờ bắt đầu", "Giờ kết thúc", "Tổng tiền/ ca"
            }
        ));
        tbldscalam.setRowHeight(25);
        jScrollPane1.setViewportView(tbldscalam);

        btnmoi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnmoi.setForeground(new java.awt.Color(153, 0, 51));
        btnmoi.setText("Mới");

        btnthem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnthem.setForeground(new java.awt.Color(153, 0, 51));
        btnthem.setText("Thêm");

        btnxoa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnxoa.setForeground(new java.awt.Color(153, 0, 51));
        btnxoa.setText("Xóa");

        javax.swing.GroupLayout pncalamLayout = new javax.swing.GroupLayout(pncalam);
        pncalam.setLayout(pncalamLayout);
        pncalamLayout.setHorizontalGroup(
            pncalamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pncalamLayout.createSequentialGroup()
                .addGroup(pncalamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pncalamLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pncalamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pncalamLayout.createSequentialGroup()
                                .addGroup(pncalamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbltencalam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblgiobatdau, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(pncalamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pncalamLayout.createSequentialGroup()
                                        .addComponent(txtgiobd, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblgioketthuc, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(pncalamLayout.createSequentialGroup()
                                        .addComponent(txttencalam)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(txtgiokt))
                            .addGroup(pncalamLayout.createSequentialGroup()
                                .addComponent(lblmacalam, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtmacalam, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pncalamLayout.createSequentialGroup()
                                .addComponent(lbltongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txttongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)))
                    .addGroup(pncalamLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(btnmoi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnthem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnxoa)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pncalamLayout.setVerticalGroup(
            pncalamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pncalamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pncalamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmacalam, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmacalam, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pncalamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pncalamLayout.createSequentialGroup()
                        .addComponent(lbltencalam, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pncalamLayout.createSequentialGroup()
                        .addComponent(txttencalam, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(pncalamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblgiobatdau, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblgioketthuc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtgiobd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtgiokt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(pncalamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pncalamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmoi, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnthem, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnluongnv.setBackground(new java.awt.Color(238, 207, 161));

        lbl2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lbl2.setForeground(new java.awt.Color(102, 51, 0));
        lbl2.setText("*QUẢN LÍ LƯƠNG NHÂN VIÊN");

        lblkiluong.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblkiluong.setForeground(new java.awt.Color(153, 0, 51));
        lblkiluong.setText("Kì lương");

        lblmacalam1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblmacalam1.setForeground(new java.awt.Color(153, 0, 51));
        lblmacalam1.setText("Mã ca làm");

        lblmanv.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblmanv.setForeground(new java.awt.Color(153, 0, 51));
        lblmanv.setText("Mã nhân viên");

        lbltongca.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbltongca.setForeground(new java.awt.Color(153, 0, 51));
        lbltongca.setText("Tổng ca làm trong tháng");

        txtkiluong.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N

        txtmacalam1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N

        txttongcalam.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N

        lbltongluong.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbltongluong.setForeground(new java.awt.Color(153, 0, 51));
        lbltongluong.setText("Tổng lương");

        txttongluong.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N

        cbbnhanvien.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        cbbnhanvien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tbldsluongnv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kì lương", "Mã ca làm", "Mã nhân viên", "Tổng ca trong tháng", "Tổng lương"
            }
        ));
        jScrollPane2.setViewportView(tbldsluongnv);

        btnmoi1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnmoi1.setForeground(new java.awt.Color(153, 0, 51));
        btnmoi1.setText("Mới");

        btnthem1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnthem1.setForeground(new java.awt.Color(153, 0, 51));
        btnthem1.setText("Thêm");

        btnxoa1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnxoa1.setForeground(new java.awt.Color(153, 0, 51));
        btnxoa1.setText("Xóa");

        javax.swing.GroupLayout pnluongnvLayout = new javax.swing.GroupLayout(pnluongnv);
        pnluongnv.setLayout(pnluongnvLayout);
        pnluongnvLayout.setHorizontalGroup(
            pnluongnvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnluongnvLayout.createSequentialGroup()
                .addGroup(pnluongnvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnluongnvLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnluongnvLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(pnluongnvLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnluongnvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnluongnvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnluongnvLayout.createSequentialGroup()
                                    .addComponent(lblmanv, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cbbnhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnluongnvLayout.createSequentialGroup()
                                    .addComponent(lbltongluong, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txttongluong, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnluongnvLayout.createSequentialGroup()
                                    .addGroup(pnluongnvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblkiluong, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblmacalam1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(pnluongnvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtmacalam1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                        .addComponent(txtkiluong))
                                    .addGap(16, 16, 16)))
                            .addGroup(pnluongnvLayout.createSequentialGroup()
                                .addComponent(lbltongca, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txttongcalam, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(pnluongnvLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(btnmoi1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnthem1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnxoa1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnluongnvLayout.setVerticalGroup(
            pnluongnvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnluongnvLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnluongnvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtkiluong, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblkiluong, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnluongnvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmacalam1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmacalam1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnluongnvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblmanv, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbnhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(pnluongnvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltongca, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttongcalam, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(pnluongnvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttongluong, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltongluong, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnluongnvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmoi1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnthem1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnxoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbltieude, javax.swing.GroupLayout.DEFAULT_SIZE, 1119, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pncalam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnluongnv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbltieude, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnluongnv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pncalam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswinglbl1dfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LuongCalamDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LuongCalamDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LuongCalamDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LuongCalamDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LuongCalamDialog dialog = new LuongCalamDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmoi;
    private javax.swing.JButton btnmoi1;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnthem1;
    private javax.swing.JButton btnxoa;
    private javax.swing.JButton btnxoa1;
    private javax.swing.JComboBox<String> cbbnhanvien;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lblgiobatdau;
    private javax.swing.JLabel lblgioketthuc;
    private javax.swing.JLabel lblkiluong;
    private javax.swing.JLabel lblmacalam;
    private javax.swing.JLabel lblmacalam1;
    private javax.swing.JLabel lblmanv;
    private javax.swing.JLabel lbltencalam;
    private javax.swing.JLabel lbltieude;
    private javax.swing.JLabel lbltongca;
    private javax.swing.JLabel lbltongluong;
    private javax.swing.JLabel lbltongtien;
    private javax.swing.JPanel pncalam;
    private javax.swing.JPanel pnluongnv;
    private javax.swing.JTable tbldscalam;
    private javax.swing.JTable tbldsluongnv;
    private javax.swing.JTextField txtgiobd;
    private javax.swing.JTextField txtgiokt;
    private javax.swing.JTextField txtkiluong;
    private javax.swing.JTextField txtmacalam;
    private javax.swing.JTextField txtmacalam1;
    private javax.swing.JTextField txttencalam;
    private javax.swing.JTextField txttongcalam;
    private javax.swing.JTextField txttongluong;
    private javax.swing.JTextField txttongtien;
    // End of variables declaration//GEN-END:variables

}
