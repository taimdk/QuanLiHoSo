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
import javax.swing.JOptionPane;
import model.HSTaiChinh;
import model.HoSo;

/**
 *
 * @author Tran Nhat Sinh
 */
public class TaiChinhDAO implements DAOInterface<HSTaiChinh> {

    public static TaiChinhDAO getInstance() {
        return new TaiChinhDAO();
    }

    @Override
    public int insert(HSTaiChinh t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO HoSo (maHoSo, tenNguoi, tuoi, diaChi, sdt, email, CMND, taiSanHienCo, thuNhap, soThich, loaiHoSo, kinhNghiemLamViec, trangThai) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaHoSo());
            pst.setString(2, t.getTenNguoi());
            pst.setInt(3, t.getTuoi());
            pst.setString(4, t.getDiaChi());
            pst.setString(5, t.getSdt());
            pst.setString(6, t.getEmail());
            pst.setDouble(7, t.getCMND());
            pst.setString(8, t.getTaiSan());
            pst.setDouble(9, t.getThuNhap());
            pst.setString(10, t.getSoThich());
            pst.setString(11, "Tài chính");
            pst.setString(12, t.getKinhNghiem());
            pst.setInt(13, t.getTrangThai());
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thêm được " + t.getMaHoSo(),"Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return ketQua;
    }

    @Override
    public int update(HSTaiChinh t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            //String sql = "INSERT INTO MayTinh (maMay, tenMay, soLuong, tenCpu, ram, cardManHinh, gia, dungLuongPin, dungLuongPin, dungLuongPin, loaiMay, rom) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            String sql = "UPDATE HoSo SET maHoSo=?, tenNguoi=?, tuoi=?, diaChi=?, sdt=?, email=?, CMND=?, taiSanHienCo=?, thuNhap=?, soThich=?, loaiHoSo = ?, kinhNghiemLamViec = ?, trangThai = ? WHERE maHoSo=? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaHoSo());
            pst.setString(2, t.getTenNguoi());
            pst.setInt(3, t.getTuoi());
            pst.setString(4, t.getDiaChi());
            pst.setString(5, t.getSdt());
            pst.setString(6, t.getEmail());
            pst.setDouble(7, t.getCMND());
            pst.setString(8, t.getTaiSan());
            pst.setDouble(9, t.getThuNhap());
            pst.setString(10, t.getSoThich());
            pst.setString(11, "Tài chính");
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
    public int delete(HSTaiChinh t) {
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
    public ArrayList<HSTaiChinh> selectAll() {
        ArrayList<HSTaiChinh> ketQua = new ArrayList<HSTaiChinh>();
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
                double kichThuocMan = rs.getDouble("thuNhap");
                String dungLuongPin = rs.getString("taiSanHienCo");
                String rom = rs.getString("kinhNghiemLamViec");
                String xuatXu = rs.getString("soThich");
                int trangThai = rs.getInt("trangThai");
                HSTaiChinh mt = new HSTaiChinh(kichThuocMan, dungLuongPin, maMay, tenMay, soLuong, gia, tenCpu, ram, xuatXu, cardManHinh, rom, trangThai);
                ketQua.add(mt);
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public HSTaiChinh selectById(String t) {
        HSTaiChinh ketQua = null;
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
                double kichThuocMan = rs.getDouble("thuNhap");
                String dungLuongPin = rs.getString("taiSanHienCo");
                String rom = rs.getString("kinhNghiemLamViec");
                String xuatXu = rs.getString("soThich");
                int trangThai = rs.getInt("trangThai");
                //Laptop(String kichThuocMan, String dungLuongPin, String maMay, String tenMay, int soLuong, double gia, String tenCpu, String ram, String xuatXu, String cardManHinh, String Rom)
                ketQua = new HSTaiChinh(kichThuocMan, dungLuongPin, maMay, tenMay, soLuong, gia, tenCpu, ram, xuatXu, cardManHinh, rom, trangThai);
            }
            JDBCUtil.closeConnection(con);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    public boolean isTaiChinh(String id) {
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM HoSo WHERE maHoSo= ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, id);
            ResultSet rs = pst.executeQuery();
            String tl = null;
            while (rs.next()) {
                tl = rs.getString("loaiHoSo");
            }
            if (tl.equals("Tài chính")) {
                return true;
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return false;
    }
}
