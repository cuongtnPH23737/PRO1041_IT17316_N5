/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.ModelSP;
import java.util.List;

/**
 *
 * @author nhatc
 */
public interface Services {

    List<ModelSP> getAll();

    List<ModelSP> timKiem(String ten);
}
