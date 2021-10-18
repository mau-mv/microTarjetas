package ibm.academia.microservicioTarjetas;

import java.util.List;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class SalaryRange {
    private double min;
    private double max;
    private List<AgeRange> ageRanges;
    
}
