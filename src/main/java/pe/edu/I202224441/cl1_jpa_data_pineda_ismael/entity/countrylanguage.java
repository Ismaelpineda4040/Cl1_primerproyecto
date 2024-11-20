package pe.edu.I202224441.cl1_jpa_data_pineda_ismael.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString


public class countrylanguage {
    @Id
    private char CountryCode;
    private char Language;
    private String IsOfficial;
    private BigDecimal Percentage;
}
