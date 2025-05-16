package ma.iibdcc.appjee;

import ma.iibdcc.appjee.entities.Product;
import ma.iibdcc.appjee.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class AppJeeApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppJeeApplication.class, args);
    }

    @Bean
    public CommandLineRunner init(ProductRepository productRepository) {
        return args -> {
            productRepository.save(Product.builder()
                        .name("Printer")
                        .price(3500.00)
                        .quantity(15)
                    .build());
            productRepository.save(Product.builder()
                        .name("Computer")
                        .price(1400.00)
                        .quantity(20)
                    .build());
            productRepository.save(Product.builder()
                        .name("Smartphone")
                        .price(9000.00)
                        .quantity(33)
                    .build());
            productRepository.findAll().forEach(p->{
                System.out.println(p.toString());
            });
        };
    }
}
