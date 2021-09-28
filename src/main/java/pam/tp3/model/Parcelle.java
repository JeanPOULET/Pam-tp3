package pam.tp3.model;

import javax.persistence.*;

@Entity
public class Parcelle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long parcelleId;

    @ManyToOne
    User proprietaire;

    @ManyToOne
    User maraicher;

    int surface;


}
