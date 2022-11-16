/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author TRUNG DUC
 */
public class TaiKhoan {
    public String maTk,email,password,loaiTk;

    public TaiKhoan() {
    }

    public TaiKhoan(String maTk, String email, String password, String loaiTk) {
        this.maTk = maTk;
        this.email = email;
        this.password = password;
        this.loaiTk = loaiTk;
    }

    public String getMaTk() {
        return maTk;
    }

    public void setMaTk(String maTk) {
        this.maTk = maTk;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoaiTk() {
        return loaiTk;
    }

    public void setLoaiTk(String loaiTk) {
        this.loaiTk = loaiTk;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "maTk=" + maTk + ", email=" + email + ", password=" + password + ", loaiTk=" + loaiTk + '}';
    }
    
   
}
