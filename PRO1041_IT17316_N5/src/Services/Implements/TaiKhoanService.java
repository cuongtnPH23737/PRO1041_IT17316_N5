/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Implements;

import DomainModels.TaiKhoan;
import Reponsitories.Impl.TaiKhoanRepository;
import Reponsitories.Interface.ITaiKhoanRepository;
import Services.Interface.ITaiKhoanService;

/**
 *
 * @author TRUNG DUC
 */
public class TaiKhoanService implements ITaiKhoanService{

    ITaiKhoanRepository iTaiKhoanRepository;

    public TaiKhoanService() {
       iTaiKhoanRepository=new TaiKhoanRepository();
    }
    
    @Override
    public TaiKhoan checkAccount(String email,String pass) {
        return iTaiKhoanRepository.checkAccount(email,pass);
    }
    
}
