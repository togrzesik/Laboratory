package pl.edu.pwsztar.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.edu.pwsztar.domain.entity.Wyniki;

import java.util.List;

@Repository
public interface WynikiRepository extends JpaRepository<Wyniki, Integer>, CrudRepository<Wyniki, Integer> {

    @Query(value = "SELECT * FROM wyniki w WHERE w.id_wynikow = :id_wynikow ", nativeQuery = true)
    List<Wyniki> getResultDetails(@Param("id_wynikow") Integer id_wynikow);
}
