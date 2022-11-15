/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;


public class ModelSP {
    private String ma;
    private String ten;
    private String maloai;
    private String maCl;
    private String size;
    private int dongia;
    private int soluong;

    public ModelSP() {
    }

    public ModelSP(String ma, String ten, String maloai, String maCl, String size, int dongia, int soluong) {
        this.ma = ma;
        this.ten = ten;
        this.maloai = maloai;
        this.maCl = maCl;
        this.size = size;
        this.dongia = dongia;
        this.soluong = soluong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMaloai() {
        return maloai;
    }

    public void setMaloai(String maloai) {
        this.maloai = maloai;
    }

    public String getMaCl() {
        return maCl;
    }

    public void setMaCl(String maCl) {
        this.maCl = maCl;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    @Override
    public String toString() {
        return "ModelSP{" + "ma=" + ma + ", ten=" + ten + ", maloai=" + maloai + ", maCl=" + maCl + ", size=" + size + ", dongia=" + dongia + ", soluong=" + soluong + '}';
    }
    
    public Object[] showdata(){
        return new Object[]{ma,ten,maloai,maCl,size,dongia,soluong};
    }
}
