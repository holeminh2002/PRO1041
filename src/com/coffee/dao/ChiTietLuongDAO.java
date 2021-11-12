/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffee.dao;

import com.coffee.entity.CaLamViec;
import com.coffee.entity.ChiTietLuongNhanVien;
import com.coffee.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ChiTietLuongDAO extends CoffeeDAO<ChiTietLuongNhanVien, String> {

    /**
     *
     * @param luong
     */
    @Override
    public void insert(ChiTietLuongNhanVien luong) {
        String sql="INSERT INTO ChiTietLuongNhanVien(MaCaLV,MaNV,TongSoCaLamTrongThang, ThanhTien,KyLuong) VALUES (?, ?, ?, ?, ?)";
        XJdbc.update(sql,
                luong.getMaCaLV(),
                luong.getMaNV(),
                luong.getTongSoCaLamTrongThang(),
                luong.getThanhTien(),
                luong.getKyLuong());
    }

    @Override
    public void update(ChiTietLuongNhanVien luong) {
        String sql="IUPDATE ChiTietLuongNhanVien set MaNV =?,TongSoCaLamTrongThang= ? , ThanhTien= ?,KyLuong=? WHERE MaCaLV =? ";
        XJdbc.update(sql,                
                luong.getMaNV(),
                luong.getTongSoCaLamTrongThang(),
                luong.getThanhTien(),
                luong.getKyLuong(),
                luong.getMaCaLV());
    }

    @Override
    public void delete(String macalv) {
        String sql="DELETE FROM ChiTietLuongNhanVien WHERE MaCaLV=?";
        XJdbc.update(sql, macalv);
    }

    @Override
    public ChiTietLuongNhanVien selectById(String macalv) {
        String sql="SELECT * FROM ChiTietLuongNhanVien WHERE MaCaLV=?";
        List<ChiTietLuongNhanVien> list = this.selectBySql(sql, macalv);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<ChiTietLuongNhanVien> selectAll() {
         String sql="SELECT * FROM ChiTietLuongNhanVien ";
        return this.selectBySql(sql);
    }

    @Override
    protected List<ChiTietLuongNhanVien> selectBySql(String sql, Object... args) {
         List<ChiTietLuongNhanVien> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    ChiTietLuongNhanVien luong=new ChiTietLuongNhanVien();
                    luong.setMaCaLV(rs.getString("MaCaLV"));
                    luong.setMaNV(rs.getString("MaNV"));
                    luong.setTongSoCaLamTrongThang(rs.getInt("TongSoCaLamTrongThang"));
                    luong.setThanhTien(rs.getDouble("ThanhTien"));
                    luong.setKyLuong(rs.getString("KyLuong"));                    
                    list.add(luong);
                }
            } 
            finally{
                rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
       
    }
   

   

   
    
}
