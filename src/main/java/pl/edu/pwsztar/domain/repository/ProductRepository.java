package pl.edu.pwsztar.domain.repository;

        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.repository.CrudRepository;
        import org.springframework.stereotype.Repository;
        import pl.edu.pwsztar.domain.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>, CrudRepository<Product, Long> {

}
