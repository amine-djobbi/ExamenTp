package tn.esprit.test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.test.entities.Client;
import tn.esprit.test.enums.Gender;
import tn.esprit.test.enums.Speciality;
import tn.esprit.test.repository.ArticleRepository;
import tn.esprit.test.repository.ClientRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class ClientServiceImpl implements IClientService{

    private final ClientRepository clientRepository;

    @Autowired
    public ClientServiceImpl (ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client ajouterClient(Client client) {
        clientRepository.save(client);
        return client;
    }


}
