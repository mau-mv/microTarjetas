package ibm.academia.microservicioTarjetas;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AgeRange {
    private int min;
    private int max;
    private ArrayList<String> cards;    
}
