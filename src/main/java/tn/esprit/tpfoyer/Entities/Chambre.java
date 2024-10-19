package tn.esprit.tpfoyer.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Chambre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    long numero;
    @Enumerated(EnumType.STRING)
    TypeChambre typeChambre;
    
    //ASSOCIATIONS
    @ManyToOne(cascade = CascadeType.ALL)
    Bloc bloc;
    @OneToMany()
    //@JsonIgnore
    Set<Reservation> reservations  ;
}
