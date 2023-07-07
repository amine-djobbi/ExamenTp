package tn.esprit.test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.test.entities.Article;
import tn.esprit.test.entities.Client;
import tn.esprit.test.repository.ArticleRepository;

@Service
public class ArticleServiceImpl implements IArticleService{

    private final ArticleRepository articleRepository;

    @Autowired
    public ArticleServiceImpl (ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public Article ajouterArticleEtFournisseur(Article article) {
        articleRepository.save(article);
        return article;
    }

}
