package hello.hellospringboot;

import hello.hellospringboot.domain.Member;
import hello.hellospringboot.repository.JdbcMemberRepository;
import hello.hellospringboot.repository.MemberRepository;
import hello.hellospringboot.repository.MemoryMemberRepository;
import hello.hellospringboot.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

// 자바 코드로 직접 스프링 빈 등록
// 기본적으로 직접 등록하는 것이기 때문에 @Service, @Repository, @Autowired 어노테이션을 제거해야 한다.
@Configuration
public class SpringConfig {

//    @Bean
//    public MemberService memberService() {
//        return new MemberService((MemoryMemberRepository) memberRepository());
//    }
//
//    @Bean
//    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }

    private final DataSource dataSource;

    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService((MemoryMemberRepository) memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new JdbcMemberRepository(dataSource);
    }


}
