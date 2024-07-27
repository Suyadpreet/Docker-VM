package com.suyad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerVmApplication
{
	public static void main(String[] args) 
	{
		SpringApplication.run(DockerVmApplication.class, args);
		System.out.println("Docker VM appplication has been started Successfully.......");
	}

}
