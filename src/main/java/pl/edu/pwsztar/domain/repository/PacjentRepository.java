package pl.edu.pwsztar.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.edu.pwsztar.domain.entity.Pacjent;

import java.util.List;

@Repository
public interface PacjentRepository extends JpaRepository<Pacjent, Integer>, CrudRepository<Pacjent, Integer> {

        @Query(value = "SELECT * FROM pacjent p WHERE p.product_id = :productId ", nativeQuery = true)
        List<Pacjent> getRequiredClientDetails(@Param("id_pacjenta") Integer id_pacjenta);

}
