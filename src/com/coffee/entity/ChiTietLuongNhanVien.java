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
public class ChiTietLuongNhanVien {
    private String maCaLV;
    private String maNV;
    private int tongSoCaLamTrongThang;
    private double thanhTien;
    private String kyLuong;

    public String getMaCaLV() {
        return maCaLV;
    }

    public void setMaCaLV(String maCaLV) {
        this.maCaLV = maCaLV;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public int getTongSoCaLamTrongThang() {
        return tongSoCaLamTrongThang;
    }

    public void setTongSoCaLamTrongThang(int tongSoCaLamTrongThang) {
        this.tongSoCaLamTrongThang = tongSoCaLamTrongThang;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getKyLuong() {
        return kyLuong;
    }

    public void setKyLuong(String kyLuong) {
        this.kyLuong = kyLuong;
    }
}
