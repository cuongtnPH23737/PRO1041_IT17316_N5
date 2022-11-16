/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reponsitories;
import DomainModels.NhaCungCap;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface INhaCungCapRepository {
    List<NhaCungCap> getAll();
    NhaCungCap insertNhaCungCap(NhaCungCap NCC);
    NhaCungCap updateNhaCungCap(NhaCungCap NCC);
    void deleteNhaCungCap(String MaNCC);
    NhaCungCap getNCCByName(String name);
}
