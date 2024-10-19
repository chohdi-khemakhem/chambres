package tn.esprit.tpfoyer.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Universite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idUniversite;
    String nomUniversite;
    String adresse;
    @OneToOne(cascade = CascadeType.REMOVE )
    Foyer foyer;

}
