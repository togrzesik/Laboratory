package pl.edu.pwsztar.domain.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="pracownik")
public class Pracownik implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pracownika")
    private Integer id_pracownika;
    @Column(name = "imie")
    private String imie;
    @Column(name = "nazwisko")
    private String nazwisko;
    @Column(name = "data_urodzenia")
    private Integer data_urodzenia;
    @Column(name = "stanowisko")
    private String stanowisko;

    public Pracownik() {
    }


    public Integer getId_pracownika() {
        return id_pracownika;
    }

    public void setId_pracownika(Integer id_pracownika) {
        this.id_pracownika = id_pracownika;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Integer getData_urodzenia() {
        return data_urodzenia;
    }

    public void setData_urodzenia(Integer data_urodzenia) {
        this.data_urodzenia = data_urodzenia;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }
}
