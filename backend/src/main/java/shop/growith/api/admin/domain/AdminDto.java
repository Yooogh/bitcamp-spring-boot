package shop.growith.api.admin.domain;

import lombok.Data;

@Data
public class AdminDto {
    private String adminId;
    private String adminPass;
    private String adminName;
}