package com.example.Teamazure.Teamazure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TeamazureApplication {
	@GetMapping("/azure")
	public String message() {
//		String a = "The  Sample Code is Build And Deployed Successfully in MicrosoftAzure";
//		
//		String BoldOn = "ESC" + "E" + "\u0001";
//		String BoldOff ="ESC" + "E" + "\0";
//		String c=(BoldOn + a + BoldOff);
//		System.out.print("\033[0;1m" + a);
		return"Azure Web Apps Service - Build & Deployed Successfully using Azure Pipeline" ;
//	
		//return "\"\\u001B[1m I am bold\"A Sample Code is Build And Deployed Successfully In MicrososftAZure";
				
				//"The main aim of the project is to deploy the same code in GCP and Azure platform."
//				+ " Microsoft Azure(Maha & Jayanthi): "
//				
//				+ " Microsoft Azure is a public cloud computing platform—with solutions including Infrastructure as a Service (IaaS), Platform as a Service (PaaS), and Software as a Service (SaaS) that can be used for services such as analytics, virtual computing, storage and networking ."
//				+ " These services and resources include storing your data and transforming it, depending on your requirements."
//				+ " Google Cloud Platform(Kiruba & Juju):"
//				+ " Google Cloud Platform is a suite of public cloud computing services offered by Google."
//				+ " The platform includes a range of hosted services for compute, storage and application development that run on Google hardware.";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TeamazureApplication.class, args);
	}

}
