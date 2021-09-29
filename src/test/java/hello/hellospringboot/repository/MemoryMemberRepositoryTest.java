package hello.hellospringboot.repository;

import hello.hellospringboot.domain.Member;
//import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MemoryMemberRepositoryTest {
    MemoryMemberRepository repository = new MemoryMemberRepository();

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
}
