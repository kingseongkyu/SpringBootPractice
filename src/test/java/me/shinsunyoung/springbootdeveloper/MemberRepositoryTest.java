package me.shinsunyoung.springbootdeveloper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
//@Sql("/insert-members.sql")
@DataJpaTest
class MemberRepositoryTest {
        @Autowired
        MemberRepository memberRepository;

        /* @Test
        void getAllMembers() {

            List<Member> members = memberRepository.findAll();

            assertThat(members.size()).isEqualTo(3);
        }

        @Test
        void getMemberById() {
            Member member = memberRepository.findById(2L).get();

            assertThat(member.getName()).isEqualTo("B");
        }

        @Test
        void getMemberByName() {
            Member member = memberRepository.findByName("C").get();

            assertThat(member.getId()).isEqualTo(3);
        }

        @Test
        void saveMember() {
            Member member = new Member(1L, "A");

            memberRepository.save(member);  //DB에 저장

            assertThat(memberRepository.findById(1L).get().getName()).isEqualTo("A");
        }


        @Test
        void saveMembers() {
            //given
            List<Member> members = List.of(new Member(2L, "B"), new Member(3L, "C"));
            //when
            memberRepository.saveAll(members);

            //then
            assertThat(memberRepository.findAll().size()).isEqualTo(2);

        }


    @Test
    void deleteMemberById() {
        memberRepository.deleteById(2L);

        assertThat(memberRepository.findById(2L).isEmpty()).isTrue();
    }


    @Test
    void deleteMemberAndFindRemain() {
        memberRepository.deleteById(2L);
        List <Member> members = memberRepository.findAll();
        members.forEach(m->System.out.println("id=" + m.getId() + ",name="+m.getName()));

        assertThat(members.size()).isEqualTo(2);
    }

    */


    @Sql("/insert-members.sql")
    @Test
    void update() {
        Member member = memberRepository.findById(2L).get();

        member.changeName("BC");

        assertThat(memberRepository.findById(2L).get().getName()).isEqualTo("BC");
    }



}

