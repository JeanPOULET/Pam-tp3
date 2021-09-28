package pam.tp3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adresse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    int numero;
    String rue;
    int codePostal;
    String ville;
}
