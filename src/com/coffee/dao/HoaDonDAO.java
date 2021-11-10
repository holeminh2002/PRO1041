/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffee.dao;

import com.coffee.entity.HoaDon;
import com.coffee.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MyLaptop
 */
public class HoaDonDAO extends CoffeeDAO<HoaDon, Integer>{

    
    public void insert(HoaDon model) {
        String sql="INSERT INTO HoaDon (MaHD, MaNV, MaKH, NgayInHD, TongTien, DiemTichLuy, GiamGia, TienKhachDua, TienThua, MaKM) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        XJdbc.update(sql, 
                model.getMaHD(), 
                model.getMaNV(), 
                model.getMaKH(), 
                model.getNgayInHD(), 
                model.getTongTien(), 
                model.getDiemTichLuy(), 
                model.getGiamGia(), 
                model.getTienKhachDua(),
                model.getTienThua(),
                model.getMaKM());
    }

    
    public void update(HoaDon model) {
        String sql="UPDATE HoaDon SET MaNV=?, MaKH=?, NgayInHD=?, TongTien=?, DiemTichLuy=?, GiamGia=?, TienKhachDua=?, TienThua=?, MaKM=? WHERE MaHD=?";
        XJdbc.update(sql, 
                model.getMaNV(), 
                model.getMaKH(), 
                model.getNgayInHD(), 
                model.getTongTien(), 
                model.getDiemTichLuy(), 
                model.getGiamGia(), 
                model.getTienKhachDua(),
                model.getTienThua(),
                model.getMaKM(), 
                model.getMaHD());
    }

    
    public void delete(Integer MaHD) {
        String sql="DELETE FROM HoaDon WHERE MaHD=?";
        XJdbc.update(sql, MaHD);
    }

    
    public HoaDon selectById(Integer mahd) {
        String sql="SELECT * FROM HoaDon WHERE MaHD=?";
        List<HoaDon> list = this.selectBySql(sql, mahd);
        return list.size() > 0 ? list.get(0) : null;
    }

    
    public List<HoaDon> selectAll() {
        String sql="SELECT * FROM HoaDon";
        return this.selectBySql(sql);
    }

    
    protected List<HoaDon> selectBySql(String sql, Object... args) {
        List<HoaDon> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    HoaDon entity=new HoaDon();
                    entity.setMaHD(rs.getInt("MaHD"));
                    entity.setMaNV(rs.getString("MaNV"));
                    entity.setMaKH(rs.getInt("MaKH"));
                    entity.setNgayInHD(rs.getDate("NgayInHD"));
                    entity.setTongTien(rs.getDouble("TongTien"));
                    entity.setDiemTichLuy(rs.getDouble("DiemTichLuy"));
                    entity.setGiamGia(rs.getDouble("GiamGia"));
                    entity.setTienKhachDua(rs.getDouble("TienKhachDua"));
                    entity.setTienThua(rs.getDouble("TienThua"));
                    entity.setMaKM(rs.getString("MaKM"));
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
