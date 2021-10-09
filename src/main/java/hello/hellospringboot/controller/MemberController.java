package hello.hellospringboot.controller;

import hello.hellospringboot.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    // Spring container에 등록
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }


}
