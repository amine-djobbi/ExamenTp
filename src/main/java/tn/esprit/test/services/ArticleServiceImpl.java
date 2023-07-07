package tn.esprit.test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.test.entities.Article;
import tn.esprit.test.entities.Client;
import tn.esprit.test.entities.Fournisseur;
import tn.esprit.test.repository.ArticleRepository;
import tn.esprit.test.repository.FournisseurRepository;

@Service
public class ArticleServiceImpl implements IArticleService{

    private final ArticleRepository articleRepository;
    private final FournisseurRepository fournisseurRepository;

    @Autowired
    public ArticleServiceImpl (ArticleRepository articleRepository, FournisseurRepository fournisseurRepository) {
        this.articleRepository = articleRepository;
        this.fournisseurRepository = fournisseurRepository;
    }

    @Override
    public Article ajouterArticleEtFournisseur(Article article) {
        articleRepository.save(article);
        return article;
    }

    public Article addArticleAndAssignToFournisseur(Article article, String frNom) {
        Fournisseur fournisseur = fournisseurRepository.findByFrNom(frNom);



        if (fournisseur != null) {

            article.setFournisseur(fournisseur);
            return articleRepository.save(article);
        }

        return null;
    }


}
