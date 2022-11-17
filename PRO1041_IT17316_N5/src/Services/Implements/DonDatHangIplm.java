/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Implements;

import DomainModels.DonDatHangModel;
import Reponsitories.DonDatHangRepository;
import Services.DonDatHangServices;
import java.util.List;

/**
 *
 * @author DELL 5570
 */
public class DonDatHangIplm implements DonDatHangServices{
    private DonDatHangRepository repository = new DonDatHangRepository();
    @Override
    public List<DonDatHangModel> getAll() {
        return repository.getAll();
    }

    @Override
    public String add(DonDatHangModel ddh) {
        boolean add = repository.add(ddh);
        if(add){
            return "Add thành công";
        }else{
            return "Add thất bại";
        }
    }

    @Override
    public String remove(String ma) {
        boolean remove = repository.remove(ma);
        if(remove){
            return "Remove thành công";
        }else{
            return "Remove thất bại";
        }
    }

    @Override
    public String update(DonDatHangModel ddh, String string) {
        boolean update = repository.update(ddh, string);
        if(update){
            return "update thành công";
        }else{
            return "update thất bại"; 
        }
    }
    
    
}