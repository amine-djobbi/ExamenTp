package tn.esprit.test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.test.entities.Article;
import tn.esprit.test.entities.Client;
import tn.esprit.test.entities.Fournisseur;
import tn.esprit.test.repository.ArticleRepository;
import tn.esprit.test.repository.ClientRepository;
import tn.esprit.test.repository.FournisseurRepository;

import java.util.List;

@Service
public class ArticleServiceImpl implements IArticleService{

    private final ArticleRepository articleRepository;
    private final FournisseurRepository fournisseurRepository;
    private final ClientRepository clientRepository;


    @Autowired
    public ArticleServiceImpl (ArticleRepository articleRepository, FournisseurRepository fournisseurRepository, ClientRepository clientRepository) {
        this.articleRepository = articleRepository;
        this.fournisseurRepository = fournisseurRepository;
        this.clientRepository = clientRepository;
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

    @Override
    public void affecterArticleAClient(String articleNom, String clNom) {
        Article article = articleRepository.findByArticleNom(articleNom);
        Client client = clientRepository.findByClNom(clNom);
        client.getArticles().add(article);
        clientRepository.save(client);
    }




}
