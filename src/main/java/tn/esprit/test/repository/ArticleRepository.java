package tn.esprit.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.test.entities.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
