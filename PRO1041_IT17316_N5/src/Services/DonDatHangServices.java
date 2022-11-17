/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;
import DomainModels.DonDatHangModel;
import java.util.List;
/**
 *
 * @author DELL 5570
 */
public interface DonDatHangServices {
    List<DonDatHangModel> getAll();
    String add(DonDatHangModel ddh);
    String remove(String ma);
    String update(DonDatHangModel ddh, String ma);
}