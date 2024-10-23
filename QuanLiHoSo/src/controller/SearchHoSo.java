package controller;

import dao.HoSoDAO;
import java.util.ArrayList;
import model.HoSo;

/**
 *
 * 
 */
public class SearchHoSo {

    public static SearchHoSo getInstance() {
        return new SearchHoSo();
    }

    public ArrayList<HoSo> searchTatCa(String text) {
        ArrayList<HoSo> result = new ArrayList<>();
        ArrayList<HoSo> armt = HoSoDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.getTrangThai() == 1) {
                if (mt.getMaHoSo().toLowerCase().contains(text.toLowerCase()) || mt.getTenNguoi().toLowerCase().contains(text.toLowerCase())
                        || mt.getDiaChi().toLowerCase().contains(text.toLowerCase())
                        || mt.getEmail().toLowerCase().contains(text.toLowerCase())
                        || mt.getSoThich().toLowerCase().contains(text.toLowerCase())) {
                    result.add(mt);
                }
            }
        }
        return result;
    }

    public ArrayList<HoSo> searchMaMay(String text) {
        ArrayList<HoSo> result = new ArrayList<>();
        ArrayList<HoSo> armt = HoSoDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.getTrangThai() == 1) {
                if (mt.getMaHoSo().toLowerCase().contains(text.toLowerCase())) {
                    result.add(mt);
                }
            }
        }
        return result;
    }

    public ArrayList<HoSo> searchTenMay(String text) {
        ArrayList<HoSo> result = new ArrayList<>();
        ArrayList<HoSo> armt = HoSoDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.getTrangThai() == 1) {
                if (mt.getTenNguoi().toLowerCase().contains(text.toLowerCase())) {
                    result.add(mt);
                }
            }
        }
        return result;
    }

    public ArrayList<HoSo> searchSoLuong(String text) {
        ArrayList<HoSo> result = new ArrayList<>();
        ArrayList<HoSo> armt = HoSoDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.getTrangThai() == 1) {
                if (text.length() != 0) {
                    if (mt.getTuoi() > Integer.parseInt(text)) {
                        result.add(mt);
                    }
                } else {
                    result.add(mt);
                }
            }
        }
        return result;
    }

    public ArrayList<HoSo> searchDonGia(String text) {
        ArrayList<HoSo> result = new ArrayList<>();
        ArrayList<HoSo> armt = HoSoDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.getTrangThai() == 1) {

                if (text.length() != 0) {
                    if (mt.getCMND() > Integer.parseInt(text)) {
                        result.add(mt);
                    }
                }
                else {
                    result.add(mt);
                }
            } 
        }
        return result;
    }

    public ArrayList<HoSo> searchRam(String text) {
        ArrayList<HoSo> result = new ArrayList<>();
        ArrayList<HoSo> armt = HoSoDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.getSdt().toLowerCase().contains(text.toLowerCase())) {
                result.add(mt);
            }
        }
        return result;
    }

    public ArrayList<HoSo> searchCpu(String text) {
        ArrayList<HoSo> result = new ArrayList<>();
        ArrayList<HoSo> armt = HoSoDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.getDiaChi().toLowerCase().contains(text.toLowerCase())) {
                result.add(mt);
            }
        }
        return result;
    }

    public ArrayList<HoSo> searchDungLuong(String text) {
        ArrayList<HoSo> result = new ArrayList<>();
        ArrayList<HoSo> armt = HoSoDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.getKinhNghiem().toLowerCase().contains(text.toLowerCase())) {
                result.add(mt);
            }
        }
        return result;
    }

    public ArrayList<HoSo> searchCard(String text) {
        ArrayList<HoSo> result = new ArrayList<>();
        ArrayList<HoSo> armt = HoSoDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.getEmail().toLowerCase().contains(text.toLowerCase())) {
                result.add(mt);
            }
        }
        return result;
    }


    public ArrayList<HoSo> searchXuatXu(String text) {
        ArrayList<HoSo> result = new ArrayList<>();
        ArrayList<HoSo> armt = HoSoDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.getSoThich().toLowerCase().contains(text.toLowerCase())) {
                result.add(mt);
            }
        }
        return result;
    }

    public ArrayList<HoSo> searchDaXoa(String text) {
        ArrayList<HoSo> result = new ArrayList<>();
        ArrayList<HoSo> armt = HoSoDAO.getInstance().selectAll();
        for (var mt : armt) {
            if (mt.getTrangThai() == 0) {
                if (mt.getMaHoSo().toLowerCase().contains(text.toLowerCase())) {
                    result.add(mt);
                }
            }
        }
        return result;
    }

    public HoSo searchId(String text) {
        HoSo result = new HoSo();
        ArrayList<HoSo> armt = HoSoDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.getMaHoSo().toLowerCase().contains(text.toLowerCase())) {
                return mt;
            }
        }
        return null;
    }
}
