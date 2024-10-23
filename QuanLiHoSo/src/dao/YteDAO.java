/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.HSTaiChinh;
import model.HSyte;

/**
 *
 * @author Tran Nhat Sinh
 */
public class YteDAO implements DAOInterface<HSyte> {

    public static YteDAO getInstance() {
        return new YteDAO();
    }

    @Override
    public int insert(HSyte t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO HoSo (maHoSo, tenNguoi, tuoi, diaChi, sdt, email, CMND, lichSuBenhLi, lieuLuongThuocDaDung, soThich, loaiHoSo, kinhNghiemLamViec, trangThai) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaHoSo());
            pst.setString(2, t.getTenNguoi());
            pst.setInt(3, t.getTuoi());
            pst.setString(4, t.getDiaChi());
            pst.setString(5, t.getSdt());
            pst.setString(6, t.getEmail());
            pst.setDouble(7, t.getCMND());
            pst.setString(8, t.getBenhLi());
            pst.setInt(9, t.getLieuLuong());
            pst.setString(10, t.getSoThich());
            pst.setString(11, "Y tế");
            pst.setString(12, t.getKinhNghiem());
            pst.setInt(13, t.getTrangThai());
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int update(HSyte t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            //String sql = "INSERT INTO MayTinh (maMay, tenMay, soLuong, tenCpu, ram, cardManHinh, gia, dungLuongPin, dungLuongPin, dungLuongPin, loaiMay, rom) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            String sql = "UPDATE HoSo SET maHoSo=?, tenNguoi=?, tuoi=?, diaChi=?, sdt=?, email=?, CMND=?, lichSuBenhLi=?, lieuLuongThuocDaDung=?, soThich=?, loaiHoSo = ?, kinhNghiemLamViec = ?, trangThai = ? WHERE maHoSo=? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaHoSo()); 
            pst.setString(2, t.getTenNguoi());
            pst.setInt(3, t.getTuoi());
            pst.setString(4, t.getDiaChi());
            pst.setString(5, t.getSdt());
            pst.setString(6, t.getEmail());
            pst.setDouble(7, t.getCMND());
            pst.setString(8, t.getBenhLi());
            pst.setInt(9, t.getLieuLuong());
            pst.setString(10, t.getSoThich());
            pst.setString(11, "Y tế");
            pst.setString(12, t.getKinhNghiem());
            pst.setInt(13, t.getTrangThai());
            pst.setString(14, t.getMaHoSo());
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int delete(HSyte t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "DELETE FROM HoSo WHERE maHoSo=? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaHoSo());
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<HSyte> selectAll() {
        ArrayList<HSyte> ketQua = new ArrayList<HSyte>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM HoSo";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maMay = rs.getString("maHoSo");
                String tenMay = rs.getString("tenNguoi");
                int soLuong = rs.getInt("tuoi");
                String tenCpu = rs.getString("diaChi");
                String ram = rs.getString("sdt");
                String cardManHinh = rs.getString("email");
                double gia = rs.getDouble("CMND");
                String mainBoard = rs.getString("lichSuBenhLi");
                int congSuatNguon = rs.getInt("lieuLuongThuocDaDung");
                String rom = rs.getString("kinhNghiemLamViec");
                String xuatXu = rs.getString("soThich");
                int trangThai = rs.getInt("trangThai");
                HSyte mt = new HSyte(mainBoard, congSuatNguon, maMay, tenMay, soLuong, gia, tenCpu, ram, xuatXu, cardManHinh, rom,trangThai);
                ketQua.add(mt);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public HSyte selectById(String t) {
        HSyte ketQua = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM HoSo WHERE maHoSo=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maMay = rs.getString("maHoSo");
                String tenMay = rs.getString("tenNguoi");
                int soLuong = rs.getInt("tuoi");
                String tenCpu = rs.getString("diaChi");
                String ram = rs.getString("sdt");
                String cardManHinh = rs.getString("email");
                double gia = rs.getDouble("CMND");
                String mainBoard = rs.getString("lichSuBenhLi");
                int congSuatNguon = rs.getInt("lieuLuongThuocDaDung");
                String rom = rs.getString("kinhNghiemLamViec");
                String xuatXu = rs.getString("soThich");
                int trangThai = rs.getInt("trangThai");
                //Laptop(String kichThuocMan, String dungLuongPin, String maMay, String tenMay, int soLuong, double gia, String tenCpu, String ram, String xuatXu, String cardManHinh, String Rom)
                ketQua = new HSyte(mainBoard, congSuatNguon, maMay, tenMay, soLuong, gia, tenCpu, ram, xuatXu, cardManHinh, rom,trangThai);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
}
