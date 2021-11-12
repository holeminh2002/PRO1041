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
public class LoaiSanPham {
    private String MaLoaiSP;
    private String TenLoaiSP;
    private String MoTa;

    public String getMaLoaiSP() {
        return MaLoaiSP;
    }

    public void setMaLoaiSP(String MaLoaiSP) {
        this.MaLoaiSP = MaLoaiSP;
    }

    public String getTenLoaiSP() {
        return TenLoaiSP;
    }

    public void setTenLoaiSP(String TenLoaiSP) {
        this.TenLoaiSP = TenLoaiSP;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }
<<<<<<< HEAD

=======
>>>>>>> ee58ef52e7b5d9b1658b5f812680d127a987e48f
    @Override
    public String toString() {
        return this.TenLoaiSP;
    }

<<<<<<< HEAD
    @Override
    public boolean equals(Object obj) {
        LoaiSanPham other = (LoaiSanPham) obj;
        return other.getMaLoaiSP().equals(this.getMaLoaiSP());
    }
=======
    /*@Override
    public boolean equals(Object obj) {
        LoaiSanPham other = (LoaiSanPham) obj;
        return other.getMaLoaiSP().equals(this.getMaLoaiSP());
    }*/
>>>>>>> ee58ef52e7b5d9b1658b5f812680d127a987e48f
}
