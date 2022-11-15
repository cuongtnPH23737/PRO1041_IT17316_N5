/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Implements;

import DomainModels.NhanVienModel;
import Reponsitories.NhanVienRepo;
import Services.NhanVienSer;
import java.util.List;

/**
 *
 * @author admin
 */
public class NhanVienImp implements NhanVienSer {

    private NhanVienRepo NvRepo = new NhanVienRepo();

    @Override
    public List<NhanVienModel> getAll() {
        return NvRepo.getAll();
    }

    @Override

    public String delete(String ma) {
        boolean delete = NvRepo.delete(ma);
        if (delete) {
            return "Delete thành công";
        } else {
            return"Delete Thất bại" ;
        }
    
}

    @Override
    public String add(NhanVienModel Nvv) {
        if (Nvv.getMaNV().isEmpty() || Nvv.getTenNV().isEmpty() || Nvv.getNgaySinh().isEmpty()) {
            return "Đang có trường để trống không thể thêm NV !";
        }
        boolean add = NvRepo.add(Nvv);
        if (add) {
            return "Thêm NV thành công !";
        }else{
        return "Thêm NV thất bại Hoặc NV đã tồn tại !";
        }
    }
    }
