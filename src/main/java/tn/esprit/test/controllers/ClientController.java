package tn.esprit.test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.test.entities.Client;
import tn.esprit.test.services.IClientService;

@RestController
@RequestMapping("/client")
public class ClientController {

    private final IClientService clientService;

    @Autowired
    public ClientController(IClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/add")
    public Client ajouterBeneficiaire(@RequestBody Client client) {
        return clientService.ajouterClient(client);
    }


}
