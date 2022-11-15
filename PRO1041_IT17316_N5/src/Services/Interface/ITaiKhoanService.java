/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services.Interface;

import DomainModels.TaiKhoan;


/**
 *
 * @author TRUNG DUC
 */
public interface ITaiKhoanService {
    TaiKhoan checkAccount(String  email,String pass);
    Boolean newAccount();
}
