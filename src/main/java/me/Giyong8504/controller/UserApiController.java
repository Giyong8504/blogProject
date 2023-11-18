package me.Giyong8504.controller;

import lombok.RequiredArgsConstructor;
import me.Giyong8504.dto.AddUserRequest;
import me.Giyong8504.service.UserService;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class UserApiController {

    private final UserService userService;

    public String signup(AddUserRequest request) {
        userService.save(request); // 회원 가입 메서드 호출
        return "redirect:/login"; // 회원 가입이 완료된 이후에 로그인 페이지로 이동
    }
}
