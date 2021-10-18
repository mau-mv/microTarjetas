package ibm.academia.microservicioTarjetas;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Passion {

    private String name;
    private List<SalaryRange> salaryRanges; 

}
