package ibm.academia.microservicioTarjetas;

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

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioTarjetasApplication.class, args);
	}

	@GetMapping
	public String requestData(@RequestBody Datos datos){

		switch (datos.getPasion().toLowerCase()) {
			case "shopping": 	
				if(datos.getSalario() >= 7000 && datos.getSalario() < 15000){
					if(datos.getEdad() >= 18 && datos.getEdad() < 23 ){
						return "BSmart, AffinityCard";
					}else if(datos.getEdad() >= 24 && datos.getEdad() < 32 ){
						return "BSmart, AffinityCard, Clasica, Office Depot, Costco";
					}else if(datos.getEdad() >= 33 && datos.getEdad() < 75 ){
						return "Clasica, OfficeDepot";
					}else{
						return "no aplica";
					}

				}else if(datos.getSalario() >= 15000 && datos.getSalario() < 35000){
					if(datos.getEdad() >= 18 && datos.getEdad() < 23 ){
						return "BSmart, AffinityCard";
					}else if(datos.getEdad() >= 24 && datos.getEdad() < 32 ){
						return "Oro, BSmart, AffinityCard, Clasica, Office Depot, Costco";
					}else if(datos.getEdad() >= 33 && datos.getEdad() < 75 ){
						return "Oro, BSmart, Clasica, Office Depot, Costco";
					}else{
						return "no aplica";
					}

				}else if (datos.getSalario() >= 35000 && datos.getSalario() < 50000){
					if(datos.getEdad() >= 18 && datos.getEdad() < 23 ){
						return "Oro, BSmart, AffinityCard, Clasica, Office Depot, Costco";
					}else if(datos.getEdad() >= 24 && datos.getEdad() < 75 ){
						return "Platinum";
					}else{
						return "no aplica";
					}

				}else if(datos.getSalario() >= 50000){
					if(datos.getEdad() >= 18 && datos.getEdad() < 23 ){
						return "Oro, BSmart, AffinityCard, Clasica, Office Depot, Costco";
					}else if(datos.getEdad() >= 24 && datos.getEdad() < 75 ){
						return "Oro, BSmart, AffinityCard, Clasica, Office Depot, Costco";
					}else{
						return "no aplica";
					}

				}else{
					return "no aplica";
				}
			case "travels": 
				if(datos.getSalario() >= 12000 && datos.getSalario() < 30000) {
					if(datos.getEdad() >= 18 && datos.getEdad() < 75 ){
						return "Oro, BSmart, AffinityCard, Clasica, Office Depot, Costco";
					}else{
						return "No aplica";
					}
				}else if(datos.getSalario() >= 30000 && datos.getSalario() < 35000){
					if(datos.getEdad() >= 18 && datos.getEdad() < 24){
						return "Oro, BSmart, AffinityCard, Clasica, Office Depot, Costco";
					}else if(datos.getEdad() >= 24 && datos.getEdad() < 75){
						return "Oro, BSmart, AffinityCard, Clasica, Office Depot, Costco";
					}else{
						return "No aplica";
					}
				}
				else if(datos.getSalario() >= 35000 && datos.getSalario() < 50000 ){
					if(datos.getEdad() >= 18 && datos.getEdad() < 24){
						return "Oro, BSmart, AffinityCard, Clasica, Office Depot, Costco";
					}else if(datos.getEdad() >= 24 && datos.getEdad() < 75){
						return "Oro, BSmart, AffinityCard, Clasica, Office Depot, Costco";
					}else{
						return "No aplica";
					}
				}
				else if(datos.getSalario() >= 50000){
					if(datos.getEdad() >= 18 && datos.getEdad() < 24){
						return "Oro, BSmart, AffinityCard, Clasica, Office Depot, Costco";
					}else if(datos.getEdad() >= 24 && datos.getEdad() < 75){
						return "Oro, BSmart, AffinityCard, Clasica, Office Depot, Costco";
					}else{
						return "No aplica";
					}
				}
				else{
					return "no aplica";
				}
			case "help": 
				if(datos.getSalario() >= 12000 && datos.getEdad() >= 18 && datos.getEdad() < 75 ){
					return "Oro, BSmart, AffinityCard, Clasica, Office Depot, Costco";
				}else{
					return "no aplica";
				}
			case "business": 
				if(datos.getSalario() >= 7000 && datos.getEdad() >= 18 && datos.getEdad() < 75 ){
					return "Oro, BSmart, AffinityCard, Clasica, Office Depot, Costco";
				}else{
					return "no aplica";
				}
			case "sport": 
				if(datos.getSalario() >= 7000 && datos.getSalario() < 35000){
					if(datos.getEdad() >= 18 && datos.getEdad() < 75 ){
						return "Oro, BSmart, AffinityCard, Clasica, Office Depot, Costco";
					}
				}else if(datos.getSalario() >= 35000 ){
					if(datos.getEdad() >= 18 && datos.getEdad() < 75 ){
						return "Oro, BSmart, AffinityCard, Clasica, Office Depot, Costco";
					}
				}else{
					return "no aplica";
				}
			case "style": 
			if(datos.getSalario() >= 7000 && datos.getSalario() < 15000){
				if(datos.getEdad() >= 18 && datos.getEdad() < 32 ){
					return "Oro, BSmart, AffinityCard, Clasica, Office Depot, Costco";
				}else if(datos.getEdad() >= 33 && datos.getEdad() < 75 ){
					return "Oro, BSmart, AffinityCard, Clasica, Office Depot, Costco";
				}else{
					return "no aplica";
				}

			}else if(datos.getSalario() >= 15000 && datos.getSalario() < 30000){
				if(datos.getEdad() >= 18 && datos.getEdad() < 23 ){
					return "Oro, BSmart, AffinityCard, Clasica, Office Depot, Costco";
				}else if(datos.getEdad() >= 24 && datos.getEdad() < 32 ){
					return "Oro, BSmart, AffinityCard, Clasica, Office Depot, Costco";
				}else if(datos.getEdad() >= 33 && datos.getEdad() < 75 ){
					return "Oro, BSmart, AffinityCard, Clasica, Office Depot, Costco";
				}else{
					return "no aplica";
				}

			}else if (datos.getSalario() >= 30000 && datos.getSalario() < 35000){
				if(datos.getEdad() >= 18 && datos.getEdad() < 23 ){
					return "Oro, BSmart, AffinityCard, Clasica, Office Depot, Costco";
				}else if(datos.getEdad() >= 24 && datos.getEdad() < 32 ){
					return "Oro, BSmart, AffinityCard, Clasica, Office Depot, Costco";
				}else if(datos.getEdad() >= 33 && datos.getEdad() < 75 ){
					return "Oro, BSmart, AffinityCard, Clasica, Office Depot, Costco";
				}else{
					return "no aplica";
				}

			}else if(datos.getSalario() >= 50000){
				if(datos.getEdad() >= 18 && datos.getEdad() < 23 ){
					return "Oro, BSmart, AffinityCard, Clasica, Office Depot, Costco";
				}else if(datos.getEdad() >= 24 && datos.getEdad() < 75 ){
					return "Oro, BSmart, AffinityCard, Clasica, Office Depot, Costco";
				}else{
					return "no aplica";
				}

			}else{
				return "no aplica";
			}
		}

		return "Hola mundo";
    }

}
