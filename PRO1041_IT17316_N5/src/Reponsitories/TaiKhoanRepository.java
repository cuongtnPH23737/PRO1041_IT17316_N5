/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reponsitories;

import DomainModels.TaiKhoan;
import Ultilities.SQLServerConnect;
import ViewModels.TaiKhoanView;

import java.sql.*;
import java.util.ArrayList;

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
    
    
    public Boolean dangKyTkKhachHang(TaiKhoan taiKhoan){
        try {      
            if(SQLServerConnect.ExcuteDungna(them,taiKhoan.getMaTk(),taiKhoan.getEmail(),taiKhoan.getPassword(),taiKhoan.getLoaiTk())==0){
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
        return true;
    }
    
    final String select_all = "select * from taikhoan";
    public ArrayList<TaiKhoan> getAll(){
        ArrayList<TaiKhoan> list=new ArrayList<>();
        try {      
            ResultSet rs=SQLServerConnect.getDataFromQuery(select_all);
            while (rs.next()) {                
                list.add(new TaiKhoan(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
        return list;
    }
    
    final String them = "insert taikhoan values(?,?,?,?)";
    public Boolean them(TaiKhoan taiKhoan){
        try {      
            if(SQLServerConnect.ExcuteDungna(
                    them, 
                    taiKhoan.getMaTk(),
                    taiKhoan.getEmail(),
                    taiKhoan.getPassword(),
                    taiKhoan.getLoaiTk())==0){
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
        return true;
    }
    
    final String sua = "update taikhoan set email=?,password=?,loaitk=? where matk=?";
    public Boolean sua(TaiKhoan taiKhoan,String matk){
        try {      
            if(SQLServerConnect.ExcuteDungna(
                    sua, 
                    taiKhoan.getEmail(),
                    taiKhoan.getPassword(),
                    taiKhoan.getLoaiTk(),
                    matk)==0){
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
        return true;
    }
    
    final String xoa = "delete taikhoan where matk=?";
    public Boolean xoa(String matk){
        try {      
            if(SQLServerConnect.ExcuteDungna(
                    xoa,
                    matk)==0){
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
