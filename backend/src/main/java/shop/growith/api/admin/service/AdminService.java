package shop.growith.api.admin.service;

import shop.growith.api.admin.domain.AdminDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface AdminService{
    public void saveID(AdminDto AVO);
    public void deleteID(String ID);
    public boolean loginID(String ID, String PW);
    ArrayList<AdminDto> viewAdminAccountList();
}