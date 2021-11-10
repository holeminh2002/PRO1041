/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffee.entity;

/**
 *
 * @author MyLaptop
 */
public class KhachHang {
    private int MaKH;
    private String MaLoaiKH;
    private String TenKH;
    private String DiaChi;
    private String Email;
    private String SDT;
    private double DiemTichLuy;

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public String getMaLoaiKH() {
        return MaLoaiKH;
    }

    public void setMaLoaiKH(String MaLoaiKH) {
        this.MaLoaiKH = MaLoaiKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public double getDiemTichLuy() {
        return DiemTichLuy;
    }

    public void setDiemTichLuy(double DiemTichLuy) {
        this.DiemTichLuy = DiemTichLuy;
    }
}
