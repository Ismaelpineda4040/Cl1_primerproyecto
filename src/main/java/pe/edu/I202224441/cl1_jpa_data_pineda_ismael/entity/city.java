package pe.edu.I202224441.cl1_jpa_data_pineda_ismael.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class city {
@Id
    private Integer ID;
    private char name;
    private char CountryCode;
    private char District;
    private int Population;
}
