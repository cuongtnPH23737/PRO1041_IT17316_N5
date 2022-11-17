/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModels;

import java.util.Date;

/**
 *
 * @author DELL 5570
 */
public class DonDatHangModel {

    private String maDDH;
//    private int ngayTao;
    private Date ngayTao;
    private String maNV;
    private String maNCC;

    public DonDatHangModel() {
    }

    public DonDatHangModel(String maDDH, Date ngayTao, String maNV, String maNCC) {
        this.maDDH = maDDH;
        this.ngayTao = ngayTao;
        this.maNV = maNV;
        this.maNCC = maNCC;
    }

    public String getMaDDH() {
        return maDDH;
    }

    public void setMaDDH(String maDDH) {
        this.maDDH = maDDH;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    

    @Override
    public String toString() {
        return "DonDatHangModel{" + "maDDH=" + maDDH + ", ngayTao=" + ngayTao + ", maNV=" + maNV + ", maNCC=" + maNCC + '}';
    }

    public Object[] toRowDataDDH() {
        return new Object[]{maDDH, ngayTao, maNV, maNCC};
    }

}