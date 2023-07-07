package tn.esprit.test.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.test.enums.Gender;
import tn.esprit.test.enums.Speciality;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Fournisseur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long frId;

    @Column
    private String frNom;

    @Enumerated(EnumType.STRING)
    private Speciality frspeciality;

}
