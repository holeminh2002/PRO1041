/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffee.entity;
import java.util.Date;
/**
 *
 * @author MyLaptop
 */
public class CaLamViec {
    private String maCaLV;
    private String tenCaLV;
    private Date ngayLV = new Date();
    private int gioBD;
    private int gioKT;
    private double soTien;

    public String getMaCaLV() {
        return maCaLV;
    }

    public void setMaCaLV(String maCaLV) {
        this.maCaLV = maCaLV;
    }

    public String getTenCaLV() {
        return tenCaLV;
    }

    public void setTenCaLV(String tenCaLV) {
        this.tenCaLV = tenCaLV;
    }

    public Date getNgayLV() {
        return ngayLV;
    }

    public void setNgayLV(Date ngayLV) {
        this.ngayLV = ngayLV;
    }

    public int getGioBD() {
        return gioBD;
    }

    public void setGioBD(int gioBD) {
        this.gioBD = gioBD;
    }

    public int getGioKT() {
        return gioKT;
    }

    public void setGioKT(int gioKT) {
        this.gioKT = gioKT;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }
}
