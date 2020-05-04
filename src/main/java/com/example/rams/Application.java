package com.example.rams;

import com.example.rams.DAO.DemographicDataRepository;
import com.example.rams.DAO.ElectionDataRespository;
import com.example.rams.Entities.DemographicData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	@Autowired
	ElectionDataRespository electionRepo;

	@Autowired
	DemographicDataRepository demographicDataRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			DemographicData PADemographicData = new DemographicData(5420000, 11,12,13,14,15,16,17,18,19);

			DemographicData PADistrict1DemographicData = new DemographicData(54460000, 1,12,13,14,15,16,17,18,19);
			DemographicData PADistrict2DemographicData = new DemographicData(99460000, 1,12,13,14,15,16,17,18,19);

			DemographicData PAPrecinct1DemographicData = new DemographicData(12340000, 1,12,13,14,15,16,17,18,19);
			DemographicData PAPrecinct2DemographicData = new DemographicData(67890000, 1,12,13,14,15,16,17,18,19);

			demographicDataRepository.save(PADistrict1DemographicData);
			demographicDataRepository.save(PADistrict2DemographicData);
			demographicDataRepository.save(PAPrecinct1DemographicData);
			demographicDataRepository.save(PAPrecinct2DemographicData);


		};
	}


}
