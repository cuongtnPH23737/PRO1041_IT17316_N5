/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reponsitories;

import DomainModels.DonDatHangModel;
import Ultilities.SQLServerConnect;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author DELL 5570
 */
public class DonDatHangRepository {

    public List<DonDatHangModel> getAll() {
        String query = "SELECT [MaDDH]\n"
                + "      ,[NgayTao]\n"
                + "      ,[MaNV]\n"
                + "      ,[MaNCC]\n"
                + "  FROM [dbo].[DonDatHang]";
        try (Connection con = SQLServerConnect.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            List<DonDatHangModel> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new DonDatHangModel(rs.getString(1), rs.getDate(2), rs.getString(3), rs.getString(4)));
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(DonDatHangModel ddh) {
        int check = 0;
        String query = "INSERT INTO [dbo].[DonDatHang]\n"
                + "           ([MaDDH]\n"
                + "           ,[NgayTao]\n"
                + "           ,[MaNV]\n"
                + "           ,[MaNCC])\n"
                + "     VALUES\n"
                + "           (?, ?, ?, ?)";
        try (Connection con = SQLServerConnect.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, ddh.getMaDDH());
            ps.setObject(2, new java.sql.Date(ddh.getNgayTao().getTime()));
            ps.setObject(3, ddh.getMaNV());
            ps.setObject(4, ddh.getMaNCC());
            check = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean remove(String ma) {
        int check = 0;
        String query = "DELETE FROM [dbo].[DonDatHang]\n"
                + "      WHERE MaDDH like ?";
        try (Connection con = SQLServerConnect.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, ma);
            check = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean update(DonDatHangModel ddh, String ma) {
        int check = 0;
        String query = "UPDATE [dbo].[DonDatHang]\n"
                + "   SET [NgayTao] = ?\n"
                + "      ,[MaNV] = ?\n"
                + "      ,[MaNCC] = ?\n"
                + " WHERE MaDDH = ?";
try (Connection con = SQLServerConnect.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, ddh.getNgayTao());
            ps.setObject(2, ddh.getMaNV());
            ps.setObject(3, ddh.getMaNCC());
            ps.setObject(4, ma);
            check = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public static void main(String[] args) {
        new DonDatHangRepository().getAll().forEach(s -> System.out.println(s.toString()));
        DonDatHangRepository d=new DonDatHangRepository();
        DonDatHangModel dd=new DonDatHangModel(null, new Date(), "NV02","NCC2");
        System.out.println(d.update(dd, "d1"));
    }
}