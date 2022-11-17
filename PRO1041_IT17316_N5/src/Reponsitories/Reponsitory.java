/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reponsitories;

import Ultilities.SQLServerConnect;
import ViewModels.ModelSP;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Reponsitory {

    public List<ModelSP> getAll() {
        String sql = "SELECT [MaMH]\n"
                + "      ,[TenMH]\n"
                + "      ,[MaLoai]\n"
                + "      ,[MaCL]\n"
                + "      ,[Size]\n"
                + "      ,[DonGia]\n"
                + "      ,[SoLuong]\n"
                + "  FROM [dbo].[MatHang] ";
        try ( Connection Con = new SQLServerConnect().getConnection();  PreparedStatement ps = Con.prepareCall(sql)) {

            ResultSet rs = ps.executeQuery();
            List<ModelSP> list = new ArrayList<>();
            while (rs.next()) {
                ModelSP mo = new ModelSP(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(7));
                list.add(mo);
            }
            return list;
        } catch (Exception e) {

        }
        return null;
    }

    public List<ModelSP> timKiem(String ten) {
        String sql = "SELECT [MaMH]\n"
                + "      ,[TenMH]\n"
                + "      ,[MaLoai]\n"
                + "      ,[MaCL]\n"
                + "      ,[Size]\n"
                + "      ,[DonGia]\n"
                + "      ,[SoLuong]\n"
                + "  FROM [dbo].[MatHang] where TenMH like ? ";
        try ( Connection Con = new SQLServerConnect().getConnection();  PreparedStatement ps = Con.prepareCall(sql)) {
            ps.setString(1, ten);
            ResultSet rs = ps.executeQuery();
            List<ModelSP> list = new ArrayList<>();
            while (rs.next()) {
                ModelSP mo = new ModelSP(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(7));
                list.add(mo);
            }
            return list;
        } catch (Exception e) {

        }
        return null;
    }

}
