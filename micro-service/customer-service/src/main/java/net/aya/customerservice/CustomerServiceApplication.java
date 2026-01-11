package net.aya.customerservice;

import net.aya.customerservice.entities.Customer;
import net.aya.customerservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository) {
        return args -> {
            customerRepository.save(Customer.builder()
                    .name("elabbassi").email("elabbassi@gmail.com")
                    .build());
            customerRepository.save(Customer.builder()
                    .name("Hajar").email("hajar@gmail.com")
                    .build());
            customerRepository.save(Customer.builder()
                    .name("ilyass").email("ilyass@gmail.com")
                    .build());
            customerRepository.findAll().forEach(c -> {

                System.out.println(c.getId());
                System.out.println(c.getName());
                System.out.println(c.getEmail());
            });
        };
    }
}
