package ibm.academia.microservicioTarjetas;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class MicroservicioTarjetasApplication {

	@Autowired
	ConfigTabla configTabla;

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioTarjetasApplication.class, args);
	}

	@GetMapping
	public ArrayList<String> requestData(@RequestBody Datos datos){

		ArrayList<String> result = configTabla.getPassions().stream()
					.filter(p -> p.getName().equalsIgnoreCase(datos.getPasion()))
					.findFirst().get().getSalaryRanges().stream()
						.filter(sr -> datos.getSalario() >= sr.getMin() && datos.getSalario() <= sr.getMax())
						.findFirst().get().getAgeRanges().stream()
							.filter(ar -> datos.getEdad() >= ar.getMin() && datos.getEdad() <= ar.getMax())
							.findFirst().get().getCards();
											
		return result;
    }

}
