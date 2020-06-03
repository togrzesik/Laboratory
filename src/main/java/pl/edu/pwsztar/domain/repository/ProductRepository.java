package pl.edu.pwsztar.domain.repository;

        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.jpa.repository.Query;
        import org.springframework.data.repository.CrudRepository;
        import org.springframework.data.repository.query.Param;
        import org.springframework.stereotype.Repository;
        import pl.edu.pwsztar.domain.entity.Product;
        import pl.edu.pwsztar.domain.entity.RecepieProducts;

        import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>, CrudRepository<Product, Long> {
        @Query(value = "SELECT * FROM Products p WHERE p.product_id = :productId ", nativeQuery = true)
        Product getRequiredProductDetails(@Param("productId") Long productId);
}
