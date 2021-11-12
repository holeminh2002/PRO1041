/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffee.dao;


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
public class LoaiSanPhamDAO extends CoffeeDAO<LoaiSanPham, String> {

    
    public void insert(LoaiSanPham model) {
        String sql="INSERT INTO LoaiSanPham (MaLoaiSP, TenLoaiSP, MoTa) VALUES (?, ?, ?)";
        XJdbc.update(sql, 
                model.getMaLoaiSP(), 
                model.getTenLoaiSP(), 
                model.getMoTa());
    }

    
    public void update(LoaiSanPham model) {
        String sql="UPDATE LoaiSanPham SET TenLoaiSP=?, MoTa=? WHERE MaLoaiSP=?";
        XJdbc.update(sql, 
                model.getTenLoaiSP(), 
                model.getMoTa(), 
                model.getMaLoaiSP());
    }

    
    public void delete(String MaLoaiSP) {
        String sql="DELETE FROM LoaiSanPham WHERE MaLoaiSP=?";
        XJdbc.update(sql, MaLoaiSP);
    }

    
    public LoaiSanPham selectById(String maloaisp) {
        String sql="SELECT * FROM LoaiSanPham WHERE MaLoaiSP=?";
        List<LoaiSanPham> list = this.selectBySql(sql, maloaisp);
        return list.size() > 0 ? list.get(0) : null;
    }

    
    public List<LoaiSanPham> selectAll() {
        String sql="SELECT * FROM LoaiSanPham";
        return this.selectBySql(sql);
    }

    
    protected List<LoaiSanPham> selectBySql(String sql, Object... args) {
        List<LoaiSanPham> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    LoaiSanPham loaisp =new LoaiSanPham();
                    loaisp.setMaLoaiSP(rs.getString("MaLoaiSP"));
                    loaisp.setTenLoaiSP(rs.getString("TenLoaiSP"));
                    loaisp.setMoTa(rs.getString("Mota"));                   
                    list.add(loaisp);
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
