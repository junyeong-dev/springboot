package hello.hellospringboot.controller;

import hello.hellospringboot.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    // Controller -> Service -> Repository

    // 스프링 빈을 등록하는 2가지 방법
    // 1. 컴포넌트(Component) 스캔과 자동 의존관계 설정(컴프넌트 스캔 : @Controller, @Service, @Repository -> 자동으로 스프링 빈으로 등록)
    // 2. 자바 코드로 직접 스프링 빈 등록

    // 스피링은 스프링 컨테이너에 스프링 빈을 등록할 때, 기본으로 싱글톤으로 등록한다. (유일하게 하나만 등록해서 공유한다.)
    // 따라서 같은 스프링 빈이면 모두 같은 인스턴스다. 설정으로 싱글톤이 아니게 설정할 수 있지만, 특별한 경우를 제외하면 대부분 싱클톤을 사용한다.

    // Spring container에 등록
    // Dependency Injection
    // Autowired를 쓰면 MemberController가 생성될 때 등록되어있는 MemberService를 가져와서 넣어줌
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }


}
