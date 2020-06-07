package pl.edu.pwsztar.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.edu.pwsztar.domain.entity.RecepieProducts;

import java.util.List;

@Repository
public interface RecepieProductsRepository extends JpaRepository<RecepieProducts, Long>, CrudRepository<RecepieProducts, Long> {

    @Query(value = "SELECT * FROM Recepie_products rp WHERE rp.recepie_id = :recepieId ", nativeQuery = true)
    List<RecepieProducts> getProductsRequiredForRecepie(@Param("recepieId") Long recepieId);
}
