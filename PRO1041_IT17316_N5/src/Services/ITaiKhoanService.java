/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.TaiKhoan;
import ViewModels.TaiKhoanView;

/**
 *
 * @author TRUNG DUC
 */
public interface ITaiKhoanService {

    TaiKhoanView dangNhap(TaiKhoanView taiKhoanView);

    Boolean checkTonTai(TaiKhoanView taiKhoanView);

    Boolean dangKyTkKhachHang(TaiKhoanView taiKhoanView);
}