package tn.esprit.test.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.test.enums.Gender;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    @Column
    private String clNom;

    @Column
    private LocalDate clDateInscription;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @ManyToMany
    private List<Article> articles;




}
