package tn.esprit.test.services;

import tn.esprit.test.entities.Article;
import tn.esprit.test.entities.Client;

public interface IArticleService {

    Article ajouterArticleEtFournisseur(Article article);

    Article addArticleAndAssignToFournisseur(Article article, String frNom);
    void affecterArticleAClient(String articleNom,String clNom);


}
