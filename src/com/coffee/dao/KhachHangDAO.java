/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffee.dao;

import com.coffee.entity.KhachHang;
import com.coffee.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MyLaptop
 */
public class KhachHangDAO extends CoffeeDAO<KhachHang, Integer> {

    
    public void insert(KhachHang model) {
        String sql="INSERT INTO KhachHang (MaKH, MaLoaiKH, TenKH, DiaChi, Email, SDT, DiemTichLuy) VALUES (?, ?, ?, ?, ?, ?, ?)";
        XJdbc.update(sql, 
                model.getMaKH(), 
                model.getMaLoaiKH(), 
                model.getTenKH(), 
                model.getDiaChi(), 
                model.getEmail(), 
                model.getSDT(),
                model.getDiemTichLuy());
    }

    
    public void update(KhachHang model) {
        String sql="UPDATE KhachHang SET MaLoaiKH=?, TenKH=?, DiaChi=?, Email=?, SDT=?, DiemTichLuy=? WHERE MaKH=?";
        XJdbc.update(sql, 
                model.getMaLoaiKH(), 
                model.getTenKH(), 
                model.getDiaChi(), 
                model.getEmail(), 
                model.getSDT(), 
                model.getDiemTichLuy(),
                model.getMaKH());
    }

    
    public void delete(Integer MaKH) {
        String sql="DELETE FROM KhachHang WHERE MaKH=?";
        XJdbc.update(sql, MaKH);
    }

    
    public KhachHang selectById(Integer makh) {
        String sql="SELECT * FROM KhachHang WHERE MaKH=?";
        List<KhachHang> list = this.selectBySql(sql, makh);
        return list.size() > 0 ? list.get(0) : null;
    }

    
    public List<KhachHang> selectAll() {
        String sql="SELECT * FROM KhachHang";
        return this.selectBySql(sql);
    }

    
    protected List<KhachHang> selectBySql(String sql, Object... args) {
        List<KhachHang> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    KhachHang entity=new KhachHang();
                    entity.setMaKH(rs.getInt("MaKH"));
                    entity.setMaLoaiKH(rs.getString("MaLoaiKH"));
                    entity.setTenKH(rs.getString("TenKH"));
                    entity.setDiaChi(rs.getString("DiaChi"));
                    entity.setEmail(rs.getString("Email"));
                    entity.setSDT(rs.getString("SDT"));
                    entity.setDiemTichLuy(rs.getDouble("DiemTichLuy"));
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
    
    public List<KhachHang> selectByLoaiKhachHang(String tenkh){
        String sql="SELECT * FROM KhachHang WHERE TenKH=?";
        return this.selectBySql(sql, tenkh);
    }
}
