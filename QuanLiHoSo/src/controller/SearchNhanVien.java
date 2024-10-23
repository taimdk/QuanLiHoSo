/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.NhanVienDAO;
import java.util.ArrayList;
import model.NhanVien;

/**
 *
 * 
 */
public class SearchNhanVien {

    public static SearchNhanVien getInstance() {
        return new SearchNhanVien();
    }

    public ArrayList<NhanVien> searchTatCa(String text) {
        ArrayList<NhanVien> result = new ArrayList<>();
        ArrayList<NhanVien> armt = NhanVienDAO.getInstance().selectAll();
        for (var ncc : armt) {
            if (ncc.getMaNhanVien().toLowerCase().contains(text.toLowerCase())
                    || ncc.getTenNhanVien().toLowerCase().contains(text.toLowerCase())
                    || ncc.getSdt().toLowerCase().contains(text.toLowerCase())
                    || ncc.getCongViec().toLowerCase().contains(text.toLowerCase())) {
                result.add(ncc);
            }
        }
        return result;
    }

    public ArrayList<NhanVien> searchTenNCC(String text) {
        ArrayList<NhanVien> result = new ArrayList<>();
        ArrayList<NhanVien> armt = NhanVienDAO.getInstance().selectAll();
        for (var ncc : armt) {
            if (ncc.getTenNhanVien().toLowerCase().contains(text.toLowerCase())) {
                result.add(ncc);
            }
        }
        return result;
    }

    public ArrayList<NhanVien> searchMaNCC(String text) {
        ArrayList<NhanVien> result = new ArrayList<>();
        ArrayList<NhanVien> armt = NhanVienDAO.getInstance().selectAll();
        for (var ncc : armt) {
            if (ncc.getMaNhanVien().toLowerCase().contains(text.toLowerCase())) {
                result.add(ncc);
            }
        }
        return result;
    }

    public ArrayList<NhanVien> searchDiaChi(String text) {
        ArrayList<NhanVien> result = new ArrayList<>();
        ArrayList<NhanVien> armt = NhanVienDAO.getInstance().selectAll();
        for (var ncc : armt) {
            if (ncc.getCongViec().toLowerCase().contains(text.toLowerCase())) {
                result.add(ncc);
            }
        }
        return result;
    }

    public ArrayList<NhanVien> searchSdt(String text) {
        ArrayList<NhanVien> result = new ArrayList<>();
        ArrayList<NhanVien> armt = NhanVienDAO.getInstance().selectAll();
        for (var ncc : armt) {
            if (ncc.getSdt().toLowerCase().contains(text.toLowerCase())) {
                result.add(ncc);
            }
        }
        return result;
    }
}
