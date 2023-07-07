package tn.esprit.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.test.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
