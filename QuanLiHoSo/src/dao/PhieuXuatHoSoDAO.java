/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.Timestamp;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import database.JDBCUtil;
import model.PhieuXuat;

public class PhieuXuatHoSoDAO implements DAOInterface<PhieuXuat> {

    public static PhieuXuatHoSoDAO getInstance() {
        return new PhieuXuatHoSoDAO();
    }

    @Override
    public int insert(PhieuXuat t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO PhieuXuatHoSo (maPhieu, thoiGianTao, nguoiTao, tongThoiGianLamViec) VALUES (?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaPhieu());
            pst.setTimestamp(2, t.getThoiGianTao());
            pst.setString(3, t.getNguoiTao());
            pst.setDouble(4, t.getTongThoiGianLamViec());
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int update(PhieuXuat t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE PhieuXuatHoSo SET maPhieu=?, thoiGianTao=?, nguoiTao=?, tongThoiGianLamViec = ? WHERE maPhieu=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaPhieu());
            pst.setTimestamp(2, t.getThoiGianTao());
            pst.setString(3, t.getNguoiTao());
            pst.setDouble(4, t.getTongThoiGianLamViec());
            pst.setString(5, t.getMaPhieu());
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int delete(PhieuXuat t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "DELETE FROM PhieuXuatHoSo WHERE maPhieu=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaPhieu());
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<PhieuXuat> selectAll() {
        ArrayList<PhieuXuat> ketQua = new ArrayList<PhieuXuat>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM PhieuXuatHoSo ORDER BY thoiGianTao DESC";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maPhieu = rs.getString("maPhieu");
                Timestamp thoiGianTao = rs.getTimestamp("thoiGianTao");
                String nguoiTao = rs.getString("nguoiTao");
                double tongThoiGianLamViec = rs.getDouble("tongThoiGianLamViec");
                PhieuXuat p = new PhieuXuat(maPhieu, thoiGianTao, nguoiTao, ChiTietPhieuXuatHoSoDAO.getInstance().selectAll(maPhieu), tongThoiGianLamViec);
                ketQua.add(p);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public PhieuXuat selectById(String t) {
        PhieuXuat ketQua = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM PhieuXuatHoSo WHERE maPhieu=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maPhieu = rs.getString("maPhieu");
                Timestamp thoiGianTao = rs.getTimestamp("thoiGianTao");
                String nguoiTao = rs.getString("nguoiTao");
                double tongThoiGianLamViec = rs.getDouble("tongThoiGianLamViec");
                ketQua = new PhieuXuat(maPhieu, thoiGianTao, nguoiTao, ChiTietPhieuXuatHoSoDAO.getInstance().selectAll(maPhieu), tongThoiGianLamViec);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
}
