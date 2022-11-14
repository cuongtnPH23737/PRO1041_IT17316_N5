/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author nhatc
 */
public class LuongDM {

    private String maLg;
    private int soLg;

    public LuongDM() {
    }

    public LuongDM(String maLg, int soLg) {
        this.maLg = maLg;
        this.soLg = soLg;
    }

    public String getMaLg() {
        return maLg;
    }

    public void setMaLg(String maLg) {
        this.maLg = maLg;
    }

    public int getSoLg() {
        return soLg;
    }

    public void setSoLg(int soLg) {
        this.soLg = soLg;
    }

    public Object[] toRowData() {
        return new Object[]{maLg, soLg};
    }

    @Override
    public String toString() {
        return "Luong{" + "maLg=" + maLg + ", soLg=" + soLg + '}';
    }

}
