package tn.esprit.test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.test.services.IArticleService;
import tn.esprit.test.services.IFournisseurService;


@RestController
@RequestMapping("/fournisseur")
public class FournisseurController {

    private final IFournisseurService fournisseurService;

    @Autowired
    public FournisseurController(IFournisseurService fournisseurService) {
        this.fournisseurService = fournisseurService;
    }

}
