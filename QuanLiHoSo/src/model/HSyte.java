/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * 
 */
public class HSyte extends HoSo{
    private String benhLi;
    private int lieuLuong;

    public HSyte(String benhLi, int lieuLuong) {
        this.benhLi = benhLi;
        this.lieuLuong = lieuLuong;
    }

    public HSyte(String benhLi, int lieuLuong, String maHoSo, String tenNguoi, int Tuoi, double CMND, String diaChi, String Sdt, String soThich, String Email, String kinhNghiem, int trangThai) {
        super(maHoSo, tenNguoi, Tuoi, CMND, diaChi, Sdt, soThich, Email, kinhNghiem,trangThai);
        this.benhLi = benhLi;
        this.lieuLuong = lieuLuong;
    }

    public HSyte() {
        
    }

    public String getBenhLi() {
        return benhLi;
    }

    public void setBenhLi(String benhLi) {
        this.benhLi = benhLi;
    }

    public int getLieuLuong() {
        return lieuLuong;
    }

    public void setLieuLuong(int lieuLuong) {
        this.lieuLuong = lieuLuong;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.benhLi);
        hash = 43 * hash + Objects.hashCode(this.lieuLuong);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HSyte other = (HSyte) obj;
        if (!Objects.equals(this.benhLi, other.benhLi)) {
            return false;
        }
        return Objects.equals(this.lieuLuong, other.lieuLuong);
    }

    @Override
    public String toString() {
        return "Yte{" + "benhLi=" + benhLi + ", lieuLuong=" + lieuLuong + '}';
    }
    
    
}
