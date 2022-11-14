/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.LuongDM;
import java.util.List;

/**
 *
 * @author nhatc
 */
public interface LuongService {

    List<LuongDM> getAll();
    
    String add(String ma, String so);
    
    String delete(String ma);
    
    String update(String maCu, String maMoi, String so);
}
