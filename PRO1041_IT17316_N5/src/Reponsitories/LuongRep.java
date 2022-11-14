/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reponsitories;

import DomainModels.LuongDM;
import Ultilities.SQLServerConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nhatc
 */
public class LuongRep {

    public List<LuongDM> getAll() {
        String query = "SELECT [MaLuong]\n"
                + "      ,[SoLuong]\n"
                + "  FROM [dbo].[Luong]";
        try ( Connection cn = SQLServerConnect.getConnection();  PreparedStatement ps = cn.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            List<LuongDM> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new LuongDM(rs.getString(1), rs.getInt(2)));
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(LuongDM lg) {
        int check = 0;
        String query = "INSERT INTO [dbo].[Luong]\n"
                + "           ([MaLuong]\n"
                + "           ,[SoLuong])\n"
                + "     VALUES\n"
                + "           (?,?)";
        try ( Connection cn = SQLServerConnect.getConnection();  PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setString(1, lg.getMaLg());
            ps.setInt(2, lg.getSoLg());
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean update(String ma, LuongDM lg) {
        int check = 0;
        String query = "UPDATE [dbo].[NhanVien]\n"
                + "   SET [MaLuong] = ?\n"
                + " WHERE MaLuong like ?\n";
        try ( Connection cn = SQLServerConnect.getConnection();  PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setString(1, lg.getMaLg());
            ps.setInt(2, lg.getSoLg());
            ps.setString(3, ma);
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(String ma) {
        int check = 0;
        String query = "DELETE FROM [dbo].[Luong]\n"
                + "      WHERE MaLuong like ?";
        try ( Connection cn = SQLServerConnect.getConnection();  PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setString(1, ma);
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public static void main(String[] args) {
        new LuongRep().getAll().forEach(s -> System.out.println(s.toString()));
    }
}
