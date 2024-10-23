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
public class NhanVien {
    private String maNhanVien;
    private String tenNhanVien;
    private String sdt;
    private String congViec;

    public NhanVien() {
    }

    public NhanVien(String maNhanVien, String tenNhanVien, String sdt, String congViec) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.sdt = sdt;
        this.congViec = congViec;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.maNhanVien);
        hash = 29 * hash + Objects.hashCode(this.tenNhanVien);
        hash = 29 * hash + Objects.hashCode(this.sdt);
        hash = 29 * hash + Objects.hashCode(this.congViec);
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
        final NhanVien other = (NhanVien) obj;
        if (!Objects.equals(this.maNhanVien, other.maNhanVien)) {
            return false;
        }
        if (!Objects.equals(this.tenNhanVien, other.tenNhanVien)) {
            return false;
        }
        if (!Objects.equals(this.sdt, other.sdt)) {
            return false;
        }
        return Objects.equals(this.congViec, other.congViec);
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNhanVien=" + maNhanVien + ", tenNhanVien=" + tenNhanVien + ", sdt=" + sdt + ", congViec=" + congViec + '}';
    }
    
    
}
