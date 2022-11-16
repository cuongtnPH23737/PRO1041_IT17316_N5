/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reponsitories;

import DomainModels.TaiKhoan;
import Ultilities.SQLServerConnect;
import ViewModels.TaiKhoanView;

import java.sql.*;

/**
 *
 * @author TRUNG DUC
 */
public class TaiKhoanRepository{
    

    public TaiKhoanRepository() {
    }

    final String kiem_tra_tk = "select matk,loaitk from taikhoan where email=? and password=?";
    public TaiKhoanView dangNhap(TaiKhoan taiKhoan) {
        try {
            ResultSet rs=SQLServerConnect.getDataFromQuery(kiem_tra_tk,taiKhoan.getEmail(), taiKhoan.getPassword());
            if(rs.next()){
                TaiKhoanView tkv = new TaiKhoanView(rs.getString(1),taiKhoan.getEmail(), taiKhoan.getPassword(), rs.getString(2));
                return tkv;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
        return null;
    }


    final String check_ton_tai = "select password from taikhoan where email=? or matk=?";
    public Boolean checkTonTai(TaiKhoan taiKhoan){
        try {
            ResultSet rs=SQLServerConnect.getDataFromQuery(check_ton_tai,taiKhoan.getEmail(),taiKhoan.getMaTk());
            if(rs.next()){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
        return false;
    }
    
    final String dang_ky_tk = "insert taikhoan values(?,?,?,?)";
    public Boolean dangKyTkKhachHang(TaiKhoan taiKhoan){
        try {      
            if(SQLServerConnect.ExcuteDungna(dang_ky_tk,taiKhoan.getMaTk(),taiKhoan.getEmail(),taiKhoan.getPassword(),taiKhoan.getLoaiTk())==0){
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        TaiKhoanRepository taiKhoanRepository=new TaiKhoanRepository();
        TaiKhoan taiKhoan=new TaiKhoan();
        taiKhoan.setMaTk("1");
        taiKhoan.setEmail("1");
        taiKhoan.setPassword("11");
        System.out.println(taiKhoanRepository.dangKyTkKhachHang(taiKhoan));
    }
}
