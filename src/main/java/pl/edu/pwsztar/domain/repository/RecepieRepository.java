package pl.edu.pwsztar.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.edu.pwsztar.domain.entity.Recepie;

@Repository
public interface RecepieRepository extends JpaRepository<Recepie, Long>, CrudRepository<Recepie, Long> {

    @Query(value = "SELECT * FROM Recepie rp WHERE rp.recepie_id = :recepieId ", nativeQuery = true)
    Recepie getRecepieDetails(@Param("recepieId") Long recepieId);
}
