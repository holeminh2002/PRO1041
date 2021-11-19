/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffee.ui;

import com.coffee.utils.Auth;
import com.coffee.utils.MsgBox;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author Dell
 */
public class TrangChu extends javax.swing.JFrame {

    
    public TrangChu() {
        initComponents();
        init();
    }

    

    void openThongKe(int index) {
        if (Auth.isLogin()) {
            if (!Auth.isManager()) {
                MsgBox.alert(this, "Bạn không có quyền xem thông tin thống kê");
            } else {
                this.dispose();
                ThongKe tkwin = new ThongKe(this,true);
                tkwin.selectTab(index);
                tkwin.setVisible(true);
                
            }
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void openHuongDan() {
        try {
            Desktop.getDesktop().browse(new File("src\\com\\coffee\\help\\index.html").toURI());
        } catch (Exception e) {
            MsgBox.alert(this, "Không tìm thấy hướng dẫn");
        }

    }
    void openGioiThieu() {
           try {
            Desktop.getDesktop().browse(new File("src\\com\\coffee\\help\\about.html").toURI());
        } catch (Exception e) {
            MsgBox.alert(this, "Không tìm thấy hướng dẫn");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTrangThai = new javax.swing.JPanel();
        lblTrangThai = new javax.swing.JLabel();
        lblDongHo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnQLnv = new javax.swing.JButton();
        btnQLkh = new javax.swing.JButton();
        btnThongke = new javax.swing.JButton();
        btnQLsp = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        btnQLbh = new javax.swing.JButton();
        btnKhuyenmai = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuHeThong = new javax.swing.JMenu();
        mniDangXuat = new javax.swing.JMenuItem();
        mniDoiMK = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniAccount = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mniExit = new javax.swing.JMenuItem();
        mnuQuanLy = new javax.swing.JMenu();
        mniqlnv = new javax.swing.JMenuItem();
        mniqlkh = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mniLuongNV = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnibanhang = new javax.swing.JMenuItem();
        mnisp = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mnikhuyenmai = new javax.swing.JMenuItem();
        mnuThongKe = new javax.swing.JMenu();
        mniDoanhThu = new javax.swing.JMenuItem();
        mniKhachHang = new javax.swing.JMenuItem();
        mniSanPham = new javax.swing.JMenuItem();
        mnuTroGiup = new javax.swing.JMenu();
        mniHuongDan = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        mniInfo = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenuItem15 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTrangThai.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblTrangThai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coffee/icon/Info.png"))); // NOI18N
        lblTrangThai.setText("Hệ thống quản lý cà phê - dự án 1");

        lblDongHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coffee/icon/Alarm.png"))); // NOI18N
        lblDongHo.setText("03:17:43 AM");

        javax.swing.GroupLayout pnlTrangThaiLayout = new javax.swing.GroupLayout(pnlTrangThai);
        pnlTrangThai.setLayout(pnlTrangThaiLayout);
        pnlTrangThaiLayout.setHorizontalGroup(
            pnlTrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTrangThaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTrangThai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDongHo)
                .addContainerGap())
        );
        pnlTrangThaiLayout.setVerticalGroup(
            pnlTrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblTrangThai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDongHo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coffee/icon/cafe3.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1920, 1200));
        jLabel1.setMinimumSize(new java.awt.Dimension(1920, 1200));
        jLabel1.setPreferredSize(new java.awt.Dimension(1920, 1200));

        btnQLnv.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnQLnv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coffee/icon/User group.png"))); // NOI18N
        btnQLnv.setText("Quản lý nhân viên");
        btnQLnv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLnvActionPerformed(evt);
            }
        });

        btnQLkh.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnQLkh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coffee/icon/Clien list.png"))); // NOI18N
        btnQLkh.setText("Quản lý khách hàng");
        btnQLkh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLkhActionPerformed(evt);
            }
        });

        btnThongke.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnThongke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coffee/icon/Scroll list.png"))); // NOI18N
        btnThongke.setText("Thống kê");
        btnThongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongkeActionPerformed(evt);
            }
        });

        btnQLsp.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnQLsp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coffee/icon/coffee-icon (1).png"))); // NOI18N
        btnQLsp.setText("Quản lý sản phẩm");
        btnQLsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLspActionPerformed(evt);
            }
        });

        btnDangXuat.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coffee/icon/Log out.png"))); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        btnQLbh.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnQLbh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coffee/icon/Payment.png"))); // NOI18N
        btnQLbh.setText("Quản lý bán hàng");
        btnQLbh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLbhActionPerformed(evt);
            }
        });

        btnKhuyenmai.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnKhuyenmai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coffee/icon/Favourites.png"))); // NOI18N
        btnKhuyenmai.setText("Chương trình khuyến mãi");
        btnKhuyenmai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhuyenmaiActionPerformed(evt);
            }
        });

        mnuHeThong.setText("Hệ thống");

        mniDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        mniDangXuat.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        mniDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coffee/icon/Log out.png"))); // NOI18N
        mniDangXuat.setText("Đăng xuất");
        mniDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangXuatActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDangXuat);

        mniDoiMK.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_SHIFT, java.awt.event.InputEvent.CTRL_MASK));
        mniDoiMK.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        mniDoiMK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coffee/icon/Refresh.png"))); // NOI18N
        mniDoiMK.setText("Đổi mật khẩu");
        mniDoiMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoiMKActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDoiMK);
        mnuHeThong.add(jSeparator1);

        mniAccount.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        mniAccount.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        mniAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coffee/icon/Unknown person.png"))); // NOI18N
        mniAccount.setText("Xem thông tin tài khoản");
        mniAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAccountActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniAccount);
        mnuHeThong.add(jSeparator2);

        mniExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mniExit.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        mniExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coffee/icon/Stop.png"))); // NOI18N
        mniExit.setText("Thoát");
        mniExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExitActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniExit);

        jMenuBar1.add(mnuHeThong);

        mnuQuanLy.setText("Quản lý");

        mniqlnv.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK));
        mniqlnv.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        mniqlnv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coffee/icon/User group.png"))); // NOI18N
        mniqlnv.setText("Quản lý nhân viên");
        mniqlnv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniqlnvActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniqlnv);

        mniqlkh.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        mniqlkh.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        mniqlkh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coffee/icon/Clien list.png"))); // NOI18N
        mniqlkh.setText("Quản lý thông tin KH");
        mniqlkh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniqlkhActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniqlkh);
        mnuQuanLy.add(jSeparator5);

        mniLuongNV.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK));
        mniLuongNV.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        mniLuongNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coffee/icon/Database.png"))); // NOI18N
        mniLuongNV.setText("Lương nhân viên");
        mniLuongNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLuongNVActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniLuongNV);
        mnuQuanLy.add(jSeparator3);

        mnibanhang.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        mnibanhang.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        mnibanhang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coffee/icon/Payment.png"))); // NOI18N
        mnibanhang.setText("Quản lý bán hàng");
        mnibanhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnibanhangActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mnibanhang);

        mnisp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK));
        mnisp.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        mnisp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coffee/icon/coffee-icon (1).png"))); // NOI18N
        mnisp.setText("Quản lý sản phẩm");
        mnisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnispActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mnisp);
        mnuQuanLy.add(jSeparator4);

        mnikhuyenmai.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        mnikhuyenmai.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        mnikhuyenmai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coffee/icon/Favourites.png"))); // NOI18N
        mnikhuyenmai.setText("Chương trình khuyến mãi");
        mnikhuyenmai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnikhuyenmaiActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mnikhuyenmai);

        jMenuBar1.add(mnuQuanLy);

        mnuThongKe.setText("Thống kê");

        mniDoanhThu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mniDoanhThu.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        mniDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coffee/icon/Coins.png"))); // NOI18N
        mniDoanhThu.setText("Thống kê doanh thu");
        mniDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoanhThuActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniDoanhThu);

        mniKhachHang.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        mniKhachHang.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        mniKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coffee/icon/User.png"))); // NOI18N
        mniKhachHang.setText("Thống kê khách hàng");
        mniKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKhachHangActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniKhachHang);

        mniSanPham.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        mniSanPham.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        mniSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coffee/icon/coffee-icon (1).png"))); // NOI18N
        mniSanPham.setText("Thống kê sản phẩm");
        mniSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSanPhamActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniSanPham);

        jMenuBar1.add(mnuThongKe);

        mnuTroGiup.setText("Trợ giúp");

        mniHuongDan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_MASK));
        mniHuongDan.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        mniHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coffee/icon/Globe.png"))); // NOI18N
        mniHuongDan.setText("Hướng dẫn sử dụng");
        mniHuongDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHuongDanActionPerformed(evt);
            }
        });
        mnuTroGiup.add(mniHuongDan);
        mnuTroGiup.add(jSeparator7);

        mniInfo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_MASK));
        mniInfo.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        mniInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coffee/icon/Info.png"))); // NOI18N
        mniInfo.setText("Thông tin cty");
        mniInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniInfoActionPerformed(evt);
            }
        });
        mnuTroGiup.add(mniInfo);
        mnuTroGiup.add(jSeparator9);

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem15.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coffee/icon/Mail.png"))); // NOI18N
        jMenuItem15.setText("Email liên hệ QC");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        mnuTroGiup.add(jMenuItem15);

        jMenuBar1.add(mnuTroGiup);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTrangThai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnQLnv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnQLsp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThongke, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQLbh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKhuyenmai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQLkh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnQLnv, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btnQLkh, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnQLsp, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnQLbh, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnKhuyenmai, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnThongke, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQLnvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLnvActionPerformed
//        this.dispose();
        new QLnhanivenDialog(this, true).setVisible(true);
        
    }//GEN-LAST:event_btnQLnvActionPerformed

    private void btnQLkhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLkhActionPerformed
//        this.dispose();
        new Dk_TV(this, true).setVisible(true);
        
    }//GEN-LAST:event_btnQLkhActionPerformed

    private void btnQLspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLspActionPerformed
//        this.dispose();
        new QLsanphamDialog(this, true).setVisible(true);
        
    }//GEN-LAST:event_btnQLspActionPerformed

    private void btnQLbhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLbhActionPerformed
//        this.dispose();
        new BanHangJDialog(this, true).setVisible(true);
        
    }//GEN-LAST:event_btnQLbhActionPerformed

    private void btnKhuyenmaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhuyenmaiActionPerformed
//        this.dispose();
        new KhuyenMaiJDialog(this, true).setVisible(true);
        
    }//GEN-LAST:event_btnKhuyenmaiActionPerformed

    private void btnThongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongkeActionPerformed
//        this.dispose();
        new ThongKe(this, true).setVisible(true);
        
    }//GEN-LAST:event_btnThongkeActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        Auth.clear();
//        this.dispose();
        new DangNhap(this, true).setVisible(true);
        
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void mniAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniAccountActionPerformed

    private void mniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExitActionPerformed

        if (MsgBox.confirm(this, "Bạn muốn kết thúc làm việc ?")) {
            System.exit(0);
        }

    }//GEN-LAST:event_mniExitActionPerformed

    private void mniKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKhachHangActionPerformed
        this.openThongKe(1);
    }//GEN-LAST:event_mniKhachHangActionPerformed

    private void mniDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoanhThuActionPerformed
        this.openThongKe(0);
    }//GEN-LAST:event_mniDoanhThuActionPerformed

    private void mniqlnvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniqlnvActionPerformed
        new QLnhanivenDialog(this, true).setVisible(true);
    }//GEN-LAST:event_mniqlnvActionPerformed

    private void mniqlkhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniqlkhActionPerformed
        new Dk_TV(this, true).setVisible(true);
    }//GEN-LAST:event_mniqlkhActionPerformed

    private void mnibanhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnibanhangActionPerformed
        new QLsanphamDialog(this, true).setVisible(true);
    }//GEN-LAST:event_mnibanhangActionPerformed

    private void mnikhuyenmaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnikhuyenmaiActionPerformed
        new KhuyenMaiJDialog(this, true).setVisible(true);
    }//GEN-LAST:event_mnikhuyenmaiActionPerformed

    private void mnispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnispActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnispActionPerformed

    private void mniDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangXuatActionPerformed
        Auth.clear();
        new DangNhap(this, true).setVisible(true);
    }//GEN-LAST:event_mniDangXuatActionPerformed

    private void mniSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSanPhamActionPerformed
        this.openThongKe(2);
    }//GEN-LAST:event_mniSanPhamActionPerformed

    private void mniHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHuongDanActionPerformed
        this.openHuongDan();
    }//GEN-LAST:event_mniHuongDanActionPerformed

    private void mniInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniInfoActionPerformed
        this.openGioiThieu();
    }//GEN-LAST:event_mniInfoActionPerformed

    private void mniDoiMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoiMKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniDoiMKActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        MsgBox.alert(this, "Vui lòng liên hệ quảng cáo qua: "
                + "\n + Email: ABC@XYZ.com"
                + "\n + Số điện thoại: 0987654321");
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void mniLuongNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLuongNVActionPerformed
        // TODO add your handling code here:
        new LuongCalamDialog(this, true).setVisible(true);
    }//GEN-LAST:event_mniLuongNVActionPerformed

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
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnKhuyenmai;
    private javax.swing.JButton btnQLbh;
    private javax.swing.JButton btnQLkh;
    private javax.swing.JButton btnQLnv;
    private javax.swing.JButton btnQLsp;
    private javax.swing.JButton btnThongke;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JMenuItem mniAccount;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniDoanhThu;
    private javax.swing.JMenuItem mniDoiMK;
    private javax.swing.JMenuItem mniExit;
    private javax.swing.JMenuItem mniHuongDan;
    private javax.swing.JMenuItem mniInfo;
    private javax.swing.JMenuItem mniKhachHang;
    private javax.swing.JMenuItem mniLuongNV;
    private javax.swing.JMenuItem mniSanPham;
    private javax.swing.JMenuItem mnibanhang;
    private javax.swing.JMenuItem mnikhuyenmai;
    private javax.swing.JMenuItem mniqlkh;
    private javax.swing.JMenuItem mniqlnv;
    private javax.swing.JMenuItem mnisp;
    private javax.swing.JMenu mnuHeThong;
    private javax.swing.JMenu mnuQuanLy;
    private javax.swing.JMenu mnuThongKe;
    private javax.swing.JMenu mnuTroGiup;
    private javax.swing.JPanel pnlTrangThai;
    // End of variables declaration//GEN-END:variables
    void init() {
        setLocationRelativeTo(null);
        startDongHo();
//        new ChaoJDialog(this, true).setVisible(true);
        new DangNhap(this, true).setVisible(true);
    }

    void startDongHo() {
        new Timer(1000, new ActionListener() {
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss aaa");

            @Override
            public void actionPerformed(ActionEvent e) {
                lblDongHo.setText(sdf.format(new Date()));
            }
        }).start();
    }
}