package me.Giyong8504.service;

import lombok.RequiredArgsConstructor;
import me.Giyong8504.domian.Article;
import me.Giyong8504.dto.AddArticleRequest;
import me.Giyong8504.repository.BlogRepository;
import org.springframework.stereotype.Service;

@Service // 빈으로 등로그
@RequiredArgsConstructor // final이 붙거나 @NotNull이 붙은 필드의 생성자 추가
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
