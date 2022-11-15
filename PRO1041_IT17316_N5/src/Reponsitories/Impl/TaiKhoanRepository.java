/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reponsitories.Impl;

import DomainModels.TaiKhoan;
import Reponsitories.Interface.ITaiKhoanRepository;
import Ultilities.SQLServerConnect;

import java.sql.*;

/**
 *
 * @author TRUNG DUC
 */
public class TaiKhoanRepository implements ITaiKhoanRepository {
    final String check_account = "select matk,loaitk from taikhoan where email=? and password=?";

    public TaiKhoanRepository() {
    }

    @Override
    public TaiKhoan checkAccount(String email, String pass) {
        try {
            ResultSet rs=SQLServerConnect.getDataFromQuery(check_account,email, pass);
            if(rs.next()){
                TaiKhoan tk = new TaiKhoan(rs.getString(1), email, pass, rs.getString(2));
                return tk;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
        return null;
    }

    public static void main(String[] args) {
        
    }
}
