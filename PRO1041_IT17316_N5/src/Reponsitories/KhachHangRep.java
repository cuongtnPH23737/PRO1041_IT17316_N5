/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reponsitories;

import DomainModels.KhachHangDM;
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
public class KhachHangRep {

    public List<KhachHangDM> getAll() {
        String query = "SELECT [MaKH]\n"
                + "      ,[TenKH]\n"
                + "      ,[DiaChi]\n"
                + "      ,[SDT]\n"
                + "  FROM [dbo].[KhachHang]";
        try ( Connection cn = SQLServerConnect.getConnection();  PreparedStatement ps = cn.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            List<KhachHangDM> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new KhachHangDM(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(KhachHangDM kh) {
        int check = 0;
        String query = "INSERT INTO [dbo].[KhachHang]\n"
                + "           ([MaKH]\n"
                + "           ,[TenKH]\n"
                + "           ,[DiaChi]\n"
                + "           ,[SDT])\n"
                + "     VALUES\n"
                + "           (?,?,?,?)";
        try ( Connection cn = SQLServerConnect.getConnection();  PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setString(1, kh.getMaKH());
            ps.setString(2, kh.getTenKH());
            ps.setString(3, kh.getDiaChi());
            ps.setString(4, kh.getSdt());
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean update(String ma, KhachHangDM kh) {
        int check = 0;
        String query = "UPDATE [dbo].[KhachHang]\n"
                + "   SET [MaKH] = ?\n"
                + "      ,[TenKH] = ?\n"
                + "      ,[DiaChi] = ?\n"
                + "      ,[SDT] = ?\n"
                + " WHERE MaKH like ?";
        try ( Connection cn = SQLServerConnect.getConnection();  PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setString(1, kh.getMaKH());
            ps.setString(2, kh.getTenKH());
            ps.setString(3, kh.getDiaChi());
            ps.setString(4, kh.getSdt());
            ps.setString(5, ma);
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(String ma) {
        int check = 0;
        String query = "DELETE FROM [dbo].[KhachHang]\n"
                + "      WHERE MaKH like ?";
        try ( Connection cn = SQLServerConnect.getConnection();  PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setString(1, ma);
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
