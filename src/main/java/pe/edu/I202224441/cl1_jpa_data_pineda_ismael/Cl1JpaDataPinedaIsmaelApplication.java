package pe.edu.I202224441.cl1_jpa_data_pineda_ismael;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.I202224441.cl1_jpa_data_pineda_ismael.repository.CountryRepository;

@SpringBootApplication
public class Cl1JpaDataPinedaIsmaelApplication implements CommandLineRunner {

	@Autowired
	CountryRepository countryRepository;

	public static void main(String[] args) {
		SpringApplication.run(Cl1JpaDataPinedaIsmaelApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {




	}
}
