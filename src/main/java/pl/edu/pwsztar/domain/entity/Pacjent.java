package pl.edu.pwsztar.domain.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pacjent")
public class Pacjent implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pacjenta")
    private Integer id_pacjenta;
    @Column(name = "imie")
    private String imie;
    @Column(name = "nazwisko")
    private String nazwisko;
    @Column(name = "data_urodzenia")
    private Integer data_urodzenia;
    @Column(name = "nr_telefonu")
    private String nr_telefonu;
    @Column(name = "pesel")
    private String pesel;

    public Pacjent(){

    }

    public Integer getId_pacjenta() {
        return id_pacjenta;
    }

    public void setId_pacjenta(Integer id_pacjenta) {
        this.id_pacjenta = id_pacjenta;
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

    public String getNr_telefonu() {
        return nr_telefonu;
    }

    public void setNr_telefonu(String nr_telefonu) {
        this.nr_telefonu = nr_telefonu;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
}
