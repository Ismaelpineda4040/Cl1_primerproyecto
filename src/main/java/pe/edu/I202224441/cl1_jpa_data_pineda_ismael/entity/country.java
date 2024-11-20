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

public class country {
    @Id
    private String Code;
    private char Name;
    private String Continent;
    private char Region;
    private BigDecimal SurfaceArea;
    private short IndepYear;
    private int Population;
    private BigDecimal LifeExpectancy;
    private BigDecimal GNP;
    private BigDecimal GNPOld;
    private char LocalName;
    private char GovernmentForm;
    private char HeadOfState;
    private int Capital;
    private char Code2;
}
