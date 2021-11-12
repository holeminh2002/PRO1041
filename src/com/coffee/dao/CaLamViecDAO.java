/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffee.dao;

import com.coffee.entity.CaLamViec;
import com.coffee.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MyLaptop
 */
public class CaLamViecDAO extends CoffeeDAO<CaLamViec, String> {

    
    public void insert(CaLamViec model) {
        String sql="INSERT INTO CaLamViec (MaCaLV, TenCaLV,GioBD, GioKT, SoTien) VALUES (?, ?, ?, ?, ?, ?)";
        XJdbc.update(sql, 
                model.getMaCaLV(), 
                model.getTenCaLV(), 
                model.getGioBD(), 
                model.getGioKT(), 
                model.getSoTien());
    }

    
    public void update(CaLamViec model) {
        String sql="UPDATE CaLamViec SET TenCaLV=?,GioBD=?, GioKT=?, SoTien=? WHERE MaCaLV=?";
        XJdbc.update(sql, 
                model.getTenCaLV(), 
                model.getGioBD(), 
                model.getGioKT(), 
                model.getSoTien(), 
                model.getMaCaLV());
    }

    
    public void delete(String MaCaLV) {
        String sql="DELETE FROM CaLamViec WHERE MaCaLV=?";
        XJdbc.update(sql, MaCaLV);
    }

    
    public CaLamViec selectById(String macalv) {
        String sql="SELECT * FROM CaLamViec WHERE MaCaLV=?";
        List<CaLamViec> list = this.selectBySql(sql, macalv);
        return list.size() > 0 ? list.get(0) : null;
    }

    
    public List<CaLamViec> selectAll() {
        String sql="SELECT * FROM CaLamViec";
        return this.selectBySql(sql);
    }

    
    protected List<CaLamViec> selectBySql(String sql, Object... args) {
        List<CaLamViec> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    CaLamViec entity=new CaLamViec();
                    entity.setMaCaLV(rs.getString("MaCaLV"));
                    entity.setTenCaLV(rs.getString("TenCaLV"));
                    entity.setGioBD(rs.getInt("GioBD"));
                    entity.setGioKT(rs.getInt("GioKT"));
                    entity.setSoTien(rs.getDouble("SoTien"));
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
