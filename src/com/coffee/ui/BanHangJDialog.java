/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffee.ui;

import com.itextpdf.text.*;
import com.coffee.dao.KhachHangDAO;
import com.coffee.dao.KhuyenMaiDAO;
import com.coffee.dao.LoaiSanPhamDAO;
import com.coffee.dao.NhanVienDAO;
import com.coffee.dao.SanPhamDAO;
import com.coffee.entity.KhachHang;
import com.coffee.entity.KhuyenMai;
import com.coffee.entity.LoaiSanPham;
import com.coffee.entity.NhanVien;
import com.coffee.entity.SanPham;
import com.coffee.utils.Auth;
import com.coffee.utils.MsgBox;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MyLaptop
 */
public class BanHangJDialog extends javax.swing.JDialog {
//    public static NhanVien user;
//    String maNV= "";
    /**
     * Creates new form BanHangJDialog
     */
    public BanHangJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
        
//        lblMaNV.setText(""+Auth.user.getMaNV());
    }
    void inbill() throws FileNotFoundException, DocumentException{
                int codeno;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbUrl = "jdbc:sqlserver://localhost:1433;database=QL_coffee_Group2_update;user=sa;password=123";
            Connection con = DriverManager.getConnection(dbUrl);
            Statement s = con.createStatement();
            String select = "Select  Max(MaHD) from HoaDon";
            ResultSet rs = s.executeQuery(select);
            rs.next();
            codeno = rs.getInt(1);
        } catch (Exception e) {
            codeno = 0;
        }
        codeno++;
        //THEM HOA DON VAO SQL SERVER DE SAU NAY CAP NHAT LAI DUOC MaHD
        Date aa = new Date();
        SimpleDateFormat cc = new SimpleDateFormat(" hh:mm:ss ");
        SimpleDateFormat bb = new SimpleDateFormat(" MM.dd.yyyy ");

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbUrl = "jdbc:sqlserver://localhost:1433;database=QL_coffee_Group2_update;user=sa;password=123";
            Connection con = DriverManager.getConnection(dbUrl);
            PreparedStatement s = con.prepareStatement("insert into HoaDon values(" + codeno + ",'" + lblMaNV.getText() + "'," + codeno + ",'"+lblNgayInHD.getText()+"'," + lblTongTien.getText() + "," + 1000 + "," + null +","+500000+","+20000+","+null+ ");");
            s.executeUpdate();
//            JOptionPane.showMessageDialog(this, "Xuất hóa đơn", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            con.close();
            //
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, " xuất hóa đơn", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

        }
        String tensp = "";
        String sl = "";
//        String dg = "";
        String tt = "";
        String nhanvien = "";
        String ngay = lblNgayInHD.getText();
        
        String gio = lblGio.getText();
        DefaultTableModel def = (DefaultTableModel) tblOrder.getModel();
        int i = def.getRowCount();

        String str2 = "";
        for (int k = 0; k < i; k++) {
            tensp = def.getValueAt(k, 0).toString();
            sl = def.getValueAt(k, 1).toString();
//            dg = def.getValueAt(k, 2).toString();
            tt = def.getValueAt(k, 2).toString();
            String str22 = "\t " + tensp + "\t   " + sl + "\t\t" + tt + "   \n";
            str2 += str22;
        }

        String str1 = "-------------------------------------------------------------------------------------------------------\n"
                + "\t\t\t    Coffee Group2			  \n"
                +"\t Innovation Building, Tân Chánh Hiệp, q12, Hồ Chí Minh\n"
                +"\n"
                + "\t\t\t Hóa đơn thanh toán 			  \n"
                + "\t\t\t Số hóa đơn : " + codeno + "			  \n"
                + "\t\t Ngày " + ngay + " \t " + gio + "                 \n\n"
                + "\t Tên sản phẩm\tSố lượng\t\tThành tiền\n";
        String str3 ="\n" 
                +"\t\t\t\t   Tổng thanh toán:\t  " + lblTongTien.getText() + "				  \n"
                + "\t\t\t\t   Tên thu ngân: \t  " + lblMaNV.getText() + "				  \n"
                + "\t\t\t\t   Tên khách hàng : \t  " + cboTenKH.getSelectedItem()+ "				  \n"
                + "-------------------------------------------------------------------------------------------------------\n"
                + "\t\t Cảm ơn và hẹn gặp lại Quý khách <3";

        Document doc = new Document();
        PdfWriter.getInstance(doc, new FileOutputStream("bill.pdf"));
        doc.open();
        doc.add(new Paragraph(str1 + str2 + str3));
        doc.close();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNgayInHD = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblMaNV = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblMaHD = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboTenKH = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        lblGio = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cboLoaiSP = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblThucDon = new javax.swing.JTable();
        btnChuyen = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblMaSP = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblDonGia = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        btnXoaMon = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnThanhToan = new javax.swing.JButton();
        lblTongTien = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboChietKhau = new javax.swing.JComboBox<>();
        lblDiemTichLuy = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BÁN HÀNG");

        jPanel1.setBackground(new java.awt.Color(238, 207, 161));

        jPanel2.setBackground(new java.awt.Color(238, 207, 161));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "HÓA ĐƠN", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setText("Ngày In HĐ:");

        lblNgayInHD.setText("07/11/2021  8:00PM");

        jLabel3.setText("Mã nhân viên:");

        lblMaNV.setText("nv01-Hoa");

        jLabel5.setText("Mã HĐ:");

        lblMaHD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMaHD.setForeground(new java.awt.Color(255, 0, 51));
        lblMaHD.setText("36");

        jLabel2.setText("Tên khách hàng:");

        cboTenKH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "anonymous" }));
        cboTenKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTenKHActionPerformed(evt);
            }
        });

        jLabel9.setText("Giờ:");

        lblGio.setText("07/11/2021  8:00PM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNgayInHD, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboTenKH, 0, 141, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblMaHD))
                                    .addComponent(lblGio, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNgayInHD, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblGio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cboTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(lblMaHD))
                .addContainerGap())
        );

        jSeparator1.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));

        jPanel3.setBackground(new java.awt.Color(238, 207, 161));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "THỰC ĐƠN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel7.setText("Loại sản phẩm:");

        cboLoaiSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLoaiSPActionPerformed(evt);
            }
        });

        tblThucDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Đơn giá"
            }
        ));
        jScrollPane2.setViewportView(tblThucDon);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 41, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnChuyen.setText("=>");
        btnChuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(238, 207, 161));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "ORDER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel8.setText("Mã sản phẩm:");

        jLabel10.setText("Đơn giá:");

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên sản phẩm", "Số lượng", "Thành tiền"
            }
        ));
        tblOrder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblOrderKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tblOrder);

        btnXoaMon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coffee/icon/Delete.png"))); // NOI18N
        btnXoaMon.setText("Xóa món");
        btnXoaMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaMonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lblDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lblMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnXoaMon))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                            .addComponent(lblMaSP)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnXoaMon)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDonGia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setText("TỔNG TIỀN:");

        btnThanhToan.setBackground(new java.awt.Color(0, 51, 204));
        btnThanhToan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnThanhToan.setForeground(new java.awt.Color(255, 255, 255));
        btnThanhToan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coffee/icon/Money.png"))); // NOI18N
        btnThanhToan.setText("Thanh Toán");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        lblTongTien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel4.setText("Điểm tích lũy:");

        jLabel6.setText("Chiết khấu:");

        cboChietKhau.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboChietKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboChietKhauActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnThanhToan)
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel4))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboChietKhau, 0, 124, Short.MAX_VALUE)
                                    .addComponent(lblDiemTichLuy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel4))
                            .addComponent(lblDiemTichLuy, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboChietKhau, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTongTien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(btnThanhToan))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnChuyen)
                        .addGap(129, 129, 129))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboLoaiSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLoaiSPActionPerformed
        // TODO add your handling code here:
        this.chonLoaiSanPham();
    }//GEN-LAST:event_cboLoaiSPActionPerformed

    private void btnChuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenActionPerformed
        // TODO add your handling code here:
        int row = tblThucDon.getSelectedRow();
        System.out.println("san pham"+row);
        if(row<0){
            MsgBox.alert(this, "Vui lòng chọn ít nhất một sản phẩm!");
        }
        else{
//            int[] selectedItems =tblThucDon.getSelectedRows();
//            for (Object item : selectedItems) {
//                tblOrder.getSelectedRows();
//                tblThucDon.remove(row);
//            }
              int selectedRowIndex = tblThucDon.getSelectedRow();
              int[] selectedColIndex = tblThucDon.getSelectedColumns();
              System.out.println("column"+selectedColIndex[0]);
              DefaultTableModel curriculumSubjectsModel = (DefaultTableModel)tblOrder.getModel();
              curriculumSubjectsModel.addRow(new Object[]
                {tblThucDon.getValueAt(selectedRowIndex, 1),
                 
                });
//              tblOrder.setModel(curriculumSubjectsModel);
                lblMaSP.setText(tblThucDon.getValueAt(selectedRowIndex, 0).toString());
                lblDonGia.setText(tblThucDon.getValueAt(selectedRowIndex, 2).toString());
        }
    }//GEN-LAST:event_btnChuyenActionPerformed

    private void btnXoaMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaMonActionPerformed
        // TODO add your handling code here:
        int row = tblOrder.getSelectedRow();
        
        if(row<0){
            MsgBox.alert(this, "Chưa chọn dòng nào trong bảng!");
            return;
        }
        if(row>=0){   
//            System.out.println("Thuong");
            DefaultTableModel tbl = (DefaultTableModel)tblOrder.getModel();
//            
//                  int tiensaukhixoa;
//                  String thanhtien = tbl.getValueAt(row, 2).toString();
//                  int ttien = Integer.parseInt(thanhtien);
//                  int tienbandau = Integer.parseInt(lblTongTien.getText());
//                  tiensaukhixoa = tienbandau - ttien;
//                 lblTongTien.setText("" + tiensaukhixoa);
//
//                int sum = 0;
//                for (int i = 0; i < tblOrder.getRowCount(); i++) {
//                    sum += Double.valueOf(tblOrder.getValueAt(i, 2).toString());
//                }
                  
                  tbl.removeRow(row);
                  MsgBox.alert(this, "Xoá thành công món được chọn");
        }
        if(row>=0){
//                  int sum = Integer.parseInt(lblTongTien.getText());
                    int sum = 0;
                  for (int i = 0; i < tblOrder.getRowCount(); i++) {
                    sum -= Double.valueOf(tblOrder.getValueAt(i, 2).toString());
                }
                 lblTongTien.setText(""+ sum);
                 if (lblTongTien.getText().equals("0")) {
                 lblTongTien.setText("");
        }
        }

    }//GEN-LAST:event_btnXoaMonActionPerformed

    private void tblOrderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblOrderKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            System.out.println("ok");
            DefaultTableModel tbl = (DefaultTableModel)tblOrder.getModel();
            int row = tblOrder.getSelectedRow();
            tbl.setValueAt(Float.valueOf(lblDonGia.getText())*Integer.valueOf((String) tblOrder.getValueAt(row, 1)), row, 2);
            
//            for(row=0; row<10; row++){
////               lblTongTien.setText(Float.valueOf((String)tblOrder.getValueAt(row, 2))+Float.valueOf((String)tblOrder.getValueAt(row++, 2)).toString());
////                lblTongTien.setText(tblOrder.getValueAt(row, 2)+tblOrder.getValueAt(row+1, 2).toString());   
//                Integer a =(Integer) tblOrder.getValueAt(row, 2);
//                Integer b =(Integer) tblOrder.getValueAt(row+1, 2);
//                Integer c = a+b;
//                lblTongTien.setText(""+c);
//                lblTongTien.setText(tblOrder.getValueAt(row, 2)+tblOrder.getValueAt(row+1, 2).toString()); 
//                row++;     
//        }
                  lblTongTien.setText(String.valueOf(tinhTien()));
                  
                  
        }
    }//GEN-LAST:event_tblOrderKeyReleased

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed

        try {
            //        int codeno;
//        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            String dbUrl = "jdbc:sqlserver://localhost:1433;database=QL_coffee_Group2_update;user=sa;password=123";
//            Connection con = DriverManager.getConnection(dbUrl);
//            Statement s = con.createStatement();
//            String select = "Select  Max(MaHD) from HoaDon";
//            ResultSet rs = s.executeQuery(select);
//            rs.next();
//            codeno = rs.getInt(1);
//        } catch (Exception e) {
//            codeno = 0;
//        }
//        codeno++;
//        //THEM HOA DON VAO SQL SERVER DE SAU NAY CAP NHAT LAI DUOC MaHD
//        Date aa = new Date();
//        SimpleDateFormat cc = new SimpleDateFormat(" hh:mm:ss ");
//        SimpleDateFormat bb = new SimpleDateFormat(" MM.dd.yyyy ");
//
//        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            String dbUrl = "jdbc:sqlserver://localhost:1433;database=QL_coffee_Group2_update;user=sa;password=123";
//            Connection con = DriverManager.getConnection(dbUrl);
//            PreparedStatement s = con.prepareStatement("insert into HoaDon values(" + codeno + ",'" + lblMaNV.getText() + "'," + codeno + ",'"+lblNgayInHD.getText()+"'," + lblTongTien.getText() + "," + 1000 + "," + null +","+500000+","+20000+","+null+ ");");
//            s.executeUpdate();
////            JOptionPane.showMessageDialog(this, "Xuất hóa đơn", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
//            con.close();
//            //
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(this, " xuất hóa đơn", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
//
//        }
//        String tensp = "";
//        String sl = "";
////        String dg = "";
//        String tt = "";
//        String nhanvien = "";
//        String ngay = lblNgayInHD.getText();
//        
//        String gio = lblGio.getText();
//        DefaultTableModel def = (DefaultTableModel) tblOrder.getModel();
//        int i = def.getRowCount();
//
//        String str2 = "";
//        for (int k = 0; k < i; k++) {
//            tensp = def.getValueAt(k, 0).toString();
//            sl = def.getValueAt(k, 1).toString();
////            dg = def.getValueAt(k, 2).toString();
//            tt = def.getValueAt(k, 2).toString();
//            String str22 = "\t " + tensp + "\t   " + sl + "\t\t" + tt + "   \n";
//            str2 += str22;
//        }
//
//        String str1 = "-------------------------------------------------------------------------------------------------------\n"
//                + "\t\t\t    Coffee Group2			  \n"
//                +"\t Innovation Building, Tân Chánh Hiệp, q12, Hồ Chí Minh\n"
//                +"\n"
//                + "\t\t\t Hóa đơn thanh toán 			  \n"
//                + "\t\t\t Số hóa đơn : " + codeno + "			  \n"
//                + "\t\t Ngày " + ngay + " \t " + gio + "                 \n\n"
//                + "\t Tên sản phẩm\tSố lượng\t\tThành tiền\n";
//        String str3 ="\n" 
//                +"\t\t\t\t   Tổng thanh toán:\t  " + lblTongTien.getText() + "				  \n"
//                + "\t\t\t\t   Tên thu ngân: \t  " + lblMaNV.getText() + "				  \n"
//                + "\t\t\t\t   Tên khách hàng : \t  " + cboTenKH.getSelectedItem()+ "				  \n"
//                + "-------------------------------------------------------------------------------------------------------\n"
//                + "\t\t Cảm ơn và hẹn gặp lại Quý khách <3";
//        
//        File f = new File("\\PRO1041\\dsHoaDon\\" + codeno + ".txt");
//        try {
//            //            FileWriter a = new FileWriter(f,true); Ghi de len cai cu
//            FileWriter a = new FileWriter(f);
//            Desktop desktop = Desktop.getDesktop();
//            
//            desktop.open(f);
//
//            BufferedWriter b = new BufferedWriter(a);
//            b.newLine();
//            b.write(str1 + str2 + str3);
//            
//            b.close();
//            a.close();
//
//        } catch (Exception e) {
//        }
    inbill();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BanHangJDialog.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(BanHangJDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void cboTenKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTenKHActionPerformed
        // TODO add your handling code here:
        this.chonTenKH();
    }//GEN-LAST:event_cboTenKHActionPerformed

    private void cboChietKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboChietKhauActionPerformed
        // TODO add your handling code here:
        this.chonGiamGia();
    }//GEN-LAST:event_cboChietKhauActionPerformed

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
            java.util.logging.Logger.getLogger(BanHangJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BanHangJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BanHangJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BanHangJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BanHangJDialog dialog = new BanHangJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnChuyen;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnXoaMon;
    private javax.swing.JComboBox<String> cboChietKhau;
    private javax.swing.JComboBox<String> cboLoaiSP;
    private javax.swing.JComboBox<String> cboTenKH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDiemTichLuy;
    private javax.swing.JLabel lblDonGia;
    private javax.swing.JLabel lblGio;
    private javax.swing.JLabel lblMaHD;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblMaSP;
    private javax.swing.JLabel lblNgayInHD;
    private javax.swing.JLabel lblTongTien;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTable tblThucDon;
    // End of variables declaration//GEN-END:variables
    void init(){
        setLocationRelativeTo(null);
        this.fillComboBoxLoaiSanPham();
        this.fillComboBoxTenKH();
        this.fillComboBoxChietKhau();
        
//        new Timer(1000, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Date now = new Date();
//                SimpleDateFormat formater = new SimpleDateFormat("hh:mm:ss a");
//                String text= formater.format(now);
//                lblNgayInHD.setText(text);
//            }
//        }).start();
        Date a = new Date();
        SimpleDateFormat b = new SimpleDateFormat(" dd.MM.yyyy ");
        SimpleDateFormat c = new SimpleDateFormat(" hh:mm:ss ");
        lblNgayInHD.setText("" + b.format(a));
//        txtGio.setText("" + c.format(a));
       new Thread(){
           public void run()
           {
            while(true){
                Calendar ca= new GregorianCalendar();
                int hour = ca.get(Calendar.HOUR);
                int minute = ca.get(Calendar.MINUTE);
                int second=ca.get(Calendar.SECOND);
                int PM_AM = ca.get(Calendar.AM_PM);
                String day_night;
                if(PM_AM==1){
                    day_night="PM";
                }
                else{
                    day_night="AM";
                }
                String time= hour+ ":"+minute+":"+second+" "+day_night;
                lblGio.setText(time);
            }   
           }
       }.start();
        
    }
    
    LoaiSanPhamDAO lspdao = new LoaiSanPhamDAO();
    int row = -1;
    SanPhamDAO spdao = new SanPhamDAO();
    
    void chonLoaiSanPham(){
        LoaiSanPham loaiSP = (LoaiSanPham) cboLoaiSP.getSelectedItem();
        
        this.fillTable();
        this.row = -1;
    }
    
    void fillComboBoxLoaiSanPham(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboLoaiSP.getModel();
        model.removeAllElements();
        List<LoaiSanPham> list = lspdao.selectAll();
        for(LoaiSanPham lsp: list){
            model.addElement(lsp);
        }
    }
    
    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblThucDon.getModel();
        model.setRowCount(0);
        try {
            LoaiSanPham loaiSP = (LoaiSanPham) cboLoaiSP.getSelectedItem();
            List<SanPham> list = spdao.selectByLoaiSanPham(loaiSP.getMaLoaiSP());
            for (SanPham sp : list) {
                Object[] row = {
                    sp.getMaSP(),
                    sp.getTenSP(),
                    sp.getGia()
                };
                model.addRow(row);
            }
        } 
        catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }
    
    KhachHangDAO khdao = new KhachHangDAO();
    
    void chonTenKH(){
        KhachHang tenKH = (KhachHang) cboTenKH.getSelectedItem();
    }
    void fillComboBoxTenKH(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboTenKH.getModel();
        model.removeAllElements();
        List<KhachHang> list = khdao.selectAll();
        for(KhachHang tenkh: list){
            model.addElement(tenkh);
        }
    }
    void fillLabel() {
        try {
            KhachHang tenKH = (KhachHang) cboTenKH.getSelectedItem();
            List<KhachHang> list = khdao.selectByLoaiKhachHang(String.valueOf(tenKH.getDiemTichLuy()));
            lblDiemTichLuy.setText(String.valueOf(tenKH.getDiemTichLuy()));
            
        } 
        catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }
    
    KhuyenMaiDAO kmdao = new KhuyenMaiDAO();
    
    void chonGiamGia(){
        KhuyenMai tenKM = (KhuyenMai) cboChietKhau.getSelectedItem();
    }
    void fillComboBoxChietKhau(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboChietKhau.getModel();
        model.removeAllElements();
        List<KhuyenMai> list = kmdao.selectAll();
        for(KhuyenMai giamgia: list){
            model.addElement(giamgia);
        }
    }
    
    
    
    public int tinhTien() {
        int sum = 0;
        for (int i = 0; i < tblOrder.getRowCount(); i++) {
            sum += Double.valueOf(tblOrder.getValueAt(i, 2).toString());
        }
        return Integer.valueOf(sum);
    }
    
//    void setForm(KhoaHoc kh){
//        cboChuyenDe.setToolTipText(String.valueOf(kh.getMaKH()));
//        cboChuyenDe.setSelectedItem(cddao.selectById(kh.getMaCD())); 
//        txtNgayKG.setText(XDate.toString(kh.getNgayKG(), "MM/dd/yyyy"));
//        txtHocPhi.setText(String.valueOf(kh.getHocPhi()));
//        txtThoiLuong.setText(String.valueOf(kh.getThoiLuong()));
//        txtMaNV.setText(kh.getMaNV());
//        txtNgayTao.setText(XDate.toString(kh.getNgayTao(), "MM/dd/yyyy"));
//        txtGhiChu.setText(kh.getGhiChu());
//    }
//    
//    KhoaHoc getForm(){
//        ChuyenDe chuyenDe = (ChuyenDe) cboChuyenDe.getSelectedItem();
//        KhoaHoc kh = new KhoaHoc();
//        kh.setMaCD(chuyenDe.getMaCD());
//        kh.setNgayKG(XDate.toDate(txtNgayKG.getText(), "MM/dd/yyyy"));
//        kh.setHocPhi(Double.valueOf(txtHocPhi.getText()));
//        kh.setThoiLuong(Integer.valueOf(txtThoiLuong.getText()));
//        kh.setGhiChu(txtGhiChu.getText());
//        kh.setMaNV(Auth.user.getMaNV());
//        kh.setNgayTao(XDate.toDate(txtNgayTao.getText(), "MM/dd/yyyy"));
//        kh.setMaKH(Integer.valueOf(cboChuyenDe.getToolTipText()));
//        
//        return kh;
//    }
    
    
}
