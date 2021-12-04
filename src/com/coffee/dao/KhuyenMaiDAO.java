/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffee.dao;

import com.coffee.entity.KhuyenMai;
import com.coffee.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 *
 * @author MyLaptop
 */
public class KhuyenMaiDAO extends CoffeeDAO<KhuyenMai, String>{

    
    public void insert(KhuyenMai model) {
        String sql="INSERT INTO KhuyenMai (MaKM, TenKM, GiamGia, NgayBatDau, NgayKetThuc, MoTa) VALUES (?, ?, ?, ?, ?, ?)";
        XJdbc.update(sql, 
                model.getMaKM(), 
                model.getTenKM(), 
                model.getGiamGia(),
                model.getDateStart(),
                model.getDateEnd(),
                model.getMoTa());
    }

    
    public void update(KhuyenMai model) {
        String sql="UPDATE KhuyenMai SET TenKM=?, GiamGia=?, NgayBatDau=?, NgayKetThuc=?, MoTa=? where MaKM=?"  ;
        XJdbc.update(sql, 
                model.getTenKM(), 
                model.getGiamGia(),
                model.getDateStart(),
                model.getDateEnd(),
                model.getMoTa(),
                model.getMaKM());
    }

    
    public void delete(String MaKM) {
        String sql="DELETE FROM KhuyenMai WHERE MaKM=?";
        XJdbc.update(sql, MaKM);
    }

    
    public KhuyenMai selectById(String makm) {
        String sql="SELECT * FROM KhuyenMai WHERE MaKM=?";
        List<KhuyenMai> list = this.selectBySql(sql, makm);
        return list.size() > 0 ? list.get(0) : null;
    }

    
    public List<KhuyenMai> selectAll() {
        String sql="SELECT * FROM KhuyenMai";
        return this.selectBySql(sql);
    }

    
    protected List<KhuyenMai> selectBySql(String sql, Object... args) {
        List<KhuyenMai> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    KhuyenMai entity=new KhuyenMai();
                    entity.setMaKM(rs.getString("MaKM"));
                    entity.setTenKM(rs.getString("TenKM"));
                    entity.setGiamGia(rs.getDouble("GiamGia"));
                    entity.setDateStart(rs.getDate("NgayBatDau")); 
                    entity.setDateEnd(rs.getDate("NgayKetThuc"));
                    entity.setMoTa(rs.getString("MoTa"));
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
