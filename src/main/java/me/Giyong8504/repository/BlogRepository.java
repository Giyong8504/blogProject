package me.Giyong8504.repository;

import me.Giyong8504.domian.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
