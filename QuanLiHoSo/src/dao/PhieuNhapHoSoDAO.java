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
import model.Phieu;
import model.PhieuNhap;

public class PhieuNhapHoSoDAO implements DAOInterface<PhieuNhap> {

    public static PhieuNhapHoSoDAO getInstance() {
        return new PhieuNhapHoSoDAO();
    }

    @Override
    public int insert(PhieuNhap t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO PhieuNhapHoSo (maPhieu, thoiGianTao, nguoiTao,maNhanVien, tongThoiGianLamViec) VALUES (?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaPhieu());
            pst.setTimestamp(2, t.getThoiGianTao());
            pst.setString(3, t.getNguoiTao());
            pst.setString(4, t.getNhanVien());
            pst.setDouble(5, t.getTongThoiGianLamViec());
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int update(PhieuNhap t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE PhieuNhapHoSo SET maPhieu=?, thoiGianTao=?, nguoiTao=?, maNhanVien=?, tongThoiGianLamViec = ? WHERE maPhieu=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaPhieu());
            pst.setTimestamp(2, t.getThoiGianTao());
            pst.setString(3, t.getNguoiTao());
            pst.setString(4, t.getNhanVien());
            pst.setDouble(5, t.getTongThoiGianLamViec());
            pst.setString(6, t.getMaPhieu());
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int delete(PhieuNhap t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "DELETE FROM PhieuNhapHoSo WHERE maPhieu=?";
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
    public ArrayList<PhieuNhap> selectAll() {
        ArrayList<PhieuNhap> ketQua = new ArrayList<PhieuNhap>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM PhieuNhapHoSo ORDER BY thoiGianTao DESC";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maPhieu = rs.getString("maPhieu");
                Timestamp thoiGianTao = rs.getTimestamp("thoiGianTao");
                String nguoiTao = rs.getString("nguoiTao");
                String maNhanVien = rs.getString("maNhanVien");
                double tongThoiGianLamViec = rs.getDouble("tongThoiGianLamViec");
                PhieuNhap p = new PhieuNhap(maNhanVien, maPhieu, thoiGianTao, nguoiTao, ChiTietPhieuNhapHoSoDAO.getInstance().selectAll(maPhieu), tongThoiGianLamViec);
                ketQua.add(p);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public PhieuNhap selectById(String t) {
        PhieuNhap ketQua = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM PhieuNhapHoSo WHERE maPhieu=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maPhieu = rs.getString("maPhieu");
                Timestamp thoiGianTao = rs.getTimestamp("thoiGianTao");
                String nguoiTao = rs.getString("nguoiTao");
                String maNhanVien = rs.getString("maNhanVien");
                double tongThoiGianLamViec = rs.getDouble("tongThoiGianLamViec");
                ketQua = new PhieuNhap(maNhanVien, maPhieu, thoiGianTao, nguoiTao, ChiTietPhieuNhapHoSoDAO.getInstance().selectAll(maPhieu), tongThoiGianLamViec);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    public ArrayList<Phieu> selectAllAccount(String acc) {
        ArrayList<Phieu> ketQua = new ArrayList<Phieu>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT maPhieu,thoiGianTao,nguoiTao,tongThoiGianLamViec FROM PhieuNhapHoSo UNION SELECT * FROM PhieuXuatHoSo WHERE nguoiTao = ? ORDER BY thoiGianTao DESC";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, acc);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maPhieu = rs.getString("maPhieu");
                Timestamp thoiGianTao = rs.getTimestamp("thoiGianTao");
                String nguoiTao = rs.getString("nguoiTao");
                double tongThoiGianLamViec = rs.getDouble("tongThoiGianLamViec");
                Phieu p = new Phieu(maPhieu, thoiGianTao, nguoiTao, ChiTietPhieuNhapHoSoDAO.getInstance().selectAll(maPhieu), tongThoiGianLamViec);
                ketQua.add(p);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    public ArrayList<Phieu> selectAllP() {
        ArrayList<Phieu> ketQua = new ArrayList<Phieu>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT maPhieu,thoiGianTao,nguoiTao,tongThoiGianLamViec FROM PhieuNhap UNION SELECT * FROM PhieuXuatHoSo ORDER BY thoiGianTao DESC";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maPhieu = rs.getString("maPhieu");
                Timestamp thoiGianTao = rs.getTimestamp("thoiGianTao");
                String nguoiTao = rs.getString("nguoiTao");
                double tongThoiGianLamViec = rs.getDouble("tongThoiGianLamViec");
                Phieu p = new Phieu(maPhieu, thoiGianTao, nguoiTao, ChiTietPhieuNhapHoSoDAO.getInstance().selectAll(maPhieu), tongThoiGianLamViec);
                ketQua.add(p);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

}
