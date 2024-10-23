/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import database.JDBCUtil;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.HSTaiChinh;
import model.HoSo;

public class HoSoDAO implements DAOInterface<HoSo> {

    public static HoSoDAO getInstance() {
        return new HoSoDAO();
    }

    @Override
    public int insert(HoSo t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(HoSo t) {
        int ketqua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE HoSo SET tenNguoi = ?,tuoi=?,CMND=?,diaChi=?,sdt=?,soThich=?,email=?,kinhNghiemLamViec=?,trangThai=? WHERE maHoSo=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getTenNguoi());
            pst.setInt(2, t.getTuoi());
            pst.setDouble(3, t.getCMND());
            pst.setString(4, t.getDiaChi());
            pst.setString(5, t.getSdt());
            pst.setString(6, t.getSoThich());
            pst.setString(7, t.getEmail());
            pst.setString(8, t.getKinhNghiem());
            pst.setInt(9, t.getTrangThai());
            pst.setString(10, t.getMaHoSo());
            ketqua = pst.executeUpdate(sql);
            JDBCUtil.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(HoSoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ketqua;
    }

    @Override
    public int delete(HoSo t) {
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
    public ArrayList<HoSo> selectAll() {
        ArrayList<HoSo> ketQua = new ArrayList<HoSo>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT maHoSo,tenNguoi,tuoi,CMND,diaChi,sdt,soThich,email,kinhNghiemLamViec,trangThai FROM HoSo";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maMay = rs.getString("maHoSo");
                String tenMay = rs.getString("tenNguoi");
                int soLuong = rs.getInt("tuoi");
                double gia = rs.getDouble("CMND");
                String tenCpu = rs.getString("diaChi");
                String ram = rs.getString("sdt");
                String xuatXu = rs.getString("soThich");
                String cardManHinh = rs.getString("email");
                String rom = rs.getString("kinhNghiemLamViec");
                int trangThai = rs.getInt("trangThai");
                HoSo mt = new HoSo(maMay, tenMay, soLuong, gia, tenCpu, ram, xuatXu, cardManHinh, rom, trangThai);
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
    public HoSo selectById(String t) {
        HoSo ketQua = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT maHoSo,tenNguoi,tuoi,CMND,diaChi,sdt,soThich,email,kinhNghiemLamViec,trangThai FROM HoSo WHERE maHoSo = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t);

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maMay = rs.getString("maHoSo");
                String tenMay = rs.getString("tenNguoi");
                int soLuong = rs.getInt("tuoi");
                double gia = rs.getDouble("CMND");
                String tenCpu = rs.getString("diaChi");
                String ram = rs.getString("sdt");
                String xuatXu = rs.getString("soThich");
                String cardManHinh = rs.getString("email");
                String rom = rs.getString("kinhNghiemLamViec");
                int trangThai = rs.getInt("trangThai");
                ketQua = new HoSo(maMay, tenMay, soLuong, gia, tenCpu, ram, xuatXu, cardManHinh, rom, trangThai);
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    public int updateSoLuong(String maMay, int soluong) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            //String sql = "INSERT INTO MayTinh (maMay, tenMay, soLuong, tenCpu, ram, cardManHinh, gia, dungLuongPin, dungLuongPin, dungLuongPin, loaiMay, rom) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            String sql = "UPDATE HoSo SET tuoi=? WHERE maHoSo=? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, soluong);
            pst.setString(2, maMay);
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQua;
    }
    
    public int deleteTrangThai(String maMay){
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            //String sql = "INSERT INTO MayTinh (maMay, tenMay, soLuong, tenCpu, ram, cardManHinh, gia, dungLuongPin, dungLuongPin, dungLuongPin, loaiMay, rom) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            String sql = "UPDATE HoSo SET trangThai=0 WHERE maHoSo=? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, maMay);
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    public ArrayList<HoSo> selectAllE() {
        ArrayList<HoSo> ketQua = new ArrayList<HoSo>();
        ArrayList<HoSo> ketQuaTonKho = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT maHoSo,tenNguoi,tuoi,CMND,diaChi,sdt,soThich,email,kinhNghiemLamViec,trangThai FROM HoSo";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maMay = rs.getString("maHoSo");
                String tenMay = rs.getString("tenNguoi");
                int soLuong = rs.getInt("tuoi");
                double gia = rs.getDouble("CMND");
                String tenCpu = rs.getString("diaChi");
                String ram = rs.getString("sdt");
                String xuatXu = rs.getString("soThich");
                String cardManHinh = rs.getString("email");
                String rom = rs.getString("kinhNghiemLamViec");
                int trangThai = rs.getInt("trangThai");
                HoSo mt = new HoSo(maMay, tenMay, soLuong, gia, tenCpu, ram, xuatXu, cardManHinh, rom, trangThai);
                ketQua.add(mt);
            }
            for (HoSo mayTinh : ketQua) {
                if (mayTinh.getTuoi() > 0) {
                    ketQuaTonKho.add(mayTinh);
                }
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQuaTonKho;
    }
    
        public ArrayList<HoSo> selectAllExist() {
        ArrayList<HoSo> ketQua = new ArrayList<HoSo>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT maHoSo,tenNguoi,tuoi,CMND,diaChi,sdt,soThich,email,kinhNghiemLamViec,trangThai FROM HoSo WHERE trangThai = 1";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maMay = rs.getString("maHoSo");
                String tenMay = rs.getString("tenNguoi");
                int soLuong = rs.getInt("tuoi");
                double gia = rs.getDouble("CMND");
                String tenCpu = rs.getString("diaChi");
                String ram = rs.getString("sdt");
                String xuatXu = rs.getString("soThich");
                String cardManHinh = rs.getString("email");
                String rom = rs.getString("kinhNghiemLamViec");
                int trangThai = rs.getInt("trangThai");
                HoSo mt = new HoSo(maMay, tenMay, soLuong, gia, tenCpu, ram, xuatXu, cardManHinh, rom, trangThai);
                ketQua.add(mt);
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
        
    public int getSl() {
        int soluong = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM HoSo WHERE trangThai = 1";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                soluong++;
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return soluong;
    }
}
