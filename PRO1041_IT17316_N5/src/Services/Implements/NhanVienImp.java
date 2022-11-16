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

    public String delete(String maNV) {
        if (NvRepo.delete(maNV) == true) {
            return "Xóa NV";
            }else {
            return "Xóa Nhân Viên Thất bại !";
        }
    }
    }
