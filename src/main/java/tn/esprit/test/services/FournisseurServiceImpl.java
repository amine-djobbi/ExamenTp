package tn.esprit.test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.test.repository.ClientRepository;
import tn.esprit.test.repository.FournisseurRepository;

@Service
public class FournisseurServiceImpl implements IFournisseurService {

    private final FournisseurRepository fournisseurRepository;

    @Autowired
    public FournisseurServiceImpl (FournisseurRepository fournisseurRepository) {
        this.fournisseurRepository = fournisseurRepository;
    }

}
