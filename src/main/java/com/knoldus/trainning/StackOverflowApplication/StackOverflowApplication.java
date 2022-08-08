package com.knoldus.trainning.StackOverflowApplication;

import com.knoldus.trainning.StackOverflowApplication.configuration.VaultConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class StackOverflowApplication {
  public static void main(String[] args) {
    SpringApplication.run(StackOverflowApplication.class, args);
//    ConfigurableApplicationContext context = SpringApplication.run(StackOverflowApplication.class, args);
//    VaultConfiguration vaultConfigurations = context.getBean(VaultConfiguration.class);
////    System.out.println("Login: " + vaultConfiguration.getLogin());
//    System.out.println("Password: " + vaultConfigurations.getPassword());
////    String s1 = vaultConfiguration.getLogin();
//    String s2 = vaultConfigurations.getPassword();
////    System.out.println(s1);
//    System.out.println(s2);
  }
}
