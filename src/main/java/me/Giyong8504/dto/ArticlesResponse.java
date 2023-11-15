package me.Giyong8504.dto;

import lombok.Getter;
import me.Giyong8504.domian.Article;

@Getter
public class ArticlesResponse {

    private final String title;
    private final String content;

    public ArticlesResponse(Article article) {
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
