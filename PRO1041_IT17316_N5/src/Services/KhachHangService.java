/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.KhachHangDM;
import java.util.List;

/**
 *
 * @author nhatc
 */
public interface KhachHangService {
    List<KhachHangDM> getAll();
    
    String add(KhachHangDM kh);
    
    String update(String ma, KhachHangDM kh);
    
    String delete(String ma);
}
