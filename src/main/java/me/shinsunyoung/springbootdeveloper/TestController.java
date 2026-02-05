package me.shinsunyoung.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;  //Get요청 처리
import org.springframework.web.bind.annotation.RestController;  //웹 요청을 처리하는 컨트롤러

import java.util.List;

@RestController
public class TestController {
    @Autowired
    TestService testService;

    @GetMapping("/test")  //Get방식으로 요청이 들어오면 아래 메서드를 실행
    public List<Member> getAllMembers() {
        List<Member> members = testService.getAllMembers();
        return members;
    }
}
