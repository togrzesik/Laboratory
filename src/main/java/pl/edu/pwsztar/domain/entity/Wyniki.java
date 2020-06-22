package pl.edu.pwsztar.domain.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="wyniki")
public class Wyniki implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_wynikow")
    private Integer id_wynikow;
    @Column(name = "choroby")
    private String choroby;
    @Column(name = "pracownik_id")
    private Integer pracownik_id;
    @Column(name = "pacjent_id")
    private Integer pacjent_id;

    public Wyniki() {
    }

    public Integer getId_wynikow() {
        return id_wynikow;
    }

    public void setId_wynikow(Integer id_wynikow) {
        this.id_wynikow = id_wynikow;
    }

    public String getChoroby() {
        return choroby;
    }

    public void setChoroby(String choroby) {
        this.choroby = choroby;
    }

    public Integer getPracownik_id() {
        return pracownik_id;
    }

    public void setPracownik_id(Integer pracownik_id) {
        this.pracownik_id = pracownik_id;
    }

    public Integer getPacjent_id() {
        return pacjent_id;
    }

    public void setPacjent_id(Integer pacjent_id) {
        this.pacjent_id = pacjent_id;
    }
}
