/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reponsitories;

import DomainModels.KhachHangDM;
import DomainModels.NhanVienModel;
import Ultilities.SQLServerConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class NhanVienRepo {

    public List<NhanVienModel> getAll() {
        String query = "SELECT [MaNV]\n"
                + "      ,[TenNV]\n"
                + "      ,[SDT]\n"
                + "      ,[NgaySinh]\n"
                + "      ,[MaLuong]\n"
                + "  FROM [dbo].[NhanVien]";
        try ( Connection cn = SQLServerConnect.getConnection();  PreparedStatement ps = cn.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            List<NhanVienModel> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new NhanVienModel(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5)));
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean delete(String MaNV) {
        int check = 0;
        String query = "DELETE FROM [dbo].[NhanVien]\n"
                + "      WHERE MaNV like ?";
        try ( Connection cn = SQLServerConnect.getConnection();  PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setString(1, MaNV);
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public static void main(String[] args) {
        new KhachHangRep().getAll().forEach(s -> System.out.println(s.toString()));
    }
}
