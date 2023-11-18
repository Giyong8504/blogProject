package me.Giyong8504.service;

import lombok.RequiredArgsConstructor;
import me.Giyong8504.domian.User;
import me.Giyong8504.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailService implements UserDetailsService { // 스프링 시큐리티에서 사용자 정보를 가져오는 인터페이스

    private final UserRepository userRepository;

    // email로 사용자의 정보를 가져오는 메서드
    @Override
    public User loadUserByUsername(String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new IllegalArgumentException(email));
    }
}

