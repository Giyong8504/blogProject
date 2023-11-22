package me.Giyong8504.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import me.Giyong8504.domian.Article;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class ArticleViewResponse {

    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private String author;

    public ArticleViewResponse(Article article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
        this.createdAt = article.getCreateAt();
        this.author = article.getAuthor();
    }
}

