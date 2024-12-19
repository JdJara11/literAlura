package com.alura.literAlura;


import com.alura.literAlura.main.App;
import com.alura.literAlura.repository.AutorRepo;
import com.alura.literAlura.repository.LibrosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiterAluraApplication implements CommandLineRunner{

	@Autowired
	private LibrosRepo librosRepo;

	@Autowired
	private AutorRepo autorRepo;

	public static void main(String[] args) {
		SpringApplication.run(LiterAluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		App app = new App(librosRepo, autorRepo);
		app.iniciarPrograma();
	}
}
