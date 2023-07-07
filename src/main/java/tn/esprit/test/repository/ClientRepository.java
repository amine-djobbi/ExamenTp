package tn.esprit.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.test.entities.Article;
import tn.esprit.test.entities.Client;
import tn.esprit.test.enums.Gender;
import tn.esprit.test.enums.Speciality;

import java.time.LocalDate;
import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {

    Client findByClNom(String clNom);



}
