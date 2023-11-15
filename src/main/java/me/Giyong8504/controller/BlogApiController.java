package me.Giyong8504.controller;

import lombok.RequiredArgsConstructor;
import me.Giyong8504.domian.Article;
import me.Giyong8504.dto.AddArticleRequest;
import me.Giyong8504.dto.ArticlesResponse;
import me.Giyong8504.service.BlogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // HTTP Responses Body에 객체 데이터를 JSON 형식으로 반환
@RequiredArgsConstructor
public class BlogApiController {

    private final BlogService blogService;

    // HTTP 메서드가 POST일 때 전달받은 URL과 동일하면 메서드로 매핑
    // @RequestBody로 요청 본문 값 매핑
    @PostMapping("/api/articles")
    public ResponseEntity<Article> addArticle(@RequestBody AddArticleRequest request) {
        Article saveArticle = blogService.save(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(saveArticle);
    }

    @GetMapping("/api/articles")
    public ResponseEntity<List<ArticlesResponse>> findAllArticles() {
        List<ArticlesResponse> articles = blogService.findAll()
                .stream().map(ArticlesResponse::new).toList();

        return ResponseEntity.ok()
                .body(articles);
    }
}
