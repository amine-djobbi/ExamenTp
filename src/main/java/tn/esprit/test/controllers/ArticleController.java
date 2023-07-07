package tn.esprit.test.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.test.entities.Article;
import tn.esprit.test.repository.FournisseurRepository;
import tn.esprit.test.services.IArticleService;
import tn.esprit.test.services.IClientService;

@RestController
@RequestMapping("/article")
public class ArticleController {

    private final IArticleService articleService;

    @Autowired
    private FournisseurRepository fournisseurRepository;

    @Autowired
    public ArticleController(IArticleService articleService) {
        this.articleService = articleService;
    }

    @PostMapping("/add")
    public Article ajouterArticleEtFournisseur(@RequestBody Article article) {
        fournisseurRepository.save(article.getFournisseur());
        Article addedArticle = articleService.ajouterArticleEtFournisseur(article);
        return addedArticle;
    }


}
