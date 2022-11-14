/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Implements;

import DomainModels.LuongDM;
import Reponsitories.LuongRep;
import Services.LuongService;
import java.util.List;

/**
 *
 * @author nhatc
 */
public class LuongSI implements LuongService {

    private LuongRep rep = new LuongRep();

    @Override
    public List<LuongDM> getAll() {
        return rep.getAll();
    }

    @Override
    public String add(String ma, String so) {
        if (ma.isBlank() || so.isBlank()) {
            return "Xin nhap thong tin ve luong day du";
        } else if (so.matches("[0-9]+") == false || Integer.parseInt(so) <= 0) {
            return "So luong phai la so va lon hon 0";
        } else {
            LuongDM lg = new LuongDM(ma, Integer.parseInt(so));
            if (rep.add(lg) == true) {
                return "Them thong tin luong thanh cong";
            } else {
                return "Them thong tin luong that bai";
            }
        }
    }

    @Override
    public String delete(String ma) {
        if (rep.delete(ma)==true) {
            return "Xoa thong tin luong thanh cong";
        }else{
            return "Xoa thong tin luong that bai";
        }
    }

    @Override
    public String update(String maCu, String maMoi, String so) {
        if (maMoi.isBlank() || so.isBlank()) {
            return "Xin nhap thong tin ve luong day du";
        } else if (so.matches("[0-9]+") == false || Integer.parseInt(so) <= 0) {
            return "So luong phai la so va lon hon 0";
        } else {
            LuongDM lg = new LuongDM(maMoi, Integer.parseInt(so));
            if (rep.update(maCu, lg)==true) {
                return "Cap nhat thong tin luong thanh cong";
            } else {
                return "Cap nhat thong tin luong that bai";
            }
        }
    }

}
