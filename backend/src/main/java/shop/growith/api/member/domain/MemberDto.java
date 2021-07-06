package shop.growith.api.member.domain;

import lombok.Data;

@Data
public class MemberDto {
    private String memberID;
    private String memberPass;
    private String name;
    private String birth;
}
