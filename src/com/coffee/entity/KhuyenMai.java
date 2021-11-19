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
public class KhuyenMai {

    private String MaKM;
    private String TenKM;
    private double GiamGia;
    private Date DateStart;
    private Date DateEnd;

    public Date getDateStart() {
        return DateStart;
    }

    public void setDateStart(Date DateStart) {
        this.DateStart = DateStart;
    }

    public Date getDateEnd() {
        return DateEnd;
    }

    public void setDateEnd(Date DateEnd) {
        this.DateEnd = DateEnd;
    }
    private String MoTa;

    public KhuyenMai(String MaKM, String TenKM, double GiamGia, Date DateStart, Date DateEnd, String MoTa) {
        this.MaKM = MaKM;
        this.TenKM = TenKM;
        this.GiamGia = GiamGia;
        this.DateStart = DateStart;
        this.DateEnd = DateEnd;
        this.MoTa = MoTa;
    }

    public KhuyenMai() {
    }

    public double getGiamGia() {
        return GiamGia;
    }

    public void setGiamGia(double GiamGia) {
        this.GiamGia = GiamGia;
    }

    public String getMaKM() {
        return MaKM;
    }

    public void setMaKM(String MaKM) {
        this.MaKM = MaKM;
    }

    public String getTenKM() {
        return TenKM;
    }

    public void setTenKM(String TenKM) {
        this.TenKM = TenKM;
    }

    

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    
    @Override
    public String toString() {
        return this.TenKM;
    }

    @Override
    public boolean equals(Object obj) {
        KhuyenMai other = (KhuyenMai) obj;
        return other.getMaKM().equals(this.getMaKM());
    }
    
    

}
