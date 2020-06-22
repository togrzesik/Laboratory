package pl.edu.pwsztar.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.edu.pwsztar.domain.entity.Pracownik;

import java.util.List;

@Repository
public interface PracownikRepository extends JpaRepository<Pracownik, Integer>, CrudRepository<Pracownik, Integer> {

    @Query(value = "SELECT * FROM pracownik rp WHERE rp.id_pracownika = :id_pracownika ", nativeQuery = true)
    List<Pracownik> getRequiredWorkerDetails(@Param("id_pracownika") Integer id_pracownika);
}
