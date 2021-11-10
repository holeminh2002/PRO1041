/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffee.dao;

import com.coffee.entity.LoaiKhachHang;
import com.coffee.entity.LoaiSanPham;
import com.coffee.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MyLaptop
 */
public class LoaiKhachHangDAO extends CoffeeDAO<LoaiKhachHang, Integer>{

    
    public void insert(LoaiKhachHang model) {
        String sql="INSERT INTO LoaiKhachHang (MaLoaiKH, TenLoaiKH, DiemTichLuy) VALUES (?, ?, ?)";
        XJdbc.update(sql, 
                model.getMaLoaiKH(), 
                model.getTenLoaiKH(), 
                model.getDiemTichLuy());
    }

    
    public void update(LoaiKhachHang model) {
        String sql="UPDATE LoaiKhachHang SET TenLoaiKH=?, DiemTichLuy=? WHERE MaLoaiKH=?";
        XJdbc.update(sql, 
                model.getTenLoaiKH(), 
                model.getDiemTichLuy(), 
                model.getMaLoaiKH());
    }

    public void delete(Integer MaLoaiKH) {
        String sql="DELETE FROM LoaiKhachHang WHERE MaLoaiKH=?";
        XJdbc.update(sql, MaLoaiKH);
    }

    
    public LoaiKhachHang selectById(Integer maloaikh) {
        String sql="SELECT * FROM LoaiKhachHang WHERE MaLoaiKH=?";
        List<LoaiKhachHang> list = this.selectBySql(sql, maloaikh);
        return list.size() > 0 ? list.get(0) : null;
    }

    
    public List<LoaiKhachHang> selectAll() {
        String sql="SELECT * FROM LoaiKhachHang";
        return this.selectBySql(sql);
    }

    
    protected List<LoaiKhachHang> selectBySql(String sql, Object... args) {
        List<LoaiKhachHang> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    LoaiKhachHang entity=new LoaiKhachHang();
                    entity.setMaLoaiKH(rs.getString("MaLoaiKH"));
                    entity.setTenLoaiKH(rs.getString("TenLoaiKH"));
                    entity.setDiemTichLuy(rs.getInt("DiemTichLuy"));
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
    
}
