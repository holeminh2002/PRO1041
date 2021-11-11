/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffee.dao;

import com.coffee.entity.NhanVien;
import com.coffee.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MyLaptop
 */
public class NhanVienDAO extends CoffeeDAO<NhanVien, String> {
    public void insert(NhanVien model){
        String sql="INSERT INTO NhanVien (MaNV, TenNV, GioiTinh, DiaChi, SDT, Email, NgayVaoLam, VaiTro, MatKhau, Hinh) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        XJdbc.update(sql, 
                model.getMaNV(), 
                model.getTenNV(), 
                model.getGioiTinh(),  
                model.getDiaChi(), 
                model.getsDT(), 
                model.getEmail(), 
                model.getNgayVaoLam(),
                model.getVaiTro(),
                model.getMatKhau(), 
                model.getHinh());
    }
    
    public void update(NhanVien model){
        String sql="UPDATE NhanVien SET TenNV=?, GioiTinh=?,DiaChi=?, SDT=?, Email=?, NgayVaoLam=?, VaiTro=?, MatKhau=?, Hinh=? WHERE MaNV=?";
        XJdbc.update(sql, 
                model.getTenNV(), 
                model.getGioiTinh(), 
                model.getDiaChi(), 
                model.getsDT(), 
                model.getEmail(), 
                model.getNgayVaoLam(),
                model.getVaiTro(),
                model.getMatKhau(), 
                model.getHinh(),
                model.getMaNV());
    }
    
    public void delete(String MaNV){
        String sql="DELETE FROM NhanVien WHERE MaNV=?";
        XJdbc.update(sql, MaNV);
    }
    
    public List<NhanVien> selectAll(){
        String sql="SELECT * FROM NhanVien";
        return this.selectBySql(sql);
    }
    
    public NhanVien selectById(String manv){
        String sql="SELECT * FROM NhanVien WHERE MaNV=?";
        List<NhanVien> list = this.selectBySql(sql, manv);
        return list.size() > 0 ? list.get(0) : null;
    }
    
    protected List<NhanVien> selectBySql(String sql, Object...args){
        List<NhanVien> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    NhanVien entity=new NhanVien();
                    entity.setMaNV(rs.getString("MaNV"));
                    entity.setTenNV(rs.getString("TenNV"));
                    entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                    entity.setDiaChi(rs.getString("DiaChi"));
                    entity.setsDT(rs.getString("SDT"));
                    entity.setEmail(rs.getString("Email"));
                    entity.setNgayVaoLam(rs.getString("NgayVaoLam"));
                    entity.setVaiTro(rs.getBoolean("VaiTro"));
                    entity.setMatKhau(rs.getString("MatKhau"));
                    entity.setHinh(rs.getString("Hinh"));
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
