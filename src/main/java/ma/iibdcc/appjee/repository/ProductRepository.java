package ma.iibdcc.appjee.repository;

import ma.iibdcc.appjee.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
