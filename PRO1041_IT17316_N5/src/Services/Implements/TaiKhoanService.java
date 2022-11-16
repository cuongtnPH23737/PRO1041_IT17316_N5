/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Implements;

import DomainModels.TaiKhoan;
import Reponsitories.TaiKhoanRepository;
import Services.ITaiKhoanService;
import ViewModels.TaiKhoanView;

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
        TaiKhoan taiKhoan=new TaiKhoan();
        taiKhoan.setEmail(taiKhoanView.getEmail());
        taiKhoan.setPassword(taiKhoanView.getPassword());
        return taiKhoanRepository.dangNhap(taiKhoan);
    }

    @Override
    public Boolean checkTonTai(TaiKhoanView taiKhoanView) {
        TaiKhoan taiKhoan=new TaiKhoan();
        taiKhoan.setEmail(taiKhoanView.getEmail());
        taiKhoan.setMaTk(taiKhoanView.getMaTk());
        return taiKhoanRepository.checkTonTai(taiKhoan);
    }

    @Override
    public Boolean dangKyTkKhachHang(TaiKhoanView taiKhoanView) {
        TaiKhoan taiKhoan=new TaiKhoan();
        taiKhoan.setMaTk(taiKhoanView.getMaTk());
        taiKhoan.setEmail(taiKhoanView.getEmail());
        taiKhoan.setPassword(taiKhoanView.getPassword());
        return taiKhoanRepository.dangKyTkKhachHang(taiKhoan);
    }

}
