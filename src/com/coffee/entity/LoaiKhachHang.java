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
public class LoaiKhachHang {
    private String MaLoaiKH;
    private String TenLoaiKH;
    private int DiemTichLuy;

    public String getMaLoaiKH() {
        return MaLoaiKH;
    }

    public void setMaLoaiKH(String MaLoaiKH) {
        this.MaLoaiKH = MaLoaiKH;
    }

    public String getTenLoaiKH() {
        return TenLoaiKH;
    }

    public void setTenLoaiKH(String TenLoaiKH) {
        this.TenLoaiKH = TenLoaiKH;
    }

    public int getDiemTichLuy() {
        return DiemTichLuy;
    }

    public void setDiemTichLuy(int DiemTichLuy) {
        this.DiemTichLuy = DiemTichLuy;
    }
}
