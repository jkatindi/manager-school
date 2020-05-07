package org.katindi.sc;

import java.util.List;

import org.katindi.sc.model.Cours;
import org.katindi.sc.model.CoursSession;
import org.katindi.sc.service.ServiceCours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsCoursApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCoursApplication.class, args);
	}



}
