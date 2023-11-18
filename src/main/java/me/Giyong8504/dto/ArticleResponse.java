package me.Giyong8504.dto;

import lombok.Getter;
import me.Giyong8504.domian.Article;

@Getter
public class ArticleResponse {

    private final String title;
    private final String content;

    public ArticleResponse(Article article) {
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
