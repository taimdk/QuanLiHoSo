/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

public class HoSo {
    private String maHoSo;
    private String tenNguoi;
    private int Tuoi;
    private double CMND;
    private String diaChi;
    private String Sdt;
    private String soThich;
    private String Email;
    private String kinhNghiem;
    private int trangThai;
    

    public HoSo() {
        
    }
    
    public HoSo(String maHoSo, String tenNguoi, int Tuoi, double CMND, String diaChi, String loaiHoSo, int trangThai){
        
    }

    public HoSo(String maHoSo, String tenNguoi, int Tuoi, double CMND, String diaChi, String Sdt, String soThich, String Email, String kinhNghiem,int trangThai) {
        this.maHoSo = maHoSo;
        this.tenNguoi = tenNguoi;
        this.Tuoi = Tuoi;
        this.CMND = CMND;
        this.diaChi = diaChi;
        this.Sdt = Sdt;
        this.soThich = soThich;
        this.Email = Email;
        this.kinhNghiem = kinhNghiem;
        this.trangThai = trangThai;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public HoSo(String maHoSo, String tenNguoi, int Tuoi, double CMND,String diaChi, String Sdt,String kinhNghiem) {
        this.maHoSo = maHoSo;
        this.tenNguoi = tenNguoi;
        this.Tuoi = Tuoi;
        this.CMND = CMND;
        this.diaChi = diaChi;
        this.Sdt = Sdt;
        this.kinhNghiem = kinhNghiem;
    }

    public String getMaHoSo() {
        return maHoSo;
    }

    public void setMaHoSo(String maHoSo) {
        this.maHoSo = maHoSo;
    }

    public String getTenNguoi() {
        return tenNguoi;
    }

    public void setTenNguoi(String tenNguoi) {
        this.tenNguoi = tenNguoi;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public double getCMND() {
        return CMND;
    }

    public void setCMND(double CMND) {
        this.CMND = CMND;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public String getSoThich() {
        return soThich;
    }

    public void setSoThich(String soThich) {
        this.soThich = soThich;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getKinhNghiem() {
        return kinhNghiem;
    }

    public void setKinhNghiem(String kinhNghiem) {
        this.kinhNghiem = kinhNghiem;
    }

    public void xuatHang(int sl) {
        this.Tuoi -= sl;
    }
    
    @Override
    public String toString() {
        return "HoSo{" + "maHoSo=" + maHoSo + ", tenNguoi=" + tenNguoi + ", Tuoi=" + Tuoi + ", CMND=" + CMND + ", diaChi=" + diaChi + ", Sdt=" + Sdt + ", soThich=" + soThich + ", Email=" + Email + ", kinhNghiem=" + kinhNghiem + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.maHoSo);
        hash = 37 * hash + Objects.hashCode(this.tenNguoi);
        hash = 37 * hash + this.Tuoi;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.CMND) ^ (Double.doubleToLongBits(this.CMND) >>> 32));
        hash = 37 * hash + Objects.hashCode(this.diaChi);
        hash = 37 * hash + Objects.hashCode(this.Sdt);
        hash = 37 * hash + Objects.hashCode(this.soThich);
        hash = 37 * hash + Objects.hashCode(this.Email);
        hash = 37 * hash + Objects.hashCode(this.kinhNghiem);
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
        final HoSo other = (HoSo) obj;
        if (this.Tuoi != other.Tuoi) {
            return false;
        }
        if (Double.doubleToLongBits(this.CMND) != Double.doubleToLongBits(other.CMND)) {
            return false;
        }
        if (!Objects.equals(this.maHoSo, other.maHoSo)) {
            return false;
        }
        if (!Objects.equals(this.tenNguoi, other.tenNguoi)) {
            return false;
        }
        if (!Objects.equals(this.diaChi, other.diaChi)) {
            return false;
        }
        if (!Objects.equals(this.Sdt, other.Sdt)) {
            return false;
        }
        if (!Objects.equals(this.soThich, other.soThich)) {
            return false;
        }
        if (!Objects.equals(this.Email, other.Email)) {
            return false;
        }
        return Objects.equals(this.kinhNghiem, other.kinhNghiem);
    }
}
