package edu.icet.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Configuration
public class config {

 @Bean
 public ModelMapper  getModelMapper(){
     return new ModelMapper();
 }

 @Bean
 public RestTemplate getrestController(){
     return new RestTemplate();
 }
}
