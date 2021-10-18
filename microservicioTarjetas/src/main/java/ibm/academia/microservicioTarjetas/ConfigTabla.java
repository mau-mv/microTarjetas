package ibm.academia.microservicioTarjetas;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConfigurationProperties(prefix = "tabla")
public class ConfigTabla {
    private List<Passion> passions;
    
    public List<Passion> getPassions() {
        return passions;
    }

    public void setPassions(List<Passion> passions) {
        this.passions = passions;
    }
}
