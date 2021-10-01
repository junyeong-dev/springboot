package hello.hellospringboot.service;

import hello.hellospringboot.domain.Member;
import hello.hellospringboot.repository.MemberRepository;
import hello.hellospringboot.repository.MemoryMemberRepository;

import java.util.Optional;

public class MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    // 회원 가임
    public Long join(Member member) {
        // 같은 이름의 중복 회원 X
        validateDuplicateMember(member);

        memberRepository.save(member);
        return member.getId();
    }

    public void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }


}
