/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reponsitories;

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

    public boolean add(NhanVienModel Nv) {
        String query = "INSERT INTO [dbo].[NhanVien]\n"
                + "           ([MaNV]\n"
                + "           ,[TenNV]\n"
                + "           ,[SDT]\n"
                + "           ,[NgaySinh]\n"
                + "           ,[MaLuong])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?)";
        int check = 0;
        try ( Connection con = SQLServerConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, Nv.getMaNV());
            ps.setObject(2, Nv.getTenNV());
            ps.setObject(3, Nv.getSdt());
            ps.setObject(4, Nv.getNgaySinh());
            ps.setObject(5, Nv.getMaLuong());
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
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

    public boolean Update(NhanVienModel Nv, String Ma) {
        String query = "UPDATE [dbo].[NhanVien]\n"
                + "   SET [MaNV] = ?\n"
                + "      ,[TenNV] = ?\n"
                + "      ,[SDT] = ?\n"
                + "      ,[NgaySinh] = ?\n"
                + "      ,[MaLuong] = ?\n"
                + " WHERE MaNV = ?";

        int check = 0;
        try ( Connection con = SQLServerConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, Nv.getMaNV());
            ps.setObject(2, Nv.getTenNV());
            ps.setObject(3, Nv.getSdt());
            ps.setObject(4, Nv.getNgaySinh());
            ps.setObject(5, Nv.getMaLuong());
            ps.setObject(6, Nv.getMaNV());
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public static void main(String[] args) {
        new NhanVienRepo().getAll().forEach(s -> System.out.println(s.toString()));
    }
}
