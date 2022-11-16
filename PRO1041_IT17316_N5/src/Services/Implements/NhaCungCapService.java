/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Implements;
import DomainModels.NhaCungCap;
import Reponsitories.NhaCungCapRepository;
import java.util.List;
import Services.INhaCungCapService;
/**
 *
 * @author Admin
 */
public class NhaCungCapService implements INhaCungCapService{
    final private NhaCungCapRepository repo;
    public NhaCungCapService(){
        repo =new NhaCungCapRepository();
    }
    
    @Override
    public List<NhaCungCap> getAll() {
        return repo.getAll();
    }

    @Override
    public NhaCungCap insertNhaCungCap(NhaCungCap NCC) {
        return repo.insertNhaCungCap(NCC);
    }

    @Override
    public NhaCungCap updateNhaCungCap(NhaCungCap NCC) {
        return repo.updateNhaCungCap(NCC);
    }

    @Override
    public void deleteNhaCungCap(String MaNCC) {
        repo.deleteNhaCungCap(MaNCC);
    }

    @Override
    public NhaCungCap getNhaCungCapByName(String name) {
        return repo.getNCCByName(name);
    }
    
    public NhaCungCap getbyma(String ma) {
        return repo.getSelectByMa(ma);
    }
}
