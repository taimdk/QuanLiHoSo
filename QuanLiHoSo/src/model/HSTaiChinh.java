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
public class HSTaiChinh extends HoSo{
    private double thuNhap;
    private String taiSan;

    public HSTaiChinh(double thuNhap, String taiSan, String maHoSo, String tenNguoi, int Tuoi, double CMND, String diaChi, String Sdt, String soThich, String Email, String kinhNghiem, int trangThai) {
        super(maHoSo, tenNguoi, Tuoi, CMND, diaChi, Sdt, soThich, Email, kinhNghiem,trangThai);
        this.thuNhap = thuNhap;
        this.taiSan = taiSan;
    }

    public HSTaiChinh() {
        
    }

    public double getThuNhap() {
        return thuNhap;
    }

    public void setThuNhap(double thuNhap) {
        this.thuNhap = thuNhap;
    }

    public String getTaiSan() {
        return taiSan;
    }

    public void setTaiSan(String taiSan) {
        this.taiSan = taiSan;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.thuNhap);
        hash = 67 * hash + Objects.hashCode(this.taiSan);
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
        final HSTaiChinh other = (HSTaiChinh) obj;
        if (!Objects.equals(this.thuNhap, other.thuNhap)) {
            return false;
        }
        return Objects.equals(this.taiSan, other.taiSan);
    }

    @Override
    public String toString() {
        return "Laptop{" + "thuNhap=" + thuNhap + ", taiSan=" + taiSan + '}';
    }


    
    
}
