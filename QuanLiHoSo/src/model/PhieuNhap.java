/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * 
 */
public class PhieuNhap extends Phieu {

    private String nhanVien;

    public PhieuNhap() {
    }

    public PhieuNhap(String nhanVien) {
        this.nhanVien = nhanVien;
    }

    public PhieuNhap(String nhanVien, String maPhieu, Timestamp thoiGianTao, String nguoiTao, ArrayList<ChiTietPhieu> CTPhieu, double tongThoiGianLamViec) {
        super(maPhieu, thoiGianTao, nguoiTao, CTPhieu, tongThoiGianLamViec);
        this.nhanVien = nhanVien;
    }


    private PhieuNhap(String maPhieu, Timestamp thoiGianTao, String nguoiTao, ArrayList<ChiTietPhieu> CTPhieu, double tongTien) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(String nhanVien) {
        this.nhanVien = nhanVien;
    }

    @Override
    public String toString() {
        return "PhieuNhap{" + "nhanVien=" + nhanVien + " maPhieu"+ this.getMaPhieu()+'}';
    }

    

    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.nhanVien);
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
        final PhieuNhap other = (PhieuNhap) obj;
        return Objects.equals(this.nhanVien, other.nhanVien) && Objects.equals(this.getMaPhieu(), other.getMaPhieu()) && Double.doubleToLongBits(this.getTongThoiGianLamViec()) != Double.doubleToLongBits(other.getTongThoiGianLamViec()
        );
    }
    

    
}
