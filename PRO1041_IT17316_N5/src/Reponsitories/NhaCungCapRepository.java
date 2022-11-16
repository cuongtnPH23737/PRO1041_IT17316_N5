/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reponsitories;
import java.util.List;
import DomainModels.NhaCungCap;
import Ultilities.SQLServerConnect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class NhaCungCapRepository implements INhaCungCapRepository{
    final String select = "SELECT [MaNCC],[Ten],[DiaChi],[SDT] FROM [dbo].[NhaCungCap]";
    final String select_by_MaNCC = "SELECT [MaNCC],[Ten],[DiaChi],[SDT] FROM [dbo].[NhaCungCap] where MaNCC=?";
    final String select_by_Ten = "SELECT [MaNCC],[Ten],[DiaChi],[SDT] FROM [dbo].[NhaCungCap] where Ten=?";
    final String Update = "UPDATE [dbo].[NhaCungCap] SET [Ten] = ? ,[DiaChi] = ? ,[SDT] =  ? WHERE [MaNCC] = ? ";
    final String Delete = "DELETE FROM [dbo].[NhaCungCap] WHERE [MaNCC]=?";
    final String Insert = "INSERT INTO [dbo].[NhaCungCap] ([MaNCC] ,[Ten] ,[DiaChi] ,[SDT]) VALUES (?,?,?,?)";

    @Override
    public List<NhaCungCap> getAll() {

        return getSelectBySQL(select);

    }

    @Override
    public NhaCungCap insertNhaCungCap(NhaCungCap NCC) {
        SQLServerConnect.ExcuteDungna(Insert, NCC.getMaNCC(), NCC.getTen(), NCC.getDiachi(), NCC.getSDT());
        return NCC;
    }

    @Override
    public NhaCungCap updateNhaCungCap(NhaCungCap NCC) {
        SQLServerConnect.ExcuteDungna(Update, NCC.getTen(),NCC.getDiachi(),NCC.getSDT(),NCC.getMaNCC());
        return NCC;
    }

    @Override
    public void deleteNhaCungCap(String MaNCC) {
        SQLServerConnect.ExcuteDungna(Delete, MaNCC);
    }

    @Override
    public NhaCungCap getNCCByName(String name) {
        List<NhaCungCap> _lst=getSelectBySQL(select_by_Ten, name);
        return _lst.get(0);
    }

    public List<NhaCungCap> getSelectBySQL(String SQL, Object... args) {
        List<NhaCungCap> _lst = new ArrayList<>();
        try {
            ResultSet rs = SQLServerConnect.getDataFromQuery(SQL, args);
            while (rs.next()) {
                _lst.add(new NhaCungCap(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            }
            return _lst;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    

    public NhaCungCap getSelectByMa(String ma) {
        try {
            List<NhaCungCap> _lst = getAll();
            for (NhaCungCap nhaCungCap : _lst) {
                if (nhaCungCap.getMaNCC().equals(ma)) {
                    return nhaCungCap;
                }
            }
            return null;
        } catch (Exception ex) {
            return null;
        }
    }
}
