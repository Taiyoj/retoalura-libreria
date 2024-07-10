package com.alura.reto_literatura_alura;
import com.alura.reto_literatura_alura.Principal.Libreria;
import com.alura.reto_literatura_alura.repository.iAutorRepository;
import com.alura.reto_literatura_alura.repository.iLibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Challenge2BackLiteraturaApplicationConsola implements CommandLineRunner {

	@Autowired
	private iLibroRepository libroRepository;
	@Autowired
	private iAutorRepository autorRepository;

	public static void main(String[] args) {
		SpringApplication.run(Challenge2BackLiteraturaApplicationConsola.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Libreria libreria = new Libreria(libroRepository, autorRepository);
		libreria.consumo();

	}
}
