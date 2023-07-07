package tn.esprit.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.test.entities.Article;
import tn.esprit.test.entities.Fournisseur;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    Article findByArticleNom(String articleNom);

}
