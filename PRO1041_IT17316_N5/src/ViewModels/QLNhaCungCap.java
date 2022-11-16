/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;
import DomainModels.*;
/**
 *
 * @author Admin
 */
public class QLNhaCungCap {
    private String MaNCC;
    private String Ten;
    private String Diachi;
    private String SDT;

    public QLNhaCungCap() {
    }

    public QLNhaCungCap(String MaNCC, String Ten, String Diachi, String SDT) {
        this.MaNCC = MaNCC;
        this.Ten = Ten;
        this.Diachi = Diachi;
        this.SDT = SDT;
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
}
