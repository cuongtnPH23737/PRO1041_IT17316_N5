/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Implements;

import DomainModels.KhachHangDM;
import Reponsitories.KhachHangRep;
import Services.KhachHangService;
import java.util.List;

/**
 *
 * @author nhatc
 */
public class KhachHangSI implements KhachHangService {

    private KhachHangRep rep = new KhachHangRep();

    @Override
    public List<KhachHangDM> getAll() {
        return rep.getAll();
    }

    @Override
    public String add(KhachHangDM kh) {
        if (kh.getMaKH().isBlank() || kh.getTenKH().isBlank() || kh.getDiaChi().isBlank() || kh.getSdt().isBlank()) {
            return "Xin nhap day du thong tin khach hang";
        } else if (rep.add(kh) == true) {
            return "Them thong tin khach hang thanh cong";
        } else {
            return "Them thong tin khach hang that bai";
        }
    }

    @Override
    public String update(String ma, KhachHangDM kh) {
        if (kh.getMaKH().isBlank() || kh.getTenKH().isBlank() || kh.getDiaChi().isBlank() || kh.getSdt().isBlank()) {
            return "Xin nhap day du thong tin khach hang";
        } else if (rep.update(ma, kh) == true) {
            return "Cap nhat thong tin khach hang thanh cong";
        } else {
            return "Cap nhat thong tin khach hang that bai";
        }
    }

    @Override
    public String delete(String ma) {
        if (ma.isBlank()) {
            return "Xin nhap ma khach hang can xoa";
        } else if (rep.delete(ma) == true) {
            return "Xoa thong tin khach hang thanh cong";
        } else {
            return "Xoa thong tin khach hang that bai";
        }
    }
}
