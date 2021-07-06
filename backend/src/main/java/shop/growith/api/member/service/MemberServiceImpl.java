package shop.growith.api.member.service;

import shop.growith.api.member.domain.Member;
import shop.growith.api.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@RequiredArgsConstructor
@Service
public class MemberServiceImpl  implements MemberService{

    private final MemberRepository memberRepository;

    @Override
    public void signUpMember(Member member) {

    }
    @Override
    public Member viewMember(String memberID) {
        return null;
    }
    @Override
    public void modifyMember(Member member) {

    }
    @Override
    public void deleteMember(Member member) {

    }


}
