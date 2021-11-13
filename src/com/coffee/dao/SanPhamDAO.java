/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffee.dao;


import com.coffee.entity.SanPham;
import com.coffee.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MyLaptop
 */
public class SanPhamDAO extends CoffeeDAO<SanPham, String>{

    
    public void insert(SanPham model) {
       String sql="INSERT INTO SanPham (MaSP, TenSP, MaLoaiSP, HinhAnh, Gia) VALUES (?, ?, ?, ?)";
        XJdbc.update(sql, 
                model.getMaSP(), 
                model.getTenSP(), 
                model.getMaLoaiSP(),
                model.getHinhAnh(), 
                model.getGia());
    }
    

    
    public void update(SanPham model) {
        String sql="UPDATE SanPham SET TenSP=?, MaLoaiSP=?, HinhAnh=?, Gia=? WHERE MaSP=?";
        XJdbc.update(sql, 
                model.getTenSP(), 
                model.getMaLoaiSP(), 
                model.getHinhAnh(),
                model.getGia());
    }

    
    public void delete(String MaSP) {
        String sql="DELETE FROM SanPham WHERE MaSP=?";
        XJdbc.update(sql, MaSP);
    }

    
    public SanPham selectById(String masp) {
        String sql="SELECT * FROM SanPham WHERE MaSP=?";
        List<SanPham> list = this.selectBySql(sql, masp);
        return list.size() > 0 ? list.get(0) : null;
    }

    
    public List<SanPham> selectAll() {
        String sql="SELECT * FROM SanPham";
        return this.selectBySql(sql);
    }

    
    protected List<SanPham> selectBySql(String sql, Object... args) {
        List<SanPham> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    SanPham entity=new SanPham();
                    entity.setMaSP(rs.getString("MaSP"));
                    entity.setTenSP(rs.getString("TenSP"));
                    entity.setMaLoaiSP(rs.getString("MaLoaiSP"));
                    entity.setHinhAnh(rs.getString("HinhAnh"));
                    entity.setGia(rs.getDouble("Gia"));
                    list.add(entity);
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
    
    public List<SanPham> selectByLoaiSanPham(String maloaisp){
        String sql="SELECT * FROM SanPham WHERE MaLoaiSP=?";
        return this.selectBySql(sql, maloaisp);
    }
    
//    public List<SanPham> selectBySanPham(String masp){
//        String sql="SELECT * FROM SanPham WHERE MaSP=?";
//        return this.selectBySql(sql, masp);
//    }
}
