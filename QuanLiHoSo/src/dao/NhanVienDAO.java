/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.sun.jdi.connect.spi.Connection;
import database.JDBCUtil;
import java.sql.Date;
import java.util.ArrayList;
import model.NhanVien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.Phieu;

/**
 *
 * @author kali
 */
public class NhanVienDAO implements DAOInterface<NhanVien> {

    public static NhanVienDAO getInstance() {
        return new NhanVienDAO();
    }

    @Override
    public int insert(NhanVien t) {
        int ketQua = 0;
        try {
            java.sql.Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO NhanVien (maNhanVien, tenNhanVien, Sdt, congViec) VALUES (?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaNhanVien());
            pst.setString(2, t.getTenNhanVien());
            pst.setString(3, t.getSdt());
            pst.setString(4, t.getCongViec());
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, "Không thêm được nhân viên " + t.getMaNhanVien(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int update(NhanVien t) {
        int ketQua = 0;
        try {
            java.sql.Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE NhanVien SET maNhanVien=?, tenNhanVien=?, Sdt=?, congViec=? WHERE maNhanVien=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaNhanVien());
            pst.setString(2, t.getTenNhanVien());
            pst.setString(3, t.getSdt());
            pst.setString(4, t.getCongViec());
            pst.setString(5, t.getMaNhanVien());
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;

    }

    @Override
    public int delete(NhanVien t) {
        int ketQua = 0;
        try {
            java.sql.Connection con = JDBCUtil.getConnection();
            String sql = "DELETE FROM NhanVien WHERE maNhanVien=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaNhanVien());
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<NhanVien> selectAll() {
        ArrayList<NhanVien> ketQua = new ArrayList<NhanVien>();
        try {
            java.sql.Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM NhanVien";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maNhaCungCap = rs.getString("maNhanVien");
                String tenNhaCungCap = rs.getString("tenNhanVien");
                String sdt = rs.getString("Sdt");
                String diaChi = rs.getString("congViec");
                NhanVien ncc = new NhanVien(maNhaCungCap, tenNhaCungCap, sdt, diaChi);
                ketQua.add(ncc);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public NhanVien selectById(String t) {
        NhanVien ketQua = null;
        try {
            java.sql.Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM NhanVien WHERE maNhanVien=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maNhaCungCap = rs.getString("maNhanVien");
                String tenNhaCungCap = rs.getString("tenNhanVien");
                String sdt = rs.getString("Sdt");
                String diaChi = rs.getString("congViec");
                ketQua = new NhanVien(maNhaCungCap, tenNhaCungCap, sdt, diaChi);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
}
