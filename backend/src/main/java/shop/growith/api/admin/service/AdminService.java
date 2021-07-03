package shop.growith.api.admin.service;

import shop.growith.api.admin.domain.AdminVO;
import shop.growith.api.admin.domain.AdminVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface AdminService{
    public void saveID(AdminVO AVO);
    public void deleteID(String ID);
    public boolean loginID(String ID, String PW);
    ArrayList<AdminVO> viewAdminAccountList();
}