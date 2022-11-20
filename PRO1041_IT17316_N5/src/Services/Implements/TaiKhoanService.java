/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Implements;

import DomainModels.TaiKhoan;
import Reponsitories.TaiKhoanRepository;
import Services.ITaiKhoanService;
import ViewModels.TaiKhoanView;
import java.util.ArrayList;

/**
 *
 * @author TRUNG DUC
 */
public class TaiKhoanService implements ITaiKhoanService {

    TaiKhoanRepository taiKhoanRepository;

    public TaiKhoanService() {
        taiKhoanRepository = new TaiKhoanRepository();
    }

    @Override
    public TaiKhoanView dangNhap(TaiKhoanView taiKhoanView) {
        TaiKhoan taiKhoan = new TaiKhoan();
        taiKhoan.setEmail(taiKhoanView.getEmail());
        taiKhoan.setPassword(taiKhoanView.getPassword());
        return taiKhoanRepository.dangNhap(taiKhoan);
    }

    @Override
    public Boolean checkTonTai(TaiKhoanView taiKhoanView) {
        TaiKhoan taiKhoan = new TaiKhoan();
        taiKhoan.setEmail(taiKhoanView.getEmail());
        taiKhoan.setMaTk(taiKhoanView.getMaTk());
        return taiKhoanRepository.checkTonTai(taiKhoan);
    }

    @Override
    public Boolean dangKyTkKhachHang(TaiKhoanView taiKhoanView) {
        TaiKhoan taiKhoan = new TaiKhoan();
        taiKhoan.setMaTk(taiKhoanView.getMaTk());
        taiKhoan.setEmail(taiKhoanView.getEmail());
        taiKhoan.setPassword(taiKhoanView.getPassword());
        return taiKhoanRepository.dangKyTkKhachHang(taiKhoan);
    }

    @Override
    public ArrayList<TaiKhoanView> getAll() {
        ArrayList<TaiKhoanView> listView = new ArrayList<>();
        ArrayList<TaiKhoan> list = taiKhoanRepository.getAll();

        for (TaiKhoan taiKhoan : list) {
            listView.add(new TaiKhoanView(
                    taiKhoan.getMaTk(),
                    taiKhoan.getEmail(),
                    taiKhoan.getPassword(),
                    taiKhoan.getLoaiTk()));
        }

        return listView;
    }

    @Override
    public Boolean them(TaiKhoanView taiKhoanView) {
        TaiKhoan taiKhoan = new TaiKhoan(
                taiKhoanView.getMaTk(),
                taiKhoanView.getEmail(),
                taiKhoanView.getPassword(),
                taiKhoanView.getLoaiTk());
        return taiKhoanRepository.them(taiKhoan);
    }

    @Override
    public Boolean sua(TaiKhoanView taiKhoanView, String matk) {
        TaiKhoan taiKhoan = new TaiKhoan(
                taiKhoanView.getMaTk(),
                taiKhoanView.getEmail(),
                taiKhoanView.getPassword(),
                taiKhoanView.getLoaiTk());
        return taiKhoanRepository.sua(taiKhoan, matk);
    }

    @Override
    public Boolean xoa(String matk) {
        return taiKhoanRepository.xoa(matk);
    }

}
