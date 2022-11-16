/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Implements;

import Reponsitories.Reponsitory;
import ViewModels.ModelSP;
import java.util.List;

/**
 *
 * @author nhatc
 */
public class ServiceTimKemSPImplements implements Services.Services {

    private Reponsitories.Reponsitory rp = new Reponsitory();

    @Override
    public List<ModelSP> getAll() {

        return rp.getAll();
    }

    @Override
    public List<ModelSP> timKiem(String ten) {
        return rp.timKiem(ten);
    }

}
