package pl.edu.pwsztar.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.edu.pwsztar.domain.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>, CrudRepository<Product, Long> {

        @Query(value = "SELECT * FROM Product p WHERE p.product_id = :productId ", nativeQuery = true)
        Product getRequiredProductDetails(@Param("productId") Long productId);

        @Query(value = "SELECT * FROM Product p WHERE p.barcode LIKE(:barcode) ", nativeQuery = true)
        Product getProductFromBarcode(@Param("barcode") String barcode);
}
