package hello.hellospringboot.repository;

import hello.hellospringboot.domain.Member;
//import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class MemoryMemberRepositoryTests {
    
    MemoryMemberRepository repository = new MemoryMemberRepository();

    // AfterEach : Method가 끝날때 마다 수행
    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }
    
    @Test
    public void save() {
        Member member = new Member();
        member.setName("spring");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();

        // import 되는 Assertions에 따라 문법이 약간 다름
        
        // import org.junit.jupiter.api.Assertions;
        // Assertions.assertEquals(member, result);

        // import org.assertj.core.api.Assertions;
        // Assertions.assertThat(member).isEqualTo(result);

        // static 으로 import 해서 Assertions를 생략할 수 있음
        assertThat(member).isEqualTo(result);
    }

    @Test
    public void findByName() {
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        Member result = repository.findByName("spring1").get();

        assertThat(result).isEqualTo(member1);
    }

    @Test
    public void findAll() {
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        List<Member> result = repository.findAll();

        assertThat(result.size()).isEqualTo(2);
    }

}
