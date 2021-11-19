/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffee.dao;

import com.coffee.utils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MyLaptop
 */

public class ThongKeDAO {
    private List<Object[]> getListOfArray(String sql, String[] cols,Object...args){
        try {
            List<Object[]> list = new ArrayList<>();
        ResultSet rs = XJdbc.query(sql, args);
        while (rs.next()) {            
            Object[] vals =new Object[cols.length];
            for (int i = 0; i < cols.length; i++) {
                vals[i] = rs.getObject(cols[i]);
            }
            list.add(vals);
        }
        rs.getStatement().getConnection().close();
        return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
        
    }
    
    public List<Object[]> getBangDiem(Integer makh){
        String sql ="{CALL sp_BangDiem(?)}";
        String[]cols = {"MaNH","HoTen","Diem"};
        return this.getListOfArray(sql, cols, makh);
    }
    public List<Object[]> getLuongNguoiHoc(){
        String sql ="{CALL sp_ThongKeNguoiHoc}";
        String[]cols = {"Nam","SoLuong","DauTien","CuoiCung"};
        return this.getListOfArray(sql, cols);
    }
    public List<Object[]> getDiemChuyenDe(){
        String sql ="{CALL sp_ThongKeDiem}";
        String[]cols = {"ChuyenDe","SoHV","ThapNhat","CaoNhat","TrungBinh"};
        return this.getListOfArray(sql, cols);
    }
//    public List<Object[]> getDoanhThu(int nam){
//        String sql ="{CALL sp_doanhthu(?)}";
//        String[] cols = {"MaHD", "MaNV", "MaKH", "NgayInHD", "TongTien", "DiemTichLuy", "GiamGia", "TienKhachDua", "TienThua", "MaKM"};
//        return this.getListOfArray(sql, cols, nam);
//    }
    
    public List<Object[]> getDoanhThu(int nam){
        String sql ="{CALL sp_doanhthu_new(?)}";
        String[] cols = {"MaHD", "MaNV", "SoLuong", "TenSP", "MaSP", "TongTien"};
        return this.getListOfArray(sql, cols, nam);
    }
    
    public List<Object[]> getKH(int thang){
        String sql ="{CALL sp_khachhang(?)}";
        String[] cols = {"NgayInHD", "MaKH", "TenKH", "SoLuong", "DiemTichLuy", "MaLoaiKH"};
        return this.getListOfArray(sql, cols, thang);
    }
    public List<Object[]> getSP(int thang){
        String sql ="{CALL sp_sanpham(?)}";
        String[] cols = {"NgayInHD", "TenLoaiSP", "MaSP", "TenSP", "SoLuong"};
        return this.getListOfArray(sql, cols, thang);
    }
}
